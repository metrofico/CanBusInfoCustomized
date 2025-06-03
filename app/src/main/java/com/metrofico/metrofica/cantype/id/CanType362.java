package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType362 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("比纳瑞", "丰田", "皇冠 Crown 14", " ", "Binary", "Toyota", "Crown 14", "", 362, 0, 0, 0, 1, 0, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
