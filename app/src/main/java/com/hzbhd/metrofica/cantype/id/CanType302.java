package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType302 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欧迪", "奔驰", "默认", "默认", "Oudi", "Benz", "Default", "Defualt", 302, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "奔驰", "SCANIA", "默认", "Oudi", "Benz", "SCANIA", "Defualt", 302, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
