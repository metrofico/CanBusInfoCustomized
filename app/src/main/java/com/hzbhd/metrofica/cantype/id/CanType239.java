package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType239 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("睿志诚", "海马", "M5", "2014", "Raise", "Haima", "M5", "2014", 239, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "海马", "福美来", "2018", "Raise", "Haima", "familia Family F5", "2018", 239, 1, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "海马", "M3", "2016", "Raise", "Haima", "M3", "2016", 239, 2, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "海马", "V70", "2016", "Raise", "Haima", "V70", "2016", 239, 3, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
