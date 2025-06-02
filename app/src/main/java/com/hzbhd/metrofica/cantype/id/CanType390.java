package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType390 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "宝马", "1系(BMW I series)", "--", "Hiworld", "BMW", "1(BMW I series)", "--", 390, 0, 0, 0, 1, 7, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "宝马", "3系(BMW III series)", "--", "Hiworld", "BMW", "3系(BMW III series)", "--", 390, 1, 1, 0, 1, 7, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
