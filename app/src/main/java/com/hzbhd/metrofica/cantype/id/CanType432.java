package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType432 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("路征", "福特", "野马", "默认", "Luzheng", "Ford", "Mustang", "Default", 432, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
