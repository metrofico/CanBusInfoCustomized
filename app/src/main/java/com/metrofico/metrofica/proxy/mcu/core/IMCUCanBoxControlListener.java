package com.metrofico.metrofica.proxy.mcu.core;

public interface IMCUCanBoxControlListener {
   void notifyCanboxData(int var1, byte[] var2);

   void onMcuConn();
}
