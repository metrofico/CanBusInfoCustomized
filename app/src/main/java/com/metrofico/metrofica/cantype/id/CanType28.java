package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType28 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "现代", "名图", "2013-2015(2rd gen)(High)", "Hiworld", "Hyundai", "Mistra", "2013-2015(2rd gen)(High)", 28, 0, 0, 0, 1, 6, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
