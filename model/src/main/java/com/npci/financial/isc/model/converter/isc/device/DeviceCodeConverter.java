package com.npci.financial.isc.model.converter.isc.device;

import com.npci.financial.isc.model.type.isc.device.DeviceCode;

import javax.persistence.AttributeConverter;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
public class DeviceCodeConverter implements AttributeConverter<DeviceCode, String> {
    @Override
    public String convertToDatabaseColumn(DeviceCode deviceCode) {
        if (deviceCode != null)
            return deviceCode.getValue();

        return null;
    }

    @Override
    public DeviceCode convertToEntityAttribute(String value) {
        return DeviceCode.getInstance(value);
    }
}
