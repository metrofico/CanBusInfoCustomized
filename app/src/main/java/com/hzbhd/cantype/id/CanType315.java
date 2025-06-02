package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType315 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欧迪", "汉腾", "X5", "中高配 Middle High Configuration", "Oudi", "Hanteng", "X5", "中High configuration Middle High Configuration", 315, 2, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "汉腾", "X5", "低配 Low configuration", "Oudi", "Hanteng", "X5", "Low configuration Low configuration", 315, 1, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "汉腾", "X7", "中高配 Middle High Configuration", "Oudi", "Hanteng", "X7", "中High configuration Middle High Configuration", 315, 2, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "汉腾", "X7", "低配 Low configuration", "Oudi", "Hanteng", "X7", "Low configuration Low configuration", 315, 1, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
