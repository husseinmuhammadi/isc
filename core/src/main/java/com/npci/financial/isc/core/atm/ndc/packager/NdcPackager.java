package com.npci.financial.isc.core.atm.ndc.packager;

import com.npci.financial.isc.core.atm.ndc.message.NdcMsg;
import org.jpos.iso.ISOComponent;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by h.mohammadi on 9/13/2017.
 */
public class NdcPackager implements ISOPackager {

    @Override
    public byte[] pack(ISOComponent isoComponent) throws ISOException {
        NdcMsg ndcMsg = (NdcMsg) isoComponent;
        return ndcMsg.getMessage();
    }

    @Override
    public int unpack(ISOComponent isoComponent, byte[] bytes) throws ISOException {
        NdcMsg ndcMsg = (NdcMsg) isoComponent;
        ndcMsg.setMessage(bytes);
        /*
        try {
            unpack(isoComponent, new ByteArrayInputStream(bytes));
        } catch (IOException e) {
            e.printStackTrace();
            throw new ISOException(e);
        }
        */
        return bytes.length;
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
        return new NdcMsg();
    }
}
