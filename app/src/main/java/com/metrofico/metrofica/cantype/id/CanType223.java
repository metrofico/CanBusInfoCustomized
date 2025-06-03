package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType223 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欣朴 ", "马自达", "BT-50", "2015", "Simple", "Mazda", "BT-50", "2015", 223, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "马自达", "BT-50", "2015", "BAOGOOD", "Mazda", "BT-50", "2015", 223, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
