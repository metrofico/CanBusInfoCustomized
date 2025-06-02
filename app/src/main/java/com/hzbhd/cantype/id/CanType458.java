package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType458 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "MD", "小康", "500（支持空调） ", "Internal", "MD", "Xiaokang P57 Project", "500（Supports air conditioning） ", 458, 0, 1, 0, 1, 1, 0, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
