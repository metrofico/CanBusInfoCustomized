package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType346 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("睿志诚", "比速", "M3", "默认", "Raise", "BISU", "M3", "Default", 346, 1, 1, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "比速", "T3", "默认", "Raise", "BISU", "T3", "Default", 346, 2, 2, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "比速", "T5（中低配）LOW/MID", "默认", "Raise", "BISU", "T5（Medium to low configuration）LOW/MID", "Default", 346, 3, 3, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "比速", "T5（高配）HIGH", "默认", "Raise", "BISU", "T5（High configuration）HIGH", "Default", 346, 4, 4, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
