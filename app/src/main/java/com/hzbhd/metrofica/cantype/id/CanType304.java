package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType304 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "YD", "π3", "低配 Low configuration", "Internal", "YD", "π3", "Low configuration Low configuration", 304, 0, 0, 0, 1, 0, 0, 0, 0, "null"), new CanTypeAllEntity("内部协议", "YD", "π3", "高配 High configuration", "Internal", "YD", "π3", "High configuration High configuration", 304, 1, 0, 0, 1, 0, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
