package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType444 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "MS", "专汽", "ZQ", "Internal", "MS", "Specialized Automobile", "ZQ", 444, 0, 0, 0, 1, 1, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
