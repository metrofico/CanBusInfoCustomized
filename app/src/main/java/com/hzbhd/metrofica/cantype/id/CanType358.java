package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType358 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("比纳瑞", "吉普", "指南者", "--", "Binary", "Jeep", "Compass", "--", 358, 0, 1, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
