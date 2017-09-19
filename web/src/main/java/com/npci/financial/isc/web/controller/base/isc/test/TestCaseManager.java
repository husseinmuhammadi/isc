package com.npci.financial.isc.web.controller.base.isc.test;

import com.npci.financial.isc.api.GeneralServiceApi;
import com.npci.financial.isc.api.base.isc.test.TestCaseService;
import com.npci.financial.isc.model.to.isc.test.TestCase;
import com.npci.financial.isc.web.controller.base.ManagerBase;

import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class TestCaseManager extends ManagerBase<TestCase> implements Serializable {

    //region Constructor
    public TestCaseManager() {
        super(TestCase.class);
    }
    //endregion Constructor

    //region Fields
    private List<TestCase> testCases;
    //endregion Fields

    //region Services
    @EJB
    private TestCaseService service;
    //endregion Services

    //region Overrides
    @Override
    public GeneralServiceApi<TestCase> getGeneralServiceApi() {
        return service;
    }

    @Override
    protected void onLoad() {

    }
    //endregion Overrides

    //region Getter & Setter
    public List<TestCase> getTestCases() {
        return entityList;
    }
    //endregion Getter & Setter
}
