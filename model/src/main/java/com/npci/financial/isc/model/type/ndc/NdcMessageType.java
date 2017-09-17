package com.npci.financial.isc.model.type.ndc;

import com.npci.financial.isc.model.exceptions.TypeNotFoundException;

/**
 * Created by h.mohammadi on 9/16/2017.
 */
public enum NdcMessageType {
    TRANSACTION_REQUEST_MESSAGE("11"), //
    UNSOLICITED_STATUS_MESSAGE("12"), //
    SOLICITED_STATUS_MESSAGE("22"), //
    SOLICITED_STATUS_MESSAGE_23("23"), // Update KCV data
    TERMINAL_COMMAND("10"), //
    ;

    private String ndcMessageType;

    NdcMessageType(String ndcMessageType) {
        this.ndcMessageType = ndcMessageType;
    }

    public static NdcMessageType getInstance(String value) {
        if (value == null || value.isEmpty())
            return null;

        for (NdcMessageType ndcMessageType : values()) {
            if (ndcMessageType.getValue().equals(value))
                return ndcMessageType;
        }

        throw new TypeNotFoundException(NdcMessageType.class.getName()
                + " Error creating instance for NdcMessageType: " + value);
    }

    public String getValue() {
        return this.ndcMessageType;
    }

    public String getFullName() {
        return this.getClass().getName() + "." + this.name();
    }
}
