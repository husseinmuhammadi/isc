package com.npci.financial.isc.web.controller.base.atm.ndc;

import com.npci.financial.isc.api.GeneralServiceApi;
import com.npci.financial.isc.web.controller.base.ControllerBase;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class TransactionController extends ControllerBase implements Serializable {

    public TransactionController(Class entityBeanType) {
        super(entityBeanType);
    }

    @Override
    public GeneralServiceApi getGeneralServiceApi() {
        return null;
    }

    @Override
    public void afterLoad() {

    }
}
