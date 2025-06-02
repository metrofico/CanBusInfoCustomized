package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType406 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "长安", "悦翔 V7 中高配", " ", "Hiworld", "Changan", "V7", "", 406, 5, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "长安", "悦翔 V7 低配", " ", "Hiworld", "Changan", "V7", "", 406, 6, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "长安", "逸动 DT 低配", " ", "Hiworld", "Changan", "DT", "", 406, 7, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
