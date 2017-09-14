package com.npci.financial.isc.core.atm.ndc.listener;

import com.npci.financial.isc.core.atm.ndc.message.NdcMsg;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.*;
import org.jpos.q2.iso.QMUX;
import org.jpos.util.LogSource;
import org.jpos.util.Logger;
import org.jpos.util.NameRegistrar;

import java.io.IOException;

/**
 * Created by h.mohammadi on 8/31/2017.
 */
public class AtmNdcRequestListener implements ISORequestListener, LogSource, Configurable {
    private Logger logger;
    private String realm;
    private Configuration cfg;

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;
    }

    @Override
    public boolean process(ISOSource source, ISOMsg m) {
        NdcMsg ndcMsg = (NdcMsg) m;

        try {
            MUX mux = QMUX.getMUX("switch-ndc-mux");
            if (mux.isConnected()) {
                System.out.println("Mux is connected!");
                mux.send(ndcMsg);
            }
        } catch (NameRegistrar.NotFoundException | ISOException | IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public void setLogger(Logger logger, String realm) {
        this.logger = logger;
        this.realm = realm;
    }

    @Override
    public String getRealm() {
        return realm;
    }

    @Override
    public Logger getLogger() {
        return logger;
    }
}
