package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType349 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("比纳瑞", "福特", "翼虎 高配", "--", "Binary", "Ford", "Kuga/Escape高配", "--", 349, 1, 1, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("比纳瑞", "福特", "翼虎 低配", "--", "Binary", "Ford", "Kuga/Escape低配", "--", 349, 2, 2, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
