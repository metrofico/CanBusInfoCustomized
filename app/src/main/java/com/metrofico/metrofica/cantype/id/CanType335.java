package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType335 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("比纳瑞", "雷克萨斯", "IS", "2006-2012 (Landscape)", "Binary", "Lexus", "IS", "2006-2012 (Landscape)", 335, 0, 1, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("比纳瑞", "雷克萨斯", "ES/IS", "2006-2012 (Portrait)", "Binary", "Lexus", "ES/IS", "2006-2012 (Portrait)", 335, 0, 2, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("比纳瑞", "雷克萨斯", "RX", "2009-2014 (Landscape)", "Binary", "Lexus", "RX", "2009-2014 (Landscape)", 335, 0, 3, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
