package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType181 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欧迪", "哈弗", "H9", "2017", "Oudi", "Haval", "H9", "2017", 181, 0, 1, 0, 1, 1, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "哈弗", "H4", "2018-2019", "Oudi", "Haval", "H4", "2018-2019", 181, 0, 2, 0, 1, 1, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
