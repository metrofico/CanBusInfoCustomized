package com.hzbhd.systemstatus.proxy;

import com.hzbhd.proxy.mcu.utils.MCUParseUtil;
import com.hzbhd.systemstatus.proxy.aidl.ISystemStatusManager;

public class SystemStatusManager {
    public static final String SERVICE_NAME_SYSTEM_STATUS = "hzbhd_SystemStatusService";
    private static final String TAG = "SystemStatusManager";

    protected static ISystemStatusManager getISystemStatusManager() {

        return ISystemStatusManager.Stub.asInterface(MCUParseUtil.ServiceManagerGetService(SERVICE_NAME_SYSTEM_STATUS));
    }
}
