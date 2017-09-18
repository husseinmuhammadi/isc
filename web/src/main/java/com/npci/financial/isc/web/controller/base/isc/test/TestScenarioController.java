package com.npci.financial.isc.web.controller.base.isc.test;

import com.npci.financial.isc.api.GeneralServiceApi;
import com.npci.financial.isc.api.base.isc.test.TestScenarioService;
import com.npci.financial.isc.model.to.isc.test.TestScenario;
import com.npci.financial.isc.web.controller.base.ControllerBase;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class TestScenarioController extends ControllerBase<TestScenario> implements Serializable {

    public TestScenarioController() {
        super(TestScenario.class);
    }

    @EJB
    private TestScenarioService testScenarioService;

    @Override
    public void afterLoad() {
    }

    public TestScenario getTestScenario() {
        return super.getEntity();
    }

    public void setTestScenario(TestScenario switchTestScenario) {
        super.setEntity(switchTestScenario);
    }

    @Override
    public GeneralServiceApi<TestScenario> getGeneralServiceApi() {
        return testScenarioService;
    }

    @Override
    public void init() {
    }
}
