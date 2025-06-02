package com.hzbhd.metrofica.proxy;

import android.util.Log;

import com.hzbhd.systemstatus.proxy.aidl.IServiceConnectCallback;
import com.hzbhd.systemstatus.proxy.aidl.ISystemStatusManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServiceStateManager {
    private static ServiceStateManager mServiceStateManager;
    private final HashMap<Integer, List<IServiceConnectListener>> mServiceConnectListenerList = new HashMap<>();
    private final HashMap<Integer, IServiceConnectCallback> mServiceConnectCallbacks = new HashMap<>();

    public static ServiceStateManager getInstance() {
        synchronized (ServiceStateManager.class) {
            if (mServiceStateManager == null) {
                mServiceStateManager = new ServiceStateManager();
            }
            return mServiceStateManager;
        }
    }

    public String getServiceData(int i, int i2) {
        ISystemStatusManager iSystemStatusManager = SystemStatusManager.getISystemStatusManager();
        if (iSystemStatusManager == null) {
            return null;
        }
        try {
            return iSystemStatusManager.getServiceData(i, i2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void registerConnectListener(int i, IServiceConnectListener iServiceConnectListener) {
        synchronized (this) {
            ISystemStatusManager iSystemStatusManager = SystemStatusManager.getISystemStatusManager();
            if (iSystemStatusManager == null) {
                Log.d("SystemStatusManager", "ISystemStatusManager is null");
                return;
            }
            if (!this.mServiceConnectListenerList.containsKey(i)) {
                this.mServiceConnectListenerList.put(i, new ArrayList<>());
            }
            this.mServiceConnectListenerList.get(i).add(iServiceConnectListener);
            if (this.mServiceConnectCallbacks.containsKey(i)) {
                return;
            }
            this.mServiceConnectCallbacks.put(i, new MyIServiceConnectCallback(i));
            try {
                iSystemStatusManager.regitsterServiceConnectCallback(i, this.mServiceConnectCallbacks.get(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setServiceData(int i, int i2, String str) {
        ISystemStatusManager iSystemStatusManager = SystemStatusManager.getISystemStatusManager();
        if (iSystemStatusManager == null) {
            return;
        }
        try {
            iSystemStatusManager.setServiceData(i, i2, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean unregisterConnnectListener(int i, IServiceConnectListener iServiceConnectListener) {
        ISystemStatusManager iSystemStatusManager = SystemStatusManager.getISystemStatusManager();
        if (iSystemStatusManager == null) {
            return false;
        }
        if (this.mServiceConnectListenerList.containsKey(i) &&
                this.mServiceConnectListenerList.get(i).contains(iServiceConnectListener)) {

            this.mServiceConnectListenerList.get(i).remove(iServiceConnectListener);

            if (this.mServiceConnectListenerList.get(i).isEmpty()) {
                this.mServiceConnectListenerList.remove(i);
                try {
                    iSystemStatusManager.unregisterServiceConnectCallback(i, this.mServiceConnectCallbacks.get(i));
                    this.mServiceConnectCallbacks.remove(i);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
        return true;
    }

    private class MyIServiceConnectCallback extends IServiceConnectCallback.Stub {
        private final int mModuleId;

        public MyIServiceConnectCallback(int moduleId) {
            this.mModuleId = moduleId;
        }

        @Override
        public void onConnected() {
            List<IServiceConnectListener> listeners;
            synchronized (ServiceStateManager.this) {
                listeners = mServiceConnectListenerList.get(mModuleId);
                if (listeners == null) return;
                listeners = new ArrayList<>(listeners); // Copia defensiva por seguridad
            }

            for (IServiceConnectListener listener : listeners) {
                if (listener != null) {
                    listener.onConnected();
                }
            }
        }
    }
}
