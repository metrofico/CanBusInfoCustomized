package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType218 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "福特", "嘉年华", "2008-2012(Gen7)", "Hiworld", "Ford", "Fiesta", "2008-2012(Gen7)", 218, 0, 0, 0, 1, 6, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
