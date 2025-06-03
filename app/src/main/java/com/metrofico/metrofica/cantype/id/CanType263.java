package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType263 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欣朴 ", "标致", "新206", "2016", "Simple", "Peugeot", "New 206", "2016", 263, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "标致", "新206", "2016", "BAOGOOD", "Peugeot", "New 206", "2016", 263, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
