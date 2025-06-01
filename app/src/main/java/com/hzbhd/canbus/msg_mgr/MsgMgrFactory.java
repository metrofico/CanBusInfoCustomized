package com.hzbhd.canbus.msg_mgr;

import android.content.Context;

import com.hzbhd.canbus.interfaces.MsgMgrInterface;

public class MsgMgrFactory {
    private static final String TAG = "MsgMgrFactory";
    public static MsgMgrInterfaceUtil mMsgMgrInterface;


    public static MsgMgrInterfaceUtil getCanMsgMgrUtil(Context context) {
        MsgMgrInterfaceUtil msgMgrInterfaceUtil;
        synchronized (MsgMgrFactory.class) {
            if (mMsgMgrInterface == null) {
                mMsgMgrInterface = new MsgMgrInterfaceUtil(context);
            }
            msgMgrInterfaceUtil = mMsgMgrInterface;
        }
        return msgMgrInterfaceUtil;
    }

    public static void setThisNull() {
        mMsgMgrInterface = null;
    }
}