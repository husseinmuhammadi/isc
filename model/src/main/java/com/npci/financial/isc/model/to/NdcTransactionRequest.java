package com.npci.financial.isc.model.to;

import com.npci.financial.isc.model.base.EntityBase;

import javax.persistence.*;

/**
 * Created by h.mohammadi on 9/5/2017.
 */
@Entity
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "NDC_TRANSACTION_REQUEST_SEQ")
@Table(name = "NDC_TRANSACTION_REQUEST")
@NamedQueries({
        @NamedQuery(name = NdcTransactionRequest.FIND_ALL, query = "select t from NdcTransactionRequest t where t.deleted = false ")
})
public class NdcTransactionRequest extends EntityBase {
    public static final String FIND_ALL = "NdcTransactionRequest.findAll";
}
