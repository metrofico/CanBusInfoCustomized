package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType221 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "哈弗", "H2 (Red)", "2014-Present", "Hiworld", "Haval", "H2(Red)", "2014-Present", 221, 0, 0, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "哈弗", "H2(Blue)", "2016-Present", "Hiworld", "Haval", "H2(Blue)", "2016-Present", 221, 0, 0, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "哈弗", "H2S", "2016-Present", "Hiworld", "Haval", "H2S", "2016-Present", 221, 0, 0, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "哈弗", "H2S", "2017-Present", "Hiworld", "Haval", "H2S", "2017-Present", 221, 7, 0, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
