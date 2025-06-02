package com.hzbhd.metrofica.cantype;

import com.hzbhd.metrofica.canbus.adapter.bean.CanTypeAllEntity;
import com.hzbhd.metrofica.cantype.id.CanType0;

import java.util.ArrayList;

import kotlin.jvm.internal.Intrinsics;

public final class CanTypeUtil {
    public static final CanTypeUtil INSTANCE = new CanTypeUtil();

    private CanTypeUtil() {
    }

    public final CanTypeBase getCanType(int i) {
        try {
            Object newInstance = Class.forName("com.hzbhd.metrofica.cantype.id.CanType" + i).newInstance();
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.hzbhd.metrofica.cantype.CanTypeBase");
            return (CanTypeBase) newInstance;
        } catch (Exception e) {
            e.printStackTrace();
            return new CanType0();
        }
    }

    public final ArrayList<CanTypeAllEntity> getCanTypeAllEntityByCompanyAndCategory(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "company");
        Intrinsics.checkNotNullParameter(str2, "category");
        ArrayList<CanTypeAllEntity> arrayList = new ArrayList<>();
        for (CanTypeAllEntity canTypeAllEntity : getCanType(i).getList()) {
            if (str.equals(canTypeAllEntity.getProtocol_company()) && str2.equals(canTypeAllEntity.getCar_category())) {
                arrayList.add(canTypeAllEntity);
            } else if (str.equals(canTypeAllEntity.getEnglish_protocol_company()) & str2.equals(canTypeAllEntity.getEnglish_car_category())) {
                arrayList.add(canTypeAllEntity);
            }
        }
        return arrayList;
    }
}