package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType121 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "现代", "途胜", "2016款", "Hiworld", "Hyundai", "Tucsion", "2016model", 121, 0, 0, 0, 1, 4, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
