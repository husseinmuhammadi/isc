package com.npci.financial.isc.model.to.isc.transaction.financial;


import com.npci.financial.isc.model.base.EntityBase;
import com.npci.financial.isc.model.converter.isc.device.DeviceCodeConverter;
import com.npci.financial.isc.model.type.isc.device.DeviceCode;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "FINANCIAL_TRANSACTION_SEQ")
@Table(name = "FINANCIAL_TRANSACTION")
@NamedQueries({
        @NamedQuery(name = Transaction.FIND_ALL, query = "select t from Transaction t where t.deleted = false ")
})
public class Transaction extends EntityBase {
    public static final String FIND_ALL = "Transaction.findAll";

    @Column(name = "DEVICE_CODE", nullable = false, length = 2)
    @Convert(converter = DeviceCodeConverter.class)
    private DeviceCode deviceCode;

    public DeviceCode getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(DeviceCode deviceCode) {
        this.deviceCode = deviceCode;
    }
}
