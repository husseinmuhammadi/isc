package com.npci.financial.isc.service.base.isc.test;

import com.npci.financial.isc.api.base.isc.test.TestCaseService;
import com.npci.financial.isc.api.base.isc.test.TestScenarioService;
import com.npci.financial.isc.model.base.GenericDao;
import com.npci.financial.isc.model.dao.isc.test.TestCaseDao;
import com.npci.financial.isc.model.dao.isc.test.TestScenarioDao;
import com.npci.financial.isc.model.to.isc.test.TestCase;
import com.npci.financial.isc.model.to.isc.test.TestScenario;
import com.npci.financial.isc.service.base.GeneralServiceImpl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(TestCaseService.class)
public class TestCaseServiceImpl extends GeneralServiceImpl<TestCase> implements TestCaseService {

    @EJB
    private TestCaseDao dao;

    @Override
    public GenericDao<TestCase> getGenericDao() {
        return dao;
    }
}
