package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType441 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "MD", "小康", "500", "Internal", "MD", "Xiaokang ", "500", 441, 0, 1, 0, 1, 1, 0, 0, 0, "null"), new CanTypeAllEntity("内部协议", "MD", "小康", "560", "Internal", "MD", "Xiaokang ", "560", 441, 0, 2, 0, 1, 1, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
