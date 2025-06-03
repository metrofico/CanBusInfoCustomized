package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType175 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欣朴 ", "现代", "索纳塔", "2018(9th gen)(10panel Key)", "Simple", "Hyundai", "Sonata", "2018(9th gen)(10panel Key)", 175, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "现代", "索纳塔", "2018(9th gen)(10panel Key)", "BAOGOOD", "Hyundai", "Sonata", "2018(9th gen)(10panel Key)", 175, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
