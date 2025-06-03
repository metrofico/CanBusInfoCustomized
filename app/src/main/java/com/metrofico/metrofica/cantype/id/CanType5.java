package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType5 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "大众", "全兼容 Fully Compatible", " ", "Hiworld", "VW", "Fully Compatible", "", 5, 0, 0, 0, 1, 7, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
