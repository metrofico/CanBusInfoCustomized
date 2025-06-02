package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType359 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("比纳瑞", "雷克萨斯", "IS 250", "2006低配", "Binary", "Lexus", "IS", "2006Low configuration", 359, 0, 1, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("比纳瑞", "雷克萨斯", "IS 250", "2006高配", "Binary", "Lexus", "IS", "2006High configuration", 359, 0, 2, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
