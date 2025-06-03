package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType58 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "本田", "思域", "2012-2014(Gen9)", "Hiworld", "Honda", "Civic", "2012-2014(Gen9)", 58, 0, 0, 2, 1, 7, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "本田", "思域", "2014-2015(Gen9)(Low)", "Hiworld", "Honda", "Civic", "2014-2015(Gen9)(Low)", 58, 0, 0, 2, 1, 7, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
