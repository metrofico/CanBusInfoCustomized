package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType387 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "上汽", "大通MAXUS T60", " ", "Hiworld", "SAIC", "MAXUS T60", "", 387, 1, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "上汽", "名爵MG ZS", " ", "Hiworld", "SAIC", "MG ZS", "", 387, 2, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "上汽", "大通MAXUS T60 海外", " ", "Hiworld", "SAIC", "MAXUS T60", "", 387, 3, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
