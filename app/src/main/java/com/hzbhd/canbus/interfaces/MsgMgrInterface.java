package com.hzbhd.canbus.interfaces;

import android.content.Context;
import android.os.Bundle;

public interface MsgMgrInterface {
    void aMapCallBack(Bundle var1);

    void afterServiceNormalSetting(Context var1);


    void canbusInfoChange(Context var1, byte[] var2);


    boolean customLongClick(Context var1, int var2);

    boolean customShortClick(Context var1, int var2);


    void destroyCommand();


    default MsgMgrInterface getInstance() {
        return this;
    }

    void initCommand(Context var1);

    void mcuErrorState(Context var1, byte[] var2);


    void onAccOff();

    void onAccOn();

    void onHandshake(Context var1);

    void onKeyEvent(int var1, int var2, int var3, Bundle var4);

    void onPowerOff();

    void onSleep();


    void serialDataChange(Context var1, byte[] var2);


    void sourceSwitchChange(String var1);

}

