package com.hzbhd.metrofica.canbus;

import android.util.Log;

import com.hzbhd.metrofica.log.LoggerUI;
import com.hzbhd.metrofica.proxy.mcu.core.MCUMainManager;

public class CanbusMsgSender {
    private static void logCanData(byte[] data) {
        if (data == null || data.length == 0) return;

        StringBuilder logBuilder = new StringBuilder("27 16————> ");

        for (int i = 1; i < data.length; i++) {
            String hex = Integer.toHexString(data[i] & 0xFF).toUpperCase();
            if (hex.length() == 1) {
                logBuilder.append("0");
            }
            logBuilder.append(hex).append(" ");
        }

        Log.d("CAN_TX", logBuilder.toString().trim());
        LoggerUI.d("CAN_TX", logBuilder.toString().trim());
    }

    public static void sendMsg(byte[] data) {
        // Siempre loguea los datos enviados
        logCanData(data);

        try {
            // Enviar al MCU con tipo 39
            MCUMainManager.getInstance().sendMCUCanboxData(39, data);
        } catch (Exception e) {
            LoggerUI.e("CAN_SEND", "sendMsg: error: " + bytes2HexString(data, data.length), e);
            // Log de error en modo debug nivel 5
            Log.e("CAN_SEND", "sendMsg: error: " + bytes2HexString(data, data.length), e);
        }
    }

    private static String bytes2HexString(byte[] data, int length) {
        if (data == null || length <= 0) return "";

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length && i < data.length; i++) {
            String hex = Integer.toHexString(data[i] & 0xFF).toUpperCase();
            if (hex.length() == 1) {
                builder.append('0');
            }
            builder.append(hex).append(' ');
        }

        return builder.toString().trim();
    }
}
