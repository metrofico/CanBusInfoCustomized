package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType275 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "众泰", "T600", "默认", "Hiworld", "ZOTYE", "T600", "Defualt", 275, 0, 1, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "众泰", "X5", "默认", "Hiworld", "ZOTYE", "X5", "Defualt", 275, 1, 2, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
