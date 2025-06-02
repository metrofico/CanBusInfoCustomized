package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType204 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "哈弗", "H2", " ", "Hiworld", "Haval", "H2", "", 204, 1, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "哈弗", "H6", " ", "Hiworld", "Haval", "H6", "", 204, 2, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "哈弗", "H6 Coupe", " ", "Hiworld", "Haval", "H6 Coupe", "", 204, 3, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "哈弗", "H6 Coupe", "2018", "Hiworld", "Haval", "H6 Coupe", "2018", 204, 7, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
