package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType104 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欣朴 ", "宝马", "E90", "默认", "Simple", "BMW", "E90", "Defualt", 104, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "宝马", "E90", "默认", "BAOGOOD", "BMW", "E90", "Defualt", 104, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "宝马", "E90", "默认", "Oudi", "BMW", "E90", "Defualt", 104, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("路征", "宝马", "E90", "默认", "Luzheng", "BMW", "E90", "Defualt", 104, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
