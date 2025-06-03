package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType255 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("睿志诚", "宝骏系列", "510", "2017-2019", "Raise", "BaoJ", "510", "2017-2019", 255, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "宝骏系列", "530", "2018-2019", "Raise", "BaoJ", "530", "2018-2019", 255, 1, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "宝骏系列", "730", "2014-2017", "Raise", "BaoJ", "730", "2014-2017", 255, 2, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "宝骏系列", "560", "2015-2017", "Raise", "BaoJ", "560", "2015-2017", 255, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
