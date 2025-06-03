package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType452 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("网用", "豪华品牌", "奔驰", "通用", "Network use", "luxury brand", "Benz", "be current", 452, 0, 1, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("网用", "豪华品牌", "宝马", "通用", "Network use", "luxury brand", "BMW", "be current", 452, 0, 2, 0, 1, 5, 1, 0, 0, "null"), new CanTypeAllEntity("网用", "豪华品牌", "雷克萨斯", "通用", "Network use", "luxury brand", "Lexus", "be current", 452, 0, 3, 0, 1, 5, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
