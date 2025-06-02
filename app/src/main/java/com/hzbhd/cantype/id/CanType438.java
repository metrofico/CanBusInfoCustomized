package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType438 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "MS", "重卡", "燃油", "Internal", "MS", "Heavy truck", "fuel", 438, 0, 0, 0, 1, 1, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
