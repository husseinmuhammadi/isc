package com.npci.financial.isc.model.type.isc.transaction;

import com.npci.financial.isc.model.exceptions.TypeNotFoundException;
import com.npci.financial.isc.model.type.base.EnumField;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
public enum ProcessingCode implements EnumField<String> {
    PURCHASE("00"),
    CASH_WITHDRAWAL("01"),
    BILL_PAYMENT("17"),
    BALANCE_ENQUIRY("31"),
    CUSTOMER_ENQUIRY("33"),
    FUND_TRANSFER("40"),
    FUND_TRANSFER_DR("46"),
    FUND_TRANSFER_CR("47"),
    PIN_CHANGE("90"),
    MINI_STATEMENT("91"),
    PIN_VERIFICATION("92"),
    PIN2_CHANGE("93"),
    // For ndc purpose only
    CASH_REVERSAL("15", true),
    BILL_PAYMENT_VALIDATE("19", true),
    PINPAD_PIN_VERIFICATION("94", true),
    ACCOUNT_INQUIRY("98", true),
    UPDATE_CASSETTE_COUNTERS_1_AND_2("99", true),
    // UPDATE_CASSETTE_COUNTERS_3_AND_4("00"),
    NOT_DEFINED("ND", true),
    ;

    private String processingCode;
    private final boolean ndc;

    ProcessingCode(String processingCode) {
        this(processingCode, false);
    }

    ProcessingCode(String processingCode, boolean ndc) {
        this.processingCode = processingCode;
        this.ndc = ndc;
    }

    public static ProcessingCode getInstance(String value) {
        if (value == null || value.isEmpty())
            return null;

        for (ProcessingCode processingCode : values()) {
            if (processingCode.getValue().equals(value))
                return processingCode;
        }

        throw new TypeNotFoundException(ProcessingCode.class.getName()
                + " Error creating instance for Processing Code : " + value);
    }

    @Override
    public String getValue() {
        return this.processingCode;
    }

    @Override
    public String getFullName() {
        return this.getClass().getName() + "." + this.name();
    }

    public boolean isNdc() {
        return ndc;
    }
}
