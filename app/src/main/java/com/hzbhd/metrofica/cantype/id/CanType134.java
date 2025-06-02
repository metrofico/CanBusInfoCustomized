package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType134 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("鑫巴斯", "马自达", "Mazda3", "2014(Low)", "Xinbas", "Mazda", "Mazda3 Axela", "2014(Low)", 134, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("鑫巴斯", "马自达", "Mazda3", "2017", "Xinbas", "Mazda", "Mazda3 Axela", "2017", 134, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("鑫巴斯", "马自达", "Mazda6", "2017(Gen3)(Low)", "Xinbas", "Mazda", "Mazda6 Atenza", "2017(Gen3)(Low)", 134, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("鑫巴斯", "马自达", "CX-4", "2016(Medium)", "Xinbas", "Mazda", "CX-4", "2016(Medium)", 134, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("鑫巴斯", "马自达", "CX-4", "2016(High)", "Xinbas", "Mazda", "CX-4", "2016(High)", 134, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
