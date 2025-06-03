package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType433 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("睿志诚", "本田", "CRV(LOW_MID)", "12-13款", "Raise", "Honda", "CRV(LOW_MID)", "12-13model", 433, 0, 1, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "本田", "CRV(LOW_MID)", "15-16款", "Raise", "Honda", "CRV(LOW_MID)", "15-16model", 433, 0, 2, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "本田", "思域全系", "12-14款", "Raise", "Honda", "civic", "12-14model", 433, 1, 3, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
