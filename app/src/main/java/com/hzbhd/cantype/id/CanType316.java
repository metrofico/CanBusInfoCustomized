package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType316 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("睿晟威 ", "马自达", "6", "Manual Air Conditioner", "RSW", "Mazda", "6", "Manual Air Conditioner", 316, 0, 0, 0, 1, 1, 1, 0, 0, "null"), new CanTypeAllEntity("睿晟威 ", "马自达", "6", "Auto Air Conditioner", "RSW", "Mazda", "6", "Auto Air Conditioner", 316, 1, 0, 0, 1, 1, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
