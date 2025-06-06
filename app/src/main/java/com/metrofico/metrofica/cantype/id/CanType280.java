package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType280 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("比纳瑞", "现代", "索纳塔", "Gen8(Auto AC)", "Binary", "Hyundai", "Sonata", "Gen8(Auto AC)", 280, 1, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("比纳瑞", "现代", "索纳塔", "Gen8(Manual AC)", "Binary", "Hyundai", "Sonata", "Gen8(Manual AC)", 280, 2, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
