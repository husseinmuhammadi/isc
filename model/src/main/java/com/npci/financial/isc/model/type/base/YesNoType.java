package com.npci.financial.isc.model.type.base;

import com.npci.financial.isc.model.exceptions.TypeNotFoundException;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
public enum YesNoType implements EnumField<String> {
    Yes("Y"),
    No("N"),
    ;

    private String type;

    YesNoType(String type) {
        this.type = type;
    }

    public static YesNoType getInstance(String value) {
        if (value == null || value.isEmpty())
            return null;

        for (YesNoType type : values()) {
            if (type.getValue().equals(value))
                return type;
        }

        throw new TypeNotFoundException(YesNoType.class.getName()
                + " Error creating instance for Yes/No type: " + value);
    }

    @Override
    public String getValue() {
        return this.type;
    }

    @Override
    public String getFullName() {
        return this.getClass().getName() + "." + this.name();
    }

}
