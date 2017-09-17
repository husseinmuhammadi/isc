package com.npci.financial.isc.web.controller.base.isc.test;

import com.npci.financial.isc.api.GeneralServiceApi;
import com.npci.financial.isc.model.to.isc.test.TestScenario;
import com.npci.financial.isc.web.controller.base.ControllerBase;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class TestScenarioController extends ControllerBase<TestScenario> implements Serializable {

    public TestScenarioController() {
        super(TestScenario.class);
    }

    @Override
    public GeneralServiceApi<TestScenario> getGeneralServiceApi() {
        return null;
    }

    @Override
    public void afterLoad() {

    }
}
