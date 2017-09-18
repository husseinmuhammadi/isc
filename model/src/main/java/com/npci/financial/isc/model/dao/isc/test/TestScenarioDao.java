package com.npci.financial.isc.model.dao.isc.test;

import com.npci.financial.isc.model.base.GenericDao;
import com.npci.financial.isc.model.to.isc.test.TestScenario;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
@Stateless
public class TestScenarioDao extends GenericDao<TestScenario> {
    public TestScenarioDao() {
        super(TestScenario.class);
    }

    @Override
    public List<TestScenario> findAll() {
        return createNamedQuery(TestScenario.FIND_ALL).getResultList();
    }
}
