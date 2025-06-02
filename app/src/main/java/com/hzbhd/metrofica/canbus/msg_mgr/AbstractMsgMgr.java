package com.hzbhd.metrofica.canbus.msg_mgr;

import android.content.Context;
import android.os.Bundle;

import com.hzbhd.metrofica.canbus.interfaces.MsgMgrInterface;

public class AbstractMsgMgr implements MsgMgrInterface {
    @Override
    public void aMapCallBack(Bundle var1) {

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

    }

    @Override
    public void sourceSwitchChange(String var1) {

    }
}
