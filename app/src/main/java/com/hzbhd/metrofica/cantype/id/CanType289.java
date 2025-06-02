package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType289 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "JL", "默认", "默认", "Internal", "JL", "Default", "Defualt", 289, 0, 0, 0, 1, 0, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
