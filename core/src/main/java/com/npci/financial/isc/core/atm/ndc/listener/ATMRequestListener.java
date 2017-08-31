package com.npci.financial.isc.core.atm.ndc.listener;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;
import org.jpos.util.LogSource;
import org.jpos.util.Logger;

/**
 * Created by h.mohammadi on 8/31/2017.
 */
public class ATMRequestListener implements ISORequestListener, LogSource, Configurable {
    private Logger logger;
    private String realm;
    private Configuration cfg;

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;
    }

    @Override
    public boolean process(ISOSource source, ISOMsg m) {
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
