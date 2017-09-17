package com.npci.financial.isc.web.controller.base.isc.test;


import com.npci.financial.isc.api.GeneralServiceApi;
import com.npci.financial.isc.model.to.isc.test.TestCase;
import com.npci.financial.isc.web.controller.base.ControllerBase;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class TestCaseController extends ControllerBase<TestCase> implements Serializable {

    public TestCaseController() {
        super(TestCase.class);
    }

    @Override
    public GeneralServiceApi getGeneralServiceApi() {
        return null;
    }

    @Override
    public void afterLoad() {

    }
}
