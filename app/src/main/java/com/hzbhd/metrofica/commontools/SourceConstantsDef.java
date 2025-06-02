package com.hzbhd.metrofica.commontools;

public class SourceConstantsDef {
    public enum MODULE_ID {
        DAEMON(0),
        MIDWARE(1),
        SETTING(2),
        SHARE_DATA(3),
        KEY_DISPATCHER(4),
        SOURCE_MANAGER(5),
        HARDWARE(6),
        FRAMEWORK(7),
        MCU(8),
        AUDIO(9),
        CAMERA(10),
        MEDIA_SCANNER(11),
        MEDIA(12),
        BLUETOOTH(13),
        RADIO(14),
        NAVI(15),
        MISC(16),
        CANBUS(17),
        AVM(18),
        SYSTEMUI(19),
        CARPLAY(20),
        ANDROIDAUTO(21),
        SETTINGAPP(22),
        LOG(23),
        BTMUSIC(24),
        VIDEO(25),
        MUSIC(26),
        BTPHONE(27),
        SPEECH(28),
        INIT(29),
        REVERSE_DETECT(30),
        DAB(31),
        DISC(32),
        BHD_LYRA(34),
        BHD_MS_TXZ(35),
        LCD(36),
        DVR(37),
        GYROSCOPE(38),
        UPGRADE(39),
        SXM(40);

        private int mValue;

        MODULE_ID(int i) {
            this.mValue = i;
        }

        public static MODULE_ID getType(int i) {
            for (MODULE_ID sourceConstantsDef$MODULE_ID : values()) {
                if (sourceConstantsDef$MODULE_ID.getValue() == i) {
                    return sourceConstantsDef$MODULE_ID;
                }
            }
            return null;
        }

        public int getValue() {
            return this.mValue;
        }
    }
}
