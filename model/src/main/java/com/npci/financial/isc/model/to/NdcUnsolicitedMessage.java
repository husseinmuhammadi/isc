package com.npci.financial.isc.model.to;

import com.npci.financial.isc.model.base.EntityBase;

import javax.persistence.*;

/**
 * Created by h.mohammadi on 9/5/2017.
 */
@Entity
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "NDC_UNSOLICITED_MESSAGE_SEQ")
@Table(name = "NDC_UNSOLICITED_MESSAGE")
@NamedQueries({
        @NamedQuery(name = NdcUnsolicitedMessage.FIND_ALL, query = "select t from NdcUnsolicitedMessage t where t.deleted = false ")
})
public class NdcUnsolicitedMessage extends EntityBase {
    public static final String FIND_ALL = "NdcUnsolicitedMessage.findAll";

    private byte[] message;

    public byte[] getMessage() {
        return message;
    }

    public void setMessage(byte[] message) {
        this.message = message;
    }
}
