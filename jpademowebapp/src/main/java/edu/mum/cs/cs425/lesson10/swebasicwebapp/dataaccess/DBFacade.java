package edu.mum.cs.cs425.lesson10.swebasicwebapp.dataaccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.mum.cs.cs425.lesson10.swebasicwebapp.model.*;

public class DBFacade {
	
	private static final String PERSISTENCE_UNIT_NAME = "MySWEBasicJavaWebApp1";
    private static EntityManagerFactory factory;
	
	public static List<Account> getAccounts() {
		return null;
	}
	
	public static void saveAccount(Account a) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();

        em.close();
	}
}
