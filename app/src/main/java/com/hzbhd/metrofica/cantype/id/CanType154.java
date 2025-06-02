package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType154 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "菲亚特", "菲翔", "2012-Present", "Hiworld", "Fiat", "Viaggio", "2012-Present", 154, 0, 0, 0, 1, 6, 1, 0, 0, "null"), new CanTypeAllEntity("威驰", "菲亚特", "致悦", "2014-Present", "Hiworld", "Fiat", "Ottimo", "2014-Present", 154, 0, 0, 0, 1, 6, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
