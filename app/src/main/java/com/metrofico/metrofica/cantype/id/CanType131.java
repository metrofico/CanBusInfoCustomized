package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType131 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欣朴 ", "马自达", "Mazda6 Atenza", "2013(3rd gen)", "Simple", "Mazda", "Mazda6 Atenza", "2013(3rd gen)", 131, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欣朴 ", "马自达", "CX-5", "2012", "Simple", "Mazda", "CX-5", "2012", 131, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "马自达", "Mazda6 Atenza", "2013(3rd gen)", "BAOGOOD", "Mazda", "Mazda6 Atenza", "2013(3rd gen)", 131, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "马自达", "CX-5", "2012", "BAOGOOD", "Mazda", "CX-5", "2012", 131, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
