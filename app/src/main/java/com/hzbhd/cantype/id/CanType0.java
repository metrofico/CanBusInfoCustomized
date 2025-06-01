package com.hzbhd.cantype.id;

import com.hzbhd.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.cantype.CanTypeBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
