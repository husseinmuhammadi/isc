package com.npci.financial.isc.web.controller.base.isc.test;

import com.npci.financial.isc.api.GeneralServiceApi;
import com.npci.financial.isc.api.base.isc.test.TestScenarioService;
import com.npci.financial.isc.model.to.isc.test.TestScenario;
import com.npci.financial.isc.web.controller.base.ManagerBase;

import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class TestScenarioManager extends ManagerBase<TestScenario> implements Serializable {

    private TestScenarioService testScenarioService;

    public TestScenarioManager() {
        super(TestScenario.class);
    }

    @Override
    protected void onLoad() {

    }

    @Override
    public GeneralServiceApi<TestScenario> getGeneralServiceApi() {
        return testScenarioService;
    }

    public List<TestScenario> getTestScenarios() {
        return entityList;
    }
}
