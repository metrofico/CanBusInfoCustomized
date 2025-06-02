package com.hzbhd.metrofica.proxy.mcu.utils;

import android.os.IBinder;

import java.lang.reflect.Method;

public class MCUParseUtil {

    public static IBinder ServiceManagerGetService(String serviceName) {
        IBinder binder = null;
        try {
            // Get the ServiceManager class
            Class<?> serviceManagerClass = Class.forName("android.os.ServiceManager");

            // Get the getService method
            Method getServiceMethod = serviceManagerClass.getMethod("getService", String.class);

            // Invoke the getService method
            Object result = getServiceMethod.invoke(null, serviceName); // invoke on null for static method

            if (result != null) {
                binder = (IBinder) result;
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Error: ServiceManager class not found. " + e.getMessage());
            // Log.e("ServiceHelper", "ServiceManager class not found.", e); // Use Android Log for actual app
        } catch (NoSuchMethodException e) {
            System.err.println("Error: getService method not found. " + e.getMessage());
            // Log.e("ServiceHelper", "getService method not found.", e);
        } catch (Exception e) { // Catch broader exceptions for reflection issues
            System.err.println("Error invoking getService method. " + e.getMessage());
            // Log.e("ServiceHelper", "Error invoking getService method.", e);
        }
        return binder;
    }

    public static int byteArrayToInt(byte[] var0) {
        int var2 = 0;

        int var1;
        for (var1 = 0; var2 < 4; ++var2) {
            var1 += (var0[var2] & 255) << (3 - var2) * 8;
        }

        return var1;
    }

    public static short byteArrayToShort(byte[] var0) {
        int var2 = 0;

        short var1;
        for (var1 = 0; var2 < 2; ++var2) {
            var1 = (short) (var1 + ((var0[var2] & 255) << (1 - var2) * 8));
        }

        return var1;
    }

    public static int getIntFromByteWithBit(byte var0, int var1, int var2) {
        return var0 + 256 >> var1 & (1 << var2) - 1;
    }

    public static byte[] intToByteArray(int var0) {
        return new byte[]{(byte) (var0 >> 24 & 255), (byte) (var0 >> 16 & 255), (byte) (var0 >> 8 & 255), (byte) (var0 & 255)};
    }

    public static byte[] shortToByteArray(short var0) {
        return new byte[]{(byte) (var0 >> 8 & 255), (byte) (var0 & 255)};
    }
}
