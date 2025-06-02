package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType213 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "马自达", "Mazda3 Axela", "2014-2019", "Hiworld", "Mazda", "Mazda3 Axela", "2014-2019", 213, 10, 10, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "马自达", "Mazda4 Axela", "2020", "Hiworld", "Mazda", "Mazda4 Axela", "2020", 213, 13, 13, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
