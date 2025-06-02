package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType431 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "奔腾", "X80", "2017款", "Hiworld", "Besturn", "X80", "2017model", 431, 1, 9, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "红旗", "H5", "2019款", "Hiworld", "Red Flag", "H5", "2019model", 431, 2, 17, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
