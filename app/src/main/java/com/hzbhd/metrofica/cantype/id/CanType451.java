package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType451 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("网用", "豪华品牌", "奥迪（A4/Q5）专用", "高配", "Network use", "luxury brand", "Audi（A4/Q5）", "High configuration", 451, 0, 0, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("网用", "豪华品牌", "奥迪（A4/Q5）专用", "低配", "Network use", "luxury brand", "Audi（A4/Q5）", "Low configuration", 451, 0, 1, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
