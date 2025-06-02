package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType475 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("路征", "克莱斯勒", "300C", "15 款", "Luzheng", "Chrysler", "300C", "15 model", 475, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("路征", "克莱斯勒", "Levante", "18 款", "Luzheng", "Chrysler", "Levante", "18 model", 475, 1, 1, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
