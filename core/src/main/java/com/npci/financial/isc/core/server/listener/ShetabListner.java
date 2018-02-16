package com.npci.financial.isc.core.server.listener;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.util.Log;
import org.jpos.util.LogSource;
import org.jpos.util.Logger;
import org.slf4j.LoggerFactory;

import javax.resource.spi.work.TransactionContext;

public class ShetabListner extends Log implements ISORequestListener, LogSource, Configurable {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(ShetabListner.class.getName());

    private Logger logger_;
    private String realm_;

    protected Space space_;
    protected String queue_;

    protected long respTime;
    protected int expiryTime;

    private Configuration configuration_;

    public ShetabListner() {

    }

    public Logger getLogger() {
        return this.logger_;
    }

    public String getRealm() {
        return this.realm_;
    }

    public void setLogger(Logger logger, String realm) {
        this.logger_ = logger;
        this.realm_ = realm;
    }

    //region Overrides
    @Override
    public void setConfiguration(Configuration configuration) throws ConfigurationException {
        info("Configuration");
        this.configuration_ = configuration;
        queue_ = configuration.get("queue", null);
        respTime = Long.valueOf(configuration.get("respTime", null));
        if (queue_ == null) {
            throw new ConfigurationException("Property not specified : queue");
        }
        space_ = SpaceFactory.getSpace(configuration.get("space", null));
        expiryTime = Integer.parseInt(configuration.get("expiry_time", "7000"));
    }

    @Override
    public boolean process(ISOSource isoSource, ISOMsg isoMsg) {
        info("ShetabListner -> process()");


        logger.info("Putting transaction in SHETAB queue");
        space_.out(queue_, new TransactionContext());

        return true;
    }
    //endregion Overrides
}
