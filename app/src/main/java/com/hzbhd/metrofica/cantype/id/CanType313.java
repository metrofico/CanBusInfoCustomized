package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType313 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("路征", "宝马", "E39", "默认", "Luzheng", "BMW", "E39", "Default", 313, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("路征", "宝马", "E46", "默认", "Luzheng", "BMW", "E46", "Default", 313, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("路征", "宝马", "E53", "默认", "Luzheng", "BMW", "E53", "Default", 313, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
