package com.hzbhd.canbus.msg_mgr;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.hzbhd.log.LoggerUI;
import com.hzbhd.canbus.car.swm.MsgMgr;
import com.hzbhd.canbus.interfaces.MsgMgrInterface;

public class MsgMgrInterfaceUtil implements MsgMgrInterface {

    private MsgMgrInterface mMsgMgrInterface;
    private final Context context;

    public MsgMgrInterfaceUtil(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context no puede ser null");
        }
        this.context = context;
        this.mMsgMgrInterface = getMMsgMgrInterface();
    }

    private MsgMgrInterface getMMsgMgrInterface() {
        if (mMsgMgrInterface == null) {
            try {
                mMsgMgrInterface = new MsgMgr();

                Log.d("MsgMgrInterfaceUtil", "");
            } catch (Exception e) {
                Log.e("MsgMgrInterfaceUtil", "Error al cargar MsgMgr dinámicamente: " + e.getMessage());
                e.printStackTrace();
                mMsgMgrInterface = null;
            }
        }
        return mMsgMgrInterface;
    }

    @Override
    public void aMapCallBack(Bundle bundle) {
        try {
            MsgMgrInterface mMsgMgrInterface = getMMsgMgrInterface();
            if (mMsgMgrInterface != null) {
                mMsgMgrInterface.aMapCallBack(bundle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void afterServiceNormalSetting(Context var1) {

    }

    @Override
    public void canbusInfoChange(Context var1, byte[] var2) {

    }

    @Override
    public boolean customLongClick(Context var1, int var2) {
        return false;
    }

    @Override
    public boolean customShortClick(Context var1, int var2) {
        return false;
    }

    @Override
    public void destroyCommand() {

    }

    @Override
    public void initCommand(Context var1) {

        LoggerUI.d("MsgMgrInterfaceUtil", "initCommand");
    }

    @Override
    public void mcuErrorState(Context var1, byte[] var2) {

    }

    @Override
    public void onAccOff() {

    }

    @Override
    public void onAccOn() {

    }

    @Override
    public void onHandshake(Context var1) {

    }

    @Override
    public void onKeyEvent(int var1, int var2, int var3, Bundle var4) {

    }

    @Override
    public void onPowerOff() {

    }

    @Override
    public void onSleep() {

    }

    @Override
    public void serialDataChange(Context var1, byte[] var2) {
        LoggerUI.d("MsgMgrInterfaceUtil", "serialDataChange bytes");
    }

    @Override
    public void sourceSwitchChange(String var1) {

    }
}
