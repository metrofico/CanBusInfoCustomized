package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType257 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "吉利", "GC7", "2013-Present", "Hiworld", "Geely", "GC7", "2013-Present", 257, 0, 0, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
