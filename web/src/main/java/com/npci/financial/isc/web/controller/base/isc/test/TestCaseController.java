package com.npci.financial.isc.web.controller.base.isc.test;


import com.npci.financial.isc.api.GeneralServiceApi;
import com.npci.financial.isc.api.base.isc.test.TestCaseService;
import com.npci.financial.isc.model.to.isc.test.TestCase;
import com.npci.financial.isc.web.controller.base.ControllerBase;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class TestCaseController extends ControllerBase<TestCase> implements Serializable {

    //region Constructor
    public TestCaseController() {
        super(TestCase.class);
    }
    //endregion Constructor

    //region Fields
    private TestCase testCase;
    //endregion Fields

    //region Services
    @EJB
    private TestCaseService service;
    //endregion Services

    //region Override
    @Override
    public GeneralServiceApi getGeneralServiceApi() {
        return service;
    }

    @Override
    public void afterLoad() {

    }
    //endregion Override

    //region Setter & Getter
    public TestCase getTestCase() {
        return entity;
    }

    public void setTestCase(TestCase testCase) {
        entity = testCase;
    }
    //endregion Setter & Getter
}
