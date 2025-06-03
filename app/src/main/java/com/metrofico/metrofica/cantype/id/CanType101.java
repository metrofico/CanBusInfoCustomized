package com.metrofico.metrofica.cantype.id;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.metrofico.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;


public final class CanType101 implements CanTypeBase {
   private final ArrayList list = CollectionsKt.arrayListOf(new CanTypeAllEntity[]{new CanTypeAllEntity("欣朴 ", "奔驰", "A", "(W169)", "Simple", "Benz", "A", "(W169)", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欣朴 ", "奔驰", "B", "(W245)", "Simple", "Benz", "B", "(W245)", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欣朴 ", "奔驰", "唯亚诺", "默认", "Simple", "Benz", "Viano", "Defualt", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欣朴 ", "奔驰", "凌特", "默认", "Simple", "Benz", "Sprinter", "Defualt", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("欣朴 ", "奔驰", "威霆", "2003", "Simple", "Benz", "Vito", "2003", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "奔驰", "A", "(W169)", "BAOGOOD", "Benz", "A Class", "(W169)", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "奔驰", "B", "(W245)", "BAOGOOD", "Benz", "B Class", "(W245)", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "奔驰", "唯亚诺", "默认", "BAOGOOD", "Benz", "Viano", "Defualt", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "奔驰", "凌特", "默认", "BAOGOOD", "Benz", "Sprinter", "Defualt", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null"), new CanTypeAllEntity("宝谷", "奔驰", "威霆", "2003", "BAOGOOD", "Benz", "Vito", "2003", 101, 0, 0, 0, 1, 0, 1, 0, 0, "null")});

   public ArrayList getList() {
      return this.list;
   }
}
