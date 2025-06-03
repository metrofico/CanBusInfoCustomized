package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType291 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "大众", "默认", "默认", "Hiworld", "VW", "Default", "Defualt", 291, 0, 0, 0, 1, 7, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
