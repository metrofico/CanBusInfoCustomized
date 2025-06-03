package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType336 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "比亚迪", "F3", "默认", "Hiworld", "BYD", "F3", "Default", 336, 0, 1, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "比亚迪", "S6", "默认", "Hiworld", "BYD", "S6", "Default", 336, 0, 2, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "比亚迪", "元", "默认", "Hiworld", "BYD", "Yuan", "Default", 336, 0, 3, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
