package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType24 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欣朴 ", "日产", "天籁", "2008", "Simple", "Nissan", "Altima/Teana", "2008", 24, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "日产", "天籁", "2008", "BAOGOOD", "Nissan", "Altima/Teana", "2008", 24, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
