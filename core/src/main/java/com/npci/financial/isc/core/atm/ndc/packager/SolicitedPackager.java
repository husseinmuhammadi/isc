package com.npci.financial.isc.core.atm.ndc.packager;

import com.npci.financial.isc.core.atm.ndc.message.NdcMsg;
import org.jpos.iso.ISOComponent;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by h.mohammadi on 1/1/2018.
 */
public class SolicitedPackager implements ISOPackager {

    @Override
    public byte[] pack(ISOComponent isoComponent) throws ISOException {
        return new byte[0];
    }

    @Override
    public int unpack(ISOComponent isoComponent, byte[] bytes) throws ISOException {
        return 0;
    }

    @Override
    public void unpack(ISOComponent isoComponent, InputStream inputStream) throws IOException, ISOException {

    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getFieldDescription(ISOComponent isoComponent, int i) {
        return null;
    }

    @Override
    public ISOMsg createISOMsg() {
        return null;
    }
}
