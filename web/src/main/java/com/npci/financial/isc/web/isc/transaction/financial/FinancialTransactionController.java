package com.npci.financial.isc.web.isc.transaction.financial;

import com.npci.financial.isc.api.GeneralServiceApi;
import com.npci.financial.isc.api.isc.transaction.financial.FinancialTransactionService;
import com.npci.financial.isc.model.to.isc.transaction.financial.Transaction;
import com.npci.financial.isc.web.controller.base.ControllerBase;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.MUX;
import org.jpos.q2.iso.QMUX;
import org.jpos.util.NameRegistrar;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;


@Named
@ViewScoped
public class FinancialTransactionController extends ControllerBase<Transaction> implements Serializable {
    private static final long serialVersionUID = -910139084219917757L;

    @EJB
    private FinancialTransactionService service;

    public FinancialTransactionController() {
        super(Transaction.class);
    }

    @Override
    public GeneralServiceApi<Transaction> getGeneralServiceApi() {
        return service;
    }

    @Override
    public void afterLoad() {
        System.out.println("afterLoad");
    }

    @Override
    protected String afterCreate() {
        /*
        try {
            MUX mux = QMUX.getMUX("shetab-mux");
            if (mux != null && mux.isConnected()) {
                mux.send(new ISOMsg());
            }
        } catch (NameRegistrar.NotFoundException | ISOException | IOException e) {
            e.printStackTrace();
        }
        */
        return super.afterCreate();
    }

    public Transaction getTransaction() {
        return entity;
    }

    public void setTransaction(Transaction transaction) {
        entity = transaction;
    }
}
