package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType292 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("比纳瑞", "别克", "英朗", "2010-2014(Low)", "Binary", "Buick", "Excelle", "2010-2014(Low)", 292, 0, 14, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("比纳瑞", "别克", "英朗", "2010-2014(High)", "Binary", "Buick", "Excelle", "2010-2014(High)", 292, 1, 15, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
