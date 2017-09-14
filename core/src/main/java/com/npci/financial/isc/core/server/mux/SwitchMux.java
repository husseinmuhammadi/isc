package com.npci.financial.isc.core.server.mux;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.q2.iso.QMUX;

/**
 * Created by h.mohammadi on 9/13/2017.
 */
public class SwitchMux extends QMUX{
    @Override
    public String getKey(ISOMsg m) throws ISOException {
        return super.getKey(m);
    }
}
