package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType473 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "MD", "容大", "默认", "Internal", "MD", "Rongda", "Defualt", 473, 0, 0, 0, 1, 0, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
