package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType309 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("道俊", "日产", "天籁", "2004-2007", "Dogen", "Nissan", "Altima/Teana", "2004-2007", 309, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
