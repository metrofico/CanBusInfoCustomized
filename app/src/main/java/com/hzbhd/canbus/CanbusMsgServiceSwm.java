package com.hzbhd.canbus;

import static com.hzbhd.proxy.mcu.core.MCUMainManager.TAG;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import androidx.annotation.Nullable;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.canbus.config.CanbusConfig;
import com.hzbhd.canbus.interfaces.MsgMgrInterface;
import com.hzbhd.canbus.msg_mgr.MsgMgrFactory;
import com.hzbhd.canbus.util.ContextUtil;
import com.hzbhd.canbus.util.SharePreUtil;
import com.hzbhd.cantype.CanTypeUtil;
import com.hzbhd.proxy.mcu.core.IMCUCanBoxControlListener;
import com.hzbhd.proxy.mcu.core.MCUMainManager;

import java.util.ArrayList;

public class CanbusMsgServiceSwm extends Service {

    private final Handler mHandler;

    private HandlerThread mHandlerThread;

    public CanbusMsgServiceSwm() {
        mHandlerThread = new HandlerThread("hzbhd.canbusinfo.msgservice");
        mHandlerThread.start();
        mHandler = new InternalHandler(mHandlerThread.getLooper());
    }

    private final IMCUCanBoxControlListener mCanBoxControlListener = new IMCUCanBoxControlListener() {
        @Override
        public void notifyCanboxData(int var1, byte[] var2) {

        }

        @Override
        public void onMcuConn() {
            Log.d("CAN_STATE", "onMcuConn");
            Message var1 = new Message();
            var1.what = 3;
            mHandler.sendMessage(var1);
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ContextUtil.getInstance().setContext(this);
        //CanbusInfoChangeListener.getInstance();
        Log.i(TAG, "onCreate: branches/hy");
        //this.mCanbusTimeReceiver = new DateTimeReceiver();
        //IntentFilter intentFilter = new IntentFilter();
        //intentFilter.addAction("android.intent.action.TIME_TICK");
        //intentFilter.addAction("android.intent.action.TIME_SET");
        //getBaseContext().registerReceiver(this.mCanbusTimeReceiver, intentFilter);
        //SpeechReceiver speechReceiver = new SpeechReceiver();
        //this.mSpeechReceiver = speechReceiver;
        //speechReceiver.registerReceiver(this);
        if (isDataBaseReady()) {
            normalProgress(CanbusConfig.INSTANCE.getCanType());
            getMsgMgrInterface().initCommand(this);
        }
        registerCanboxListener();
        // MediaShareData.INSTANCE.registerModuleListener(this);
        //  ActionControlUtil.registerHotKeyListener(this);
        //registerAccStateListener();
    }

    private void registerCanboxListener() {
        MCUMainManager.getInstance().registerMCUCanboxListener(this.mCanBoxControlListener);
    }

    private void unRegisterCanboxListener() {
        MCUMainManager.getInstance().unregisterMCUCanboxListener(this.mCanBoxControlListener);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
        unRegisterCanboxListener();
        if (getMsgMgrInterface() != null) {
            getMsgMgrInterface().destroyCommand();
        }

    }

    private boolean isDataBaseReady() {
        int var1 = Integer.parseInt(SharePreUtil.getStringValue(this, "share_pre_last_version_code", "0"));
        Log.d(TAG, "isDataBaseReady -> lastVersionCode:" + var1);
        if (var1 <= 2024031119) {
            SharePreUtil.setStringValue(this, "share_pre_last_version_code", String.valueOf(2024031119));
        }
        return true;
    }

    private CanTypeAllEntity getDbCanTypeAllEntity(int canTypeId) {
        ArrayList<CanTypeAllEntity> lista = CanTypeUtil.INSTANCE.getCanType(canTypeId).getList();

        if (lista == null || lista.isEmpty()) {
            Log.i(TAG, "getDbCanTypeAllEntity: canTypeId: " + canTypeId);
            //CanbusConfig.INSTANCE.setCanType(0);
            return getDbCanTypeAllEntity(0);
        } else {
            int selectedPosition = CanbusConfig.INSTANCE.getSelectCarPosition();
            //LogUtil.showLog("getDbCanTypeAllEntity selectPosition: " + selectedPosition);
            return selectedPosition < lista.size() ? lista.get(selectedPosition) : lista.get(0);
        }
    }

    private void normalProgress(int canTypeId) {
        Log.d(TAG, "normalProgress -> canType: " + canTypeId);

        CanTypeAllEntity entity = getDbCanTypeAllEntity(canTypeId);

        if (entity == null) {
            Log.d(TAG, "normalProgress entity == null");
        } else {
            Log.d(TAG, "CanbusMsgService, current can type: [" + entity.getCar_model() + "] [" + entity.getCan_type_id() + "] isShowApp:[" + entity.getIs_show_app() + "] is_use_new_camera:[" + entity.getIs_use_new_camera() + "] is_use_new_app:[" + entity.getIs_use_new_app() + "]");

            boolean isUseNewApp = entity.getIs_use_new_app() == 1;
            SharePreUtil.setBoolValue(this, "share_pre_is_use_new_app", isUseNewApp);
            // Notificar al MsgMgrInterface
            MsgMgrInterface mgr = getMsgMgrInterface();
            if (mgr != null) {
                mgr.afterServiceNormalSetting(this);
            }
        }
    }

    public void canbusInfoChange(byte[] bArr) {

    }

    private MsgMgrInterface getMsgMgrInterface() {
        return MsgMgrFactory.getCanMsgMgrUtil(this);
    }

    public void serialDataChange(byte[] var1) {
        if (var1 != null && var1.length > 1 && this.getMsgMgrInterface() != null) {
            this.getMsgMgrInterface().serialDataChange(this, var1);
        }

    }

    private class InternalHandler extends Handler {
        MsgMgrInterface msgMgrInterface;

        public InternalHandler(Looper looper) {
            super(looper);
            msgMgrInterface = getMsgMgrInterface();
        }

        @Override
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    canbusInfoChange((byte[]) message.obj);
                    break;

                case 2:
                    // Aquí puedes implementar algo usando message.arg1 si es necesario
                    int value = message.arg1;
                    break;

                case 3:
                    if (msgMgrInterface != null) {
                        Log.d("CAN_STATE", "Time to shake hands");
                        msgMgrInterface.onHandshake(CanbusMsgServiceSwm.this);
                    }
                    break;

                case 4:
                    serialDataChange((byte[]) message.obj);
                    break;

                case 5:
                    if (msgMgrInterface != null) {
                        Log.d("Lin_Bus", "Lin bus data change");
                        // msgMgrInterface.linInfoChange(CanbusMsgService.this, (byte[]) message.obj);
                    }
                    break;

                case 6:
                    if (msgMgrInterface != null) {
                        Log.d("MedianCalibration", "Median calibration data change!");
                        //msgMgrInterface.medianCalibration(CanbusMsgService.this, (byte[]) message.obj);
                    }
                    break;

                case 7:
                    if (msgMgrInterface != null) {
                        msgMgrInterface.mcuErrorState(CanbusMsgServiceSwm.this, (byte[]) message.obj);
                    }
                    break;

                default:
                    // Mensaje no manejado
                    break;
            }
        }
    }
}
