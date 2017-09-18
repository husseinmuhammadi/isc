package com.npci.financial.isc.model.converter.isc.test;

import com.npci.financial.isc.model.type.isc.test.TestConditionType;

import javax.persistence.AttributeConverter;

/**
 * Created by h.mohammadi on 9/17/2017.
 */
public class TestConditionTypeConverter implements AttributeConverter<TestConditionType, String> {
    @Override
    public String convertToDatabaseColumn(TestConditionType testConditionType) {
        if (testConditionType != null)
            return testConditionType.getValue();

        return null;
    }

    @Override
    public TestConditionType convertToEntityAttribute(String value) {
        return TestConditionType.getInstance(value);
    }
}
