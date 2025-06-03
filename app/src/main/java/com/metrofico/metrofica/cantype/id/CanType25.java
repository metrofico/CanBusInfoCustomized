package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType25 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欣朴 ", "日产", "奇骏", "2017(3rd gen)(High with 360Camera)", "Simple", "Nissan", "X-Trail", "2017(3rd gen)(High with 360Camera)", 25, 2, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "日产", "奇骏", "2017(3rd gen)(High with 360Camera)", "BAOGOOD", "Nissan", "X-Trail", "2017(3rd gen)(High with 360Camera)", 25, 2, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
