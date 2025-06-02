package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType381 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "大众", "途锐", "2002—2010", "Hiworld", "VW", "Touareg", "2002—2010", 381, 0, 0, 0, 1, 7, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
