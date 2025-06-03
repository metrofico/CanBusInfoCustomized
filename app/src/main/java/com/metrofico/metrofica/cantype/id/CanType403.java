package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType403 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "北汽", "幻速 S6", " ", "Hiworld", "BAIC", "S6", "", 403, 0, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
