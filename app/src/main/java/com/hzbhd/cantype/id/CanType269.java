package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;


public final class CanType269 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("内部协议", "吉普", "四门版", "默认", "Internal", "Jeep", "四门版 Four doors", "Defualt", 269, 0, 0, 3, 1, 1, 1, 0, 0, "null"), new CanTypeAllEntity("内部协议", "吉普", "两门版", "默认", "Internal", "Jeep", "两门版 Two doors", "Defualt", 269, 1, 0, 3, 1, 1, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
