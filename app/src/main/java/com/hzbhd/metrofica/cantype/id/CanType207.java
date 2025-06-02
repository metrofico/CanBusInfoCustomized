package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType207 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "宝马", "BMW3/E9x", "2004-2011(Gen5)", "Hiworld", "BMW", "BMW3/E9x", "2004-2011(Gen5)", 207, 0, 0, 0, 1, 6, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "宝马", "BMW3/F30", "2012-Present(Gen6)", "Hiworld", "BMW", "BMW3/F30", "2012-Present(Gen6)", 207, 0, 0, 0, 1, 6, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "宝马", "BMWX1/E84", "2009-2015(Gen1)", "Hiworld", "BMW", "BMWX1/E84", "2009-2015(Gen1)", 207, 0, 0, 0, 1, 6, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
