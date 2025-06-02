package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType3 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("睿志诚", "大众", "途锐", "2013款", "Raise", "VW（MQB）", "Touareg", "Default", 3, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "大众", "朗逸纯电动", "2019款", "Raise", "VW（MQB）", "Langyi pure electric", "2013model", 3, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "大众", "宝来纯电动", "2020款", "Raise", "VW（MQB）", "Bora pure electric", "2019model", 3, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "大众", "VILORAN", "默认", "Raise", "VW（MQB）", "VILORAN", "2020model", 3, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "大众", "帕萨特混动", "19-20款", "Raise", "VW（MQB）", "Passat hybrid", "Default", 3, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "大众", "途观L混动", "2020款", "Raise", "VW（MQB）", "Tiguan l hybrid", "19-20model", 3, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "大众", "Hui", "2021款", "Raise", "VW（MQB）", "Hui ang", "2020model", 3, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "大众", "高尔夫8", "2021款", "Raise", "VW（MQB）", "Golf 8", "2021model", 3, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("睿志诚", "大众", "帕萨特 B8", "默认", "Raise", "VW（MQB）", "Passat B8", "Default", 3, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
