package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType386 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "哈弗", "H9", "2015-2017", "Hiworld", "Haval", "H9", "2015-2017", 386, 1, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "哈弗", "H8", " ", "Hiworld", "Haval", "H8", "", 386, 2, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
