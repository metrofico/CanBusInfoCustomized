package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType135 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "海马", "S7", "2013-Present", "Hiworld", "Haima", "S7 ", "2013-Present", 135, 0, 0, 0, 1, 11, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "海马", "M3", "2014-Present", "Hiworld", "Haima", "M3 ", "2014-Present", 135, 0, 0, 0, 1, 11, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "海马", "Family", "2010-2013(Gen3)", "Hiworld", "Haima", "Family ", "2010-2013(Gen3)", 135, 0, 0, 0, 1, 11, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
