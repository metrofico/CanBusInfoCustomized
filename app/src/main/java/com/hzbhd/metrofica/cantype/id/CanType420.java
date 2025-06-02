package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType420 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "众泰", "T600", " ", "Hiworld", "Zotye", "T600", "", 420, 1, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "众泰", "X5", " ", "Hiworld", "Zotye", "X5", "", 420, 2, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
