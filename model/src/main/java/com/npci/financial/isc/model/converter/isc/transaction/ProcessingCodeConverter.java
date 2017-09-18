package com.npci.financial.isc.model.converter.isc.transaction;

import com.npci.financial.isc.model.type.isc.transaction.ProcessingCode;

import javax.persistence.AttributeConverter;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
public class ProcessingCodeConverter implements AttributeConverter<ProcessingCode, String> {
    @Override
    public String convertToDatabaseColumn(ProcessingCode processingCode) {
        if (processingCode != null)
            return processingCode.getValue();

        return null;
    }

    @Override
    public ProcessingCode convertToEntityAttribute(String processingCodeValue) {
        return ProcessingCode.getInstance(processingCodeValue);
    }
}
