package com.hzbhd.metrofica.cantype.id;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.CanTypeBase;

import java.util.ArrayList;

public final class CanType0 implements CanTypeBase {

    private final ArrayList<CanTypeAllEntity> list;

    public CanType0() {
        list = new ArrayList<>();
        list.add(new CanTypeAllEntity("无 ",           // Chinese text (prob. means "none")
                "默认",           // Default
                "默认", "默认", "No Can", " Defualt",     // Typo preserved from your code
                "Default", "years", 0, 0, 0, 0, 1, 0, 0, 0, 0, "null"));
    }

    public ArrayList<CanTypeAllEntity> getList() {
        return list;
    }
}
