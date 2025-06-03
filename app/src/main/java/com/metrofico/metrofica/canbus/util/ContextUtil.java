package com.metrofico.metrofica.canbus.util;


import android.content.Context;

public class ContextUtil {
    private static ContextUtil c;
    private Context mContext;

    private ContextUtil() {
    }

    public static ContextUtil getInstance() {
        if (c == null) {
            c = new ContextUtil();
        }
        return c;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }
}
