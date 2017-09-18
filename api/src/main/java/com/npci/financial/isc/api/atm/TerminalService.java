package com.npci.financial.isc.api.atm;

import com.npci.financial.isc.api.GeneralServiceApi;
import com.npci.financial.isc.model.to.atm.Terminal;

/**
 * Created by h.mohammadi on 9/18/2017.
 */
public interface TerminalService extends GeneralServiceApi<Terminal> {
    Terminal findByLuno(String luno);
}
