package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType211 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "福特", "锐界", "2011-2014(Gen1)", "Hiworld", "Ford", "Edge", "2011-2014(Gen1)", 211, 0, 0, 0, 1, 7, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "福特", "探险者", "2011-Present(Gen5)", "Hiworld", "Ford", "Explorer", "2011-Present(Gen5)", 211, 1, 0, 0, 1, 7, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
