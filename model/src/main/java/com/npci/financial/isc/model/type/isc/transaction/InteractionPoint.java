package com.npci.financial.isc.model.type.isc.transaction;

import com.npci.financial.isc.model.exceptions.TypeNotFoundException;
import com.npci.financial.isc.model.type.base.EnumField;

public enum InteractionPoint implements EnumField<String> {
    Issuer("I"),
    Acquirer("A"),
    OnUs("O");

    private String interactionPoint;

    InteractionPoint(String interactionPoint) {
        this.interactionPoint = interactionPoint;
    }

    public static InteractionPoint getInstance(String value) {
        if (value == null || value.isEmpty())
            return null;

        for (InteractionPoint interactionPoint : values()) {
            if (interactionPoint.getValue().equals(value))
                return interactionPoint;
        }

        throw new TypeNotFoundException(InteractionPoint.class.getName()
                + " Error creating instance for Interaction Point: " + value);
    }

    @Override
    public String getValue() {
        return this.interactionPoint;
    }

    @Override
    public String getFullName() {
        return this.getClass().getName() + "." + this.name();
    }
}