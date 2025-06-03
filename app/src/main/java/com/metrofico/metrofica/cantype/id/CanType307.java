package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType307 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "奔驰", "Metris", "默认", "Hiworld", "Benz", "Metris", "Defualt", 307, 0, 0, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "奔驰", "海外", "19 款", "Hiworld", "Benz", "Spinter", "19 model", 307, 1, 0, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
