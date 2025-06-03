package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType423 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "潍柴", "D50/U60V高配", "2018", "Hiworld", "WEICHAI", "D50/U60V", "2018", 423, 1, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "潍柴", "U60V中配", " ", "Hiworld", "WEICHAI", "U60V", "", 423, 2, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "潍柴", "U60V低配", " ", "Hiworld", "WEICHAI", "U60V", "", 423, 3, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
