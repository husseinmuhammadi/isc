package com.npci.financial.isc.core.atm.ndc.message;

import org.jpos.iso.ISOMsg;

/**
 * Created by h.mohammadi on 9/13/2017.
 */
public class NdcMsg extends ISOMsg {
    private byte[] message;

    public byte[] getMessage() {
        return message;
    }

    public void setMessage(byte[] message) {
        this.message = message;
    }
}
