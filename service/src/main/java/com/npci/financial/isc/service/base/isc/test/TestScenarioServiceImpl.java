package com.npci.financial.isc.service.base.isc.test;

import com.npci.financial.isc.api.base.isc.test.TestScenarioService;
import com.npci.financial.isc.model.base.GenericDao;
import com.npci.financial.isc.model.to.isc.test.TestScenario;
import com.npci.financial.isc.service.base.GeneralServiceImpl;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(TestScenarioService.class)
public class TestScenarioServiceImpl extends GeneralServiceImpl<TestScenario> implements TestScenarioService {
    @Override
    public GenericDao<TestScenario> getGenericDao() {
        return null;
    }
}
