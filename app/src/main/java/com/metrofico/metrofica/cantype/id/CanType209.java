package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType209 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("比纳瑞", "本田", "雅阁", "2.0 2016(Gen9)", "Binary", "Honda", "Accord", "2.0 2016(Gen9)", 209, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("比纳瑞", "本田", "雅阁", "2.4 2016(Gen9)", "Binary", "Honda", "Accord", "2.4 2016(Gen9)", 209, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
