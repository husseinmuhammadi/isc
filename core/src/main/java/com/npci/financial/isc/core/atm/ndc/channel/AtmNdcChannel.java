package com.npci.financial.isc.core.atm.ndc.channel;

import org.jpos.iso.BaseChannel;
import org.jpos.iso.ISOHeader;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * Created by h.mohammadi on 8/31/2017.
 */
public class AtmNdcChannel extends BaseChannel {
    public AtmNdcChannel() {
        super();
    }

    public AtmNdcChannel(String host, int port, ISOPackager p) {
        super(host, port, p);
    }

    public AtmNdcChannel(ISOPackager p) throws IOException {
        super(p);
    }

    public AtmNdcChannel(ISOPackager p, ServerSocket serverSocket) throws IOException {
        super(p, serverSocket);
    }

    @Override
    protected byte[] streamReceive() throws IOException {
        int i = 0;
        byte[] buf = new byte[4096];
        for (i = 0; i < 4096; i++) {
            int c = -1;
            try {
                c = serverIn.read();
            } catch (SocketException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (c == 3) {
                break;
            } else if (c == -1) {
                throw new EOFException("connection closed");
            }
            buf[i] = (byte) c;
        }
        if (i == 4096) {
            throw new IOException("packet too long");
        }

        byte[] d = new byte[i + 1];
        System.arraycopy(buf, 0, d, 0, i);
        d[i] = 3;
        LogEvent evt = new LogEvent(this, "fsd-channel-debug");
        evt.addMessage("received message: " + new String(d, StandardCharsets.US_ASCII));
        Logger.log(evt);
        return d;
    }

    @Override
    protected int getHeaderLength() {
        // return super.getHeaderLength();
        return 4;
    }

    @Override
    protected int getHeaderLength(byte[] b) {
        return super.getHeaderLength(b);
    }

    @Override
    protected int getHeaderLength(ISOMsg m) {
        return super.getHeaderLength(m);
    }

    @Override
    protected ISOHeader getDynamicHeader(byte[] image) {
        return super.getDynamicHeader(image);
    }

    @Override
    public byte[] getHeader() {
        return super.getHeader();
    }


}
