package com.npci.financial.isc.web.controller.base;

/**
 * Created by h.mohammadi on 9/16/2017.
 */
public interface Controller {
    /**
     *
     */
    void prepare();

    /**
     *
     */
    boolean validate();

    /**
     *
     */
    String create();

    /**
     *
     */
    String update();

    /**
     *
     */
    String delete();

    /**
     *
     */
    String delete(Long id);

    /**
     *
     */
    String refresh();

    /**
     *
     */
    void afterLoad();
}
