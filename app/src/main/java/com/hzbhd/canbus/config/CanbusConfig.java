package com.hzbhd.canbus.config;


import com.hzbhd.config.use.CanBus;

public final class CanbusConfig {
    public static final CanbusConfig INSTANCE = new CanbusConfig();
    private static final String TAG = "CanbusConfig";

    private CanbusConfig() {
    }

    public final int getSelectCarPosition() {
        return CanBus.INSTANCE.getSelectCarPosition();
    }

    public final int getCanType() {
        return CanBus.INSTANCE.getCanType();
    }


}