package com.npci.financial.isc.model.type.isc.transaction;

import com.npci.financial.isc.model.exceptions.TypeNotFoundException;
import com.npci.financial.isc.model.type.base.EnumField;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
public enum TransactionMode implements EnumField<String> {
    ONLINE("N"),
    OFFLINE("Y"),
    REJETC("R");

    private String transactionMode;

    TransactionMode(String transactionMode) {
        this.transactionMode = transactionMode;
    }

    public static TransactionMode getInstance(String value) {
        if (value == null || value.isEmpty())
            return null;

        for (TransactionMode transactionMode : values()) {
            if (transactionMode.getValue().equals(value))
                return transactionMode;
        }

        throw new TypeNotFoundException(TransactionMode.class.getName()
                + " Error creating instance for transaction mode : " + value);
    }

    @Override
    public String getValue() {
        return this.transactionMode;
    }

    @Override
    public String getFullName() {
        return this.getClass().getName() + "." + this.name();
    }

}
