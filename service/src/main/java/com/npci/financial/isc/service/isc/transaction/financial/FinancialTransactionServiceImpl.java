package com.npci.financial.isc.service.isc.transaction.financial;

import com.npci.financial.isc.api.isc.transaction.financial.FinancialTransactionService;
import com.npci.financial.isc.model.base.GenericDao;
import com.npci.financial.isc.model.dao.isc.test.TransactionDao;
import com.npci.financial.isc.model.to.isc.transaction.financial.Transaction;
import com.npci.financial.isc.service.base.GeneralServiceImpl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(FinancialTransactionService.class)
public class FinancialTransactionServiceImpl extends GeneralServiceImpl<Transaction> implements FinancialTransactionService {
    @EJB
    private TransactionDao dao;

    @Override
    public GenericDao<Transaction> getGenericDao() {
        return dao;
    }
}
