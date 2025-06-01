package com.hzbhd.canbus.car.swm;

import android.os.Bundle;

import com.hzbhd.canbus.CanbusMsgSender;
import com.hzbhd.canbus.msg_mgr.AbstractMsgMgr;

public class MsgMgr extends AbstractMsgMgr {
    @Override
    public void onKeyEvent(int var1, int var2, int var3, Bundle var4) {
        CanbusMsgSender.sendMsg(new byte[]{22, -3, 1, 0});
    }
}
