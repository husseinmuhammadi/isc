package com.npci.financial.isc.model.base;

import javax.ejb.Singleton;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@Singleton
public class EntityManagerProvider {

    @PersistenceContext(unitName = "library-persistence-unit")
    private EntityManager entityManager;

    @Produces
    @RequestScoped
    @Default
    public EntityManager getEntityManager() {
        entityManager.setFlushMode(FlushModeType.COMMIT);
        return entityManager;
    }
}
