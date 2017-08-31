package com.npci.financial.isc.core.atm.ndc.channel;
import org.jpos.iso.BaseChannel;
import org.jpos.iso.ISOPackager;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by h.mohammadi on 8/31/2017.
 */
public class AtmNdcProxyChannel extends BaseChannel {
    public AtmNdcProxyChannel() {
        super();
    }

    public AtmNdcProxyChannel(String host, int port, ISOPackager p) {
        super(host, port, p);
    }

    public AtmNdcProxyChannel(ISOPackager p) throws IOException {
        super(p);
    }

    public AtmNdcProxyChannel(ISOPackager p, ServerSocket serverSocket) throws IOException {
        super(p, serverSocket);
    }

    @Override
    protected int getHeaderLength() {
        // return super.getHeaderLength();
        return 4;
    }
}
