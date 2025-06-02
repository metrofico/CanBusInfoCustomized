package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType305 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欧迪", "宝骏", "默认", "默认", "Oudi", "BAOJUN", "Default", "Defualt", 305, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "宝骏", "530", "18款", "Oudi", "BAOJUN", "530", "18model", 305, 1, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "宝骏", "730", "17款", "Oudi", "BAOJUN", "730", "17model", 305, 2, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
