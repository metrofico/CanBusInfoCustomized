package com.metrofico.metrofica.util;

import static com.metrofico.metrofica.proxy.mcu.core.MCUMainManager.TAG;

import android.util.Log;

import com.metrofico.metrofica.log.LoggerUI;

public class DefaultSharedUtilReflection {

    public static int getInt(String key, int defaultValue) {
        try {
            Class<?> clazz = Class.forName("android.app.DefaultSharedUtil");
            // Buscar el método estático getInt(String, int)
            Object result = clazz.getDeclaredMethod("getInt", String.class, int.class).invoke(null, key, defaultValue); // null porque es método estático

            if (result instanceof Integer) {
                return (Integer) result;
            }
        } catch (Exception e) {
            LoggerUI.e(TAG, "Error al invocar DefaultSharedUtil.getInt: ", e);
            Log.e(TAG, "Error al invocar DefaultSharedUtil.getInt: " + e.getMessage(), e);
        }
        return defaultValue; // fallback si falla
    }
}
