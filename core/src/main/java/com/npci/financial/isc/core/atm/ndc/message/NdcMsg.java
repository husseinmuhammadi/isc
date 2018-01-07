package com.npci.financial.isc.core.atm.ndc.message;

import com.npci.financial.isc.core.iso.NdcRequest;
import com.npci.financial.isc.core.iso.NdcResponse;
import org.jpos.iso.ISOMsg;

/**
 * Created by h.mohammadi on 9/13/2017.
 */
public class NdcMsg extends ISOMsg {
    protected NdcRequest request;
    protected NdcResponse response;
}
