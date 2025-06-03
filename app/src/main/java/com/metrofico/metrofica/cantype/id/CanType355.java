package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType355 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("路征", "奥迪", "A3 / A4 / TT", " ", "Luzheng", "Audi", "A3 / A4 / TT", " ", 355, 0, 0, 0, 1, 8, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
