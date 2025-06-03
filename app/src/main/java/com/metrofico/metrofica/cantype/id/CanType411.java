package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType411 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "奔腾", "B50", "2013-NOW(FW004)", "Hiworld", "Besturn", "B50", "2013-NOW(FW004)", 411, 0, 0, 0, 1, 7, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
