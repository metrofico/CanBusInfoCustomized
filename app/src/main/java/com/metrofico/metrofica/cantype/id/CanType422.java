package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType422 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "奔腾", "B70", " ", "Hiworld", "Besturn", "B70", "", 422, 0, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
