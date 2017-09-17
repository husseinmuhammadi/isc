package com.npci.financial.isc.model.to.ndc.msg;

import com.npci.financial.isc.model.base.EntityBase;

import javax.persistence.*;

/**
 * Created by h.mohammadi on 9/5/2017.
 */
@Entity
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "NDC_TRANSACTION_REQUEST_SEQ")
@Table(name = "NDC_TRANSACTION_REQUEST")
@NamedQueries({
        @NamedQuery(name = TransactionRequest.FIND_ALL, query = "select t from TransactionRequest t where t.deleted = false ")
})
public class TransactionRequest extends EntityBase {
    public static final String FIND_ALL = "TransactionRequest.findAll";
}
