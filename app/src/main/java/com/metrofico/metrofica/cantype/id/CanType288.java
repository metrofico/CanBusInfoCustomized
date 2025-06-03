package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType288 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("比纳瑞", "丰田", "霸道 普拉多", "2002-2009 (Portrait)(Low)", "Binary", "Toyota", "cruiser Prado", "2002-2009 (Portrait)(Low)", 288, 0, 64, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("比纳瑞", "丰田", "霸道 普拉多", "2002-2009 (Portrait)(High)", "Binary", "Toyota", "cruiser Prado", "2002-2009 (Portrait)(High)", 288, 0, 65, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
