package com.hzbhd.proxy.mcu.core;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

import com.hzbhd.commontools.SourceConstantsDef;
import com.hzbhd.proxy.mcu.aidl.IMCUCanBoxControlCallback;
import com.hzbhd.proxy.mcu.aidl.IMCUMainService;
import com.hzbhd.proxy.mcu.aidl.IMCUMsgCallback;
import com.hzbhd.proxy.mcu.constant.MCU_MESSAGE_PEER;
import com.hzbhd.proxy.mcu.utils.MCUParseUtil;
import com.hzbhd.systemstatus.proxy.IServiceConnectListener;
import com.hzbhd.systemstatus.proxy.ServiceStateManager;

import java.util.HashSet;
import java.util.Set;

public class MCUMainManager implements IMCUMainManager {
    public static String TAG = "CanBusCustomized";
    private static MCUMainManager instance;
    private IMCUMainService mMCUMainService;
    private final Set<IMCUMainListener> mMCUMainList = new HashSet<>();
    private final HashSet<IMCUCanBoxControlListener> mMCUCanList = new HashSet<>();
    private final IMCUCanBoxControlCallback mMCUCanBoxControlCallback = new CanBoxControlCallback(this);

    public class CanBoxControlCallback extends IMCUCanBoxControlCallback.Stub {

        MCUMainManager mMCUMainManager;

        public CanBoxControlCallback(MCUMainManager mMCUMainManager) {
            this.mMCUMainManager = mMCUMainManager;
        }

        @Override
        public void notifyCanboxData(int cmd, byte[] data) throws RemoteException {
            for (IMCUCanBoxControlListener listener : mMCUCanList) {
                listener.notifyCanboxData(cmd, data);
            }
        }
    }

    public static MCUMainManager getInstance() {
        if (instance == null) {
            instance = new MCUMainManager();
        }
        return instance;
    }

    @Override
    public void clearMessage(MCU_MESSAGE_PEER mcu_message_peer) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.clearMessage(mcu_message_peer.ordinal());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void closeDevice() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.closeDevice();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getCarBackState() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                return mCUMainService.getCarBackState();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public int getHardwareReset() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                return mCUMainService.getHardwareReset();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public int getMcuhardware() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                return mCUMainService.getMcuHardware();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public int getPowerOnType() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                return mCUMainService.getPowerOnType();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public int getPowerStatus() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                return mCUMainService.getPowerStatus();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public byte getProcotolVersion() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                return mCUMainService.getProcotolVersion();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return (byte) 0;
    }

    @Override
    public void getVersion() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.getVersion();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private void onServiceConn() {
        ServiceStateManager.getInstance().registerConnectListener(SourceConstantsDef.MODULE_ID.MCU.ordinal(), new IServiceConnectListener() {
            @Override
            public void onConnected() {
                IMCUMainService mCUMainService = getMCUMainService();
                if (mCUMainService != null) {
                    try {
                        mCUMainService.registerMCUCanboxCallback(mMCUCanBoxControlCallback);
                        Log.d(TAG, "onConnected() called OK");
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
    }

    public IMCUMainService getMCUMainService() {
        IMCUMainService service = IMCUMainService.Stub.asInterface(MCUParseUtil.ServiceManagerGetService("bhd.mcu.service"));
        if (this.mMCUMainService == null) {
            this.mMCUMainService = service;
            onServiceConn();
        }
        return service;
    }

    @Override
    public Bundle initMCU() {
        Log.d(TAG, "initMCU() called");
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                return mCUMainService.initMCU();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else {
            Log.d(TAG, "initMCU() called mMCUMainService == null");
        }
        return null;
    }


    @Override
    public void initSystemReady() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.initSystemReady();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean isInitMCU() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                return mCUMainService.isInitMCU();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public void registerMCUCanboxListener(IMCUCanBoxControlListener iMCUCanBoxControlListener) {
        if (!this.mMCUCanList.contains(iMCUCanBoxControlListener)) {
            this.mMCUCanList.add(iMCUCanBoxControlListener);
        }
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.registerMCUCanboxCallback(this.mMCUCanBoxControlCallback);
                iMCUCanBoxControlListener.onMcuConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void registerMCUMainListener(IMCUMainListener iMCUMainListener) {
        this.mMCUMainList.add(iMCUMainListener);
    }

    @Override
    public void registerMcuMsgListener(IMCUMsgCallback iMCUMsgCallback) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.registerMcuMsgListener(iMCUMsgCallback);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void requestPowerStatus(int i) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.requestPowerStatus(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void sendMCUCanboxData(int i, byte[] bArr) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.sendMCUCanboxData(i, bArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void sendMCUDebugData(byte[] bArr) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.sendMCUDebugData(bArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void sendTestCmd(byte[] bArr) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.sendTestCmd(bArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setSendSleepStatus(boolean z) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.setSendSleepStatus(z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setUpgradeStatus(boolean z) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.setUpgradeStatus(z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void startSendHeartBeatMsg() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.startSendHeartBeatMsg();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopSendHeartBeatMsg() {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.stopSendHeartBeatMsg();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void unRegisterMCUMainListener(IMCUMainListener iMCUMainListener) {
        if (this.mMCUMainList.contains(iMCUMainListener)) {
            this.mMCUMainList.remove(iMCUMainListener);
        }
    }

    @Override
    public void unregisterMCUCanboxListener(IMCUCanBoxControlListener iMCUCanBoxControlListener) {
        if (this.mMCUCanList.contains(iMCUCanBoxControlListener)) {
            this.mMCUCanList.remove(iMCUCanBoxControlListener);
        }
        if (this.mMCUCanList.isEmpty()) {
            try {
                IMCUMainService mCUMainService = getMCUMainService();
                if (mCUMainService != null) {
                    mCUMainService.unregisterMCUCanboxCallback(this.mMCUCanBoxControlCallback);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void unregisterMcuMsgListener(IMCUMsgCallback iMCUMsgCallback) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                mCUMainService.unregisterMcuMsgListener(iMCUMsgCallback);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public byte[] updateFlashData(byte[] bArr) {
        IMCUMainService mCUMainService = getMCUMainService();
        if (mCUMainService != null) {
            try {
                return mCUMainService.updateFlashData(bArr);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void init() {

    }
}