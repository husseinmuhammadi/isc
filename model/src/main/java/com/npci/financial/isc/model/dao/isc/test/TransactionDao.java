package com.npci.financial.isc.model.dao.isc.test;

import com.npci.financial.isc.model.base.GenericDao;
import com.npci.financial.isc.model.to.isc.transaction.financial.Transaction;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
@Stateless
public class TransactionDao extends GenericDao<Transaction> {
    public TransactionDao() {
        super(Transaction.class);
    }

    @Override
    public List<Transaction> findAll() {
        return createNamedQuery(Transaction.FIND_ALL).getResultList();
    }
}
