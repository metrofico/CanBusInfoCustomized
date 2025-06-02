package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType226 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("鑫巴斯", "马自达", "Mazda6(Auto AC)", "2003-2015(Gen1)", "Xinbas", "Mazda", "Mazda6(Auto AC)", "2003-2015(Gen1)", 226, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("鑫巴斯", "马自达", "Mazda6(Manual AC)", "2005-2015(Gen1)", "Xinbas", "Mazda", "Mazda6(Manual AC)", "2005-2015(Gen1)", 226, 1, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
