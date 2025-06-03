package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType365 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("威驰", "通用", "SRX", " ", "Hiworld", "GM", "SRX", "", 365, 21, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "通用", "ATS", " ", "Hiworld", "GM", "ATS", "", 365, 43, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "通用", "XTS", " ", "Hiworld", "GM", "XTS", "", 365, 44, 0, 0, 1, 5, 1, 1, 1, " "), new CanTypeAllEntity("威驰", "通用", "君越", "2013-2014", "Hiworld", "GM", "", "2013-2014", 365, 36, 0, 0, 1, 5, 1, 1, 1, " ")});

   public ArrayList getList() {
      return this.list;
   }
}
