package com.npci.financial.isc.model.converter.isc.transaction;

import com.npci.financial.isc.model.type.isc.transaction.TransactionMode;

import javax.persistence.AttributeConverter;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
public class TransactionModeConverter implements AttributeConverter<TransactionMode, String> {
    @Override
    public String convertToDatabaseColumn(TransactionMode transactionMode) {
        if (transactionMode != null)
            return transactionMode.getValue();

        return null;
    }

    @Override
    public TransactionMode convertToEntityAttribute(String value) {
        return TransactionMode.getInstance(value);
    }
}
