package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType442 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "MD", "小康", "580", "Internal", "MD", "Xiaokang ", "580", 442, 0, 0, 0, 1, 1, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
