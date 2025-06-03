package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType410 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "奔腾", "B50", "2009-2012(FW003)", "Hiworld", "Besturn", "B50", "2009-2012(FW003)", 410, 0, 0, 0, 1, 7, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
