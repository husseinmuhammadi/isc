package com.npci.financial.isc.web.controller.base.common;


import com.npci.financial.isc.model.type.isc.device.DeviceCode;
import com.npci.financial.isc.web.controller.base.AbstractController;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SelectItemsController extends AbstractController implements Serializable {
    private static final long serialVersionUID = 1196654382527434076L;

    public Map<String, String> getDeviceCodeItems() {
        Map<String, String> items = new HashMap<String, String>();
        items.put("", getLabel("label.select.empty"));
        for (DeviceCode deviceCode : DeviceCode.values()) {
            items.put(deviceCode.name(), getLabel(deviceCode.getFullName()));
        }
        return items;
    }

}
