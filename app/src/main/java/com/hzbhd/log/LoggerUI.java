package com.hzbhd.log;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import org.greenrobot.eventbus.EventBus;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class LoggerUI {

    public static void d(String tag, String message) {
        Log.d(tag, message);
        String timeStamp = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        String logWithTime = "[" + timeStamp + "] [" + tag + "] " + message;

        //Intent intent = new Intent("com.hzbhd.LOG_UPDATE_SWM");
        //intent.putExtra("log", logWithTime);
        EventBus.getDefault().post(new LogMessage(null, logWithTime));
        // LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }

    public static String getDetailedError(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }

    public static void e(String tag, String message) {
        Log.d(tag, message);
        String timeStamp = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        String logWithTime = "[" + timeStamp + "] [" + tag + "] " + message;

        //Intent intent = new Intent("com.hzbhd.LOG_UPDATE_SWM");
        //intent.putExtra("log", logWithTime);
        EventBus.getDefault().post(new LogMessage("ERROR", logWithTime));
        // LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }

    public static void e(String tag, String message, Exception e) {
        Log.d(tag, message);
        String timeStamp = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        String logWithTime = "[" + timeStamp + "] [" + tag + "] " + message + " " + getDetailedError(e);

        //Intent intent = new Intent("com.hzbhd.LOG_UPDATE_SWM");
        //intent.putExtra("log", logWithTime);
        EventBus.getDefault().post(new LogMessage("ERROR", logWithTime));
        // LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }
}