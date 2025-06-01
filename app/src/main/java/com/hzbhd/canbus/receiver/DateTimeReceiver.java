package com.hzbhd.canbus.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;

import com.hzbhd.canbus.interfaces.MsgMgrInterface;
import com.hzbhd.canbus.msg_mgr.MsgMgrFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* loaded from: /tmp/jadx-1569907621786568726/classes.dex */
public class DateTimeReceiver extends BroadcastReceiver {
    private int bDay;
    private int bHours;
    private int bHours24H;
    private int bMins;
    private int bMonth;
    private int bSecond;
    private int bYear2Dig;
    private int bYearTotal;
    private boolean isFormat24H;
    private boolean isFormatPm;
    private boolean isGpsTime;
    private int mDayOfWeek;
    private DateFormat mFormat;
    private MsgMgrInterface mMsgMgrInterface;
    private int systemDateFormat;
    private DateFormat yyyyMMdd = new SimpleDateFormat("yyyy/M/d");
    private DateFormat MMddyyyy = new SimpleDateFormat("M/d/yyyy");
    private DateFormat ddMMyyyy = new SimpleDateFormat("d/M/yyyy");
    private final String KEY_AUTO_GPS_TIME = "auto_gps_time";

    private DateFormat getDateFormat() {
        if (this.mFormat == null) {
            this.mFormat = new SimpleDateFormat("yyyy/MM/dd==HHmm");
        }
        return this.mFormat;
    }

    private MsgMgrInterface getMsgMgrInterface(Context context) {
        if (this.mMsgMgrInterface == null) {
            this.mMsgMgrInterface = MsgMgrFactory.getCanMsgMgrUtil(context);
        }
        return this.mMsgMgrInterface;
    }

    public byte[] getCurrentDateAndTime(Context context) {
        int i;
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = getDateFormat();
        dateFormat.setTimeZone(calendar.getTimeZone());
        String format = dateFormat.format(date);
        String str = format.split("==")[1];
        String replace = format.replace("/", "").replace("==", "");
        byte[] bytes = replace.getBytes();
        String format2 = android.text.format.DateFormat.getTimeFormat(context).format(calendar.getTime());
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        calendar.setTime(date);
        this.bYearTotal = Integer.parseInt(replace.substring(0, 4));
        this.bYear2Dig = Integer.parseInt(replace.substring(2, 4));
        this.bMonth = Integer.parseInt(replace.substring(4, 6));
        this.bDay = Integer.parseInt(replace.substring(6, 8));
        int intValue = Integer.parseInt(str) / 100;
        this.bHours = intValue;
        this.bHours24H = intValue;
        this.bMins = Integer.parseInt(str) % 100;
        this.bSecond = calendar.get(13);
        this.isFormat24H = android.text.format.DateFormat.is24HourFormat(context);
        this.isFormatPm = gregorianCalendar.get(9) == Calendar.PM;
        this.isGpsTime = Settings.System.getInt(context.getContentResolver(), "auto_gps_time", 0) == 1;
        this.systemDateFormat = getSystemDateFormat(context, date);
        this.mDayOfWeek = calendar.get(7);
        if (android.text.format.DateFormat.is24HourFormat(context)) {
            this.isFormatPm = this.bHours >= 12;
        } else {
            int i2 = this.bHours;
            if (i2 >= 12) {
                this.bHours = i2 - 12;
            }
            if (format2.contains("PM") && (i = this.bHours24H) < 12) {
                this.bHours24H = i + 12;
                bytes[8] = ((this.bHours24H / 10) + "").getBytes()[0];
                bytes[9] = ((this.bHours24H % 10) + "").getBytes()[0];
            }
        }
        return bytes;
    }

    public int getSystemDateFormat(Context context, Date date) {
        String format = android.text.format.DateFormat.getDateFormat(context).format(date);
        if (format.equals(this.ddMMyyyy.format(date))) {
            return 1;
        }
        if (format.equals(this.yyyyMMdd.format(date))) {
            return 2;
        }
        return format.equals(this.MMddyyyy.format(date)) ? 3 : 0;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        intent.getExtras();
        if ("android.intent.action.TIME_TICK".equals(action) || "android.intent.action.TIME_SET".equals(action)) {
            reportDateAndTime(context);
        }
    }

    public void reportDateAndTime(Context context) {

    }
}
