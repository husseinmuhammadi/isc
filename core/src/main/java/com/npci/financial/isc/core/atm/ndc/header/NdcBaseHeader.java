package com.npci.financial.isc.core.atm.ndc.header;

import org.jpos.iso.ISOHeader;
import org.jpos.util.Loggeable;

import java.io.PrintStream;

/**
 * Created by Hossein on 12/26/2017.
 */
public class NdcBaseHeader implements ISOHeader, Loggeable {

    protected byte[] header;

    @Override
    public byte[] pack() {
        return new byte[0];
    }

    @Override
    public int unpack(byte[] b) {
        return 0;
    }

    @Override
    public void setDestination(String dst) {

    }

    @Override
    public String getDestination() {
        return null;
    }

    @Override
    public void setSource(String src) {

    }

    @Override
    public String getSource() {
        return null;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void swapDirection() {

    }

    @Override
    public void dump(PrintStream p, String indent) {

    }

    public Object clone()
    {
        try {
            NdcBaseHeader h = (NdcBaseHeader) super.clone();
            if (this.header != null)
                h.header = this.header.clone();
            return h;
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}
