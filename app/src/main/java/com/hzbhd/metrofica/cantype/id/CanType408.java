package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType408 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "力帆", "720", " ", "Hiworld", "Lifan", "720", "", 408, 0, 0, 0, 1, 7, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
