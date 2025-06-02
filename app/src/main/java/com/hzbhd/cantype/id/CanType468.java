package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType468 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("路征", "本田", "思域", "06-11款 (高配 High Config)", "Luzheng", "Honda", "Civic ", "06-11model (High configuration High Config)", 468, 0, 1, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("路征", "本田", "思域", "06-11款 (低配 Low Config)", "Luzheng", "Honda", "Civic ", "06-11model (Low configuration Low Config)", 468, 0, 2, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
