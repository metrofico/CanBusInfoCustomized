package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType318 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欧迪", "东南", "A5", "2020", "Oudi", "Soueast", "A5", "2020", 318, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "东南", "V5", "2013-2016", "Oudi", "Soueast", "V5", "2013-2016", 318, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "东南", "V6", "2013-2016", "Oudi", "Soueast", "V6", "2013-2016", 318, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
