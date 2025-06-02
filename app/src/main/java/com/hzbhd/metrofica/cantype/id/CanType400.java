package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType400 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "猎豹", "黑金刚 Black King Kong", " ", "Hiworld", "Cheetah", "Black King Kong", "", 400, 0, 0, 0, 1, 7, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
