package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType144 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "雪铁龙", "贝林格", "默认", "Hiworld", "Citroen/Peugeot", "BEILIGE", "Defualt", 144, 0, 0, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
