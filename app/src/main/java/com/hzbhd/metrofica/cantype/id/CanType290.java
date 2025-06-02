package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType290 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "CW", "BQ", "默认", "Internal", "CW", "BQ", "Defualt", 290, 0, 0, 0, 1, 0, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
