package com.metrofico.metrofica.use;

import com.metrofico.metrofica.util.DefaultSharedUtilReflection;

public final class CanBus {
    public static final CanBus INSTANCE = new CanBus();

    private CanBus() {
    }

    public final int getCanType() {
        return DefaultSharedUtilReflection.getInt(CanBusKey.canbus_i_cantype.name(), CanBusDefault.INSTANCE.getCanType());
    }

    public final int getSelectCarPosition() {
        return DefaultSharedUtilReflection.getInt(CanBus.CanBusKey.canbus_i_select_car_position.name(), CanBusDefault.INSTANCE.getSelectCarPosition());
    }

    public enum CanBusKey {
        canbus_i_cantype, canbus_i_select_car_position
    }
}