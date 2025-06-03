package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType377 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "本田", "艾力绅 Elysion", "2012-2015", "Hiworld", "Honda", "Elysion", "2012-2015", 377, 0, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "本田", "奥德赛 Odyssey", "2009-2014", "Hiworld", "Honda", "Odyssey", "2009-2014", 377, 0, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
