package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType225 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("道俊 ", "本田", "雅阁", "(Gen7)", "Dogen", "Honda", "Accord", "(Gen7)", 225, 0, 0, 1, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
