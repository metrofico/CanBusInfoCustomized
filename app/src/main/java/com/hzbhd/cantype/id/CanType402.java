package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType402 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "北汽", "幻速 S3L", " ", "Hiworld", "BAIC", "S3L", "", 402, 8, 0, 38400, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "北汽", "绅宝 X35", "2016", "Hiworld", "BAIC", "X35", "2016", 402, 5, 0, 38400, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "北汽", "M50F", " ", "Hiworld", "BAIC", "M50F", "", 402, 6, 0, 38400, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "北汽", "绅宝 X35", "2018", "Hiworld", "BAIC", "X35", "2018", 402, 7, 0, 38400, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
