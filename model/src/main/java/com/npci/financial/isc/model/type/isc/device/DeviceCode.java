package com.npci.financial.isc.model.type.isc.device;

import com.npci.financial.isc.model.exceptions.TypeNotFoundException;
import com.npci.financial.isc.model.type.base.EnumField;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
public enum DeviceCode implements EnumField<String> {
    ATM("02"), // ATM
    VRU("07"), // PHONE
    MOB("05"), // MOBILE
    POS("14"), // POS
    PAD("03"), // PINPAD
    IKT("43"), // KIOSK
    INT("59"), // INTERNET
    SYS("72"); // SYSTEM

    private String deviceCode;

    DeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public static DeviceCode getInstance(String value) {
        if (value == null || value.isEmpty())
            return null;

        for (DeviceCode deviceCode : values()) {
            if (deviceCode.getValue().equals(value))
                return deviceCode;
        }

        throw new TypeNotFoundException(DeviceCode.class.getName()
                + " Error creating instance for device code: " + value);
    }

    @Override
    public String getValue() {
        return this.deviceCode;
    }

    @Override
    public String getFullName() {
        return this.getClass().getName() + "." + this.name();
    }

}
