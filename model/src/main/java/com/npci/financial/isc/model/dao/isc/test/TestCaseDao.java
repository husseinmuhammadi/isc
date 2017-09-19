package com.npci.financial.isc.model.dao.isc.test;

import com.npci.financial.isc.model.base.GenericDao;
import com.npci.financial.isc.model.to.isc.test.TestCase;
import com.npci.financial.isc.model.to.isc.test.TestScenario;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
@Stateless
public class TestCaseDao extends GenericDao<TestCase> {
    public TestCaseDao() {
        super(TestCase.class);
    }

    @Override
    public List<TestCase> findAll() {
        return createNamedQuery(TestCase.FIND_ALL).getResultList();
    }
}
