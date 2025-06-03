package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType202 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "奥迪", "A3", "2003-2013(Gen2)", "Hiworld", "Audi", "A3", "2003-2013(Gen2)", 202, 0, 0, 0, 1, 7, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "奥迪", "A4", "2004-2008(Gen3)", "Hiworld", "Audi", "A4", "2004-2008(Gen3)", 202, 0, 0, 0, 1, 7, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "奥迪", "A6", "Before 2004", "Hiworld", "Audi", "A6", "Before 2004", 202, 0, 0, 0, 1, 7, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "奥迪", "TT", "2006-2014(Gen2)", "Hiworld", "Audi", "TT", "2006-2014(Gen2)", 202, 0, 0, 0, 1, 7, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
