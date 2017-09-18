package com.npci.financial.isc.model.converter.isc.transaction;

import com.npci.financial.isc.model.type.isc.transaction.InteractionPoint;

import javax.persistence.AttributeConverter;

/**
 * Created by h.mohammadi on 9/17/2017.
 */
public class InteractionPointConverter implements AttributeConverter<InteractionPoint, String> {
    @Override
    public String convertToDatabaseColumn(InteractionPoint interactionPoint) {
        if (interactionPoint != null)
            return interactionPoint.getValue();

        return null;
    }

    @Override
    public InteractionPoint convertToEntityAttribute(String value) {
        return InteractionPoint.getInstance(value);
    }
}
