package net.grupo09.newsportal.searchintelligent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

public class createIndex {
	
		@PersistenceUnit(unitName = "entityManager")
	    private EntityManagerFactory entityManagerFactory;
	
		public createIndex(){}

	    public EntityManager getEm() {
	    	EntityManager em = entityManagerFactory.createEntityManager();
			return em;
		}
}

