package com.npci.financial.isc.web.controller.base;

import com.npci.financial.isc.model.base.EntityBase;

public class Factory<T extends EntityBase> {

    Class<T> entityBeanType;

    public Factory(Class<T> entityBeanType) {
        this.entityBeanType = entityBeanType;
    }

    public T createInstance() {
        T t = null;
        try {
            t = entityBeanType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
}