package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType464 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("路征", "丰田", "兰德酷路泽（High）", "07_15款", "Luzheng", "Toyota", "Land Cruiser Cruise （High）", "07_15model", 464, 0, 1, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("路征", "丰田", "兰德酷路泽（Low）", "07_15款", "Luzheng", "Toyota", "Land Cruiser Cruise （Low）", "07_15model", 464, 0, 2, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("路征", "丰田", "雷克萨斯", "--", "Luzheng", "Toyota", "Lexus 570", "--", 464, 0, 3, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
