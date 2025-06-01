package com.hzbhd.config.use;

public final class CanBusDefault {

    private static final int canType = 0;
    private static final int selectCarPosition = 0;
    public static final CanBusDefault INSTANCE = new CanBusDefault();

    private CanBusDefault() {
    }

    public final int getSelectCarPosition() {
        return selectCarPosition;
    }

    public final int getCanType() {
        return canType;
    }

}
