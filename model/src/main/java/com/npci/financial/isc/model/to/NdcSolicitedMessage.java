package com.npci.financial.isc.model.to;

import com.npci.financial.isc.model.base.EntityBase;

import javax.persistence.*;

/**
 * Created by h.mohammadi on 9/5/2017.
 */
@Entity
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "NDC_TRANSACTION_REQUEST_SEQ")
@Table(name = "NDC_SOLICITED_MESSAGE")
@NamedQueries({
        @NamedQuery(name = NdcSolicitedMessage.FIND_ALL, query = "select t from NdcSolicitedMessage t where t.deleted = false ")
})
public class NdcSolicitedMessage extends EntityBase {
    public static final String FIND_ALL = "NdcSolicitedMessage.findAll";
}
