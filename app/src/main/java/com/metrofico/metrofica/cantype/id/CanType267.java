package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType267 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欧迪", "本田", "奥德赛", "2003-2008", "Oudi", "Honda", "Odyssey", "2003-2008", 267, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "本田", "雅阁", "默认", "Oudi", "Honda", "Accord 8", "Defualt", 267, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欧迪", "本田", "歌诗图", "2012-2014", "Oudi", "Honda", "Crosstour", "2012-2014", 267, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
