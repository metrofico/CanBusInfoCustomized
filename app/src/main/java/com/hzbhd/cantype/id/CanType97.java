package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType97 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "福特", "翼博", "默认", "Hiworld", "Ford", "EcoSport", "Defualt", 97, 0, 0, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "福特", "蒙迪欧", "2013-Present(Gen5)(AC panel Reversed)", "Hiworld", "Ford", "Mondeo", "2013-Present(Gen5)(AC panel Reversed)", 97, 1, 0, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "福特", "蒙迪欧", "2021", "Hiworld", "Ford", "Mondeo", "2021", 97, 2, 0, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
