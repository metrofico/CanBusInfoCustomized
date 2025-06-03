package com.metrofico.metrofica.cantype;

import com.metrofico.metrofica.canbus.adapter.bean.CanTypeAllEntity;

import java.util.ArrayList;

public interface CanTypeBase {
    ArrayList<CanTypeAllEntity> getList();
}