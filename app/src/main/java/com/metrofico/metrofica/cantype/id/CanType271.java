package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType271 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "TATA", "NEXON", "默认", "Hiworld", "TATA", "NEXON", "Defualt", 271, 1, 0, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "TATA", "HEXA", "默认", "Hiworld", "TATA", "HEXA", "Defualt", 271, 0, 0, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "TATA", "Tiago", "默认", "Hiworld", "TATA", "Tiago", "Defualt", 271, 1, 0, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
