package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType445 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欧迪", "东南系列", "DX5", "(新款)", "Oudi", "Southeast series", "DX5", "(new model)", 445, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
