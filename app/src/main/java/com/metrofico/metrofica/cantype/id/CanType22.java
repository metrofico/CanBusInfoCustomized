package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType22 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欣朴 ", "日产", "楼兰", "2015", "Simple", "Nissan", "Murano", "2015", 22, 1, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "日产", "楼兰", "2015", "BAOGOOD", "Nissan", "Murano", "2015", 22, 1, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
