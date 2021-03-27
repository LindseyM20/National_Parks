package com.casestudy.dbConnection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConnection {
	protected EntityManagerFactory emf = null;
	protected EntityManager em = null;
	private String persistenceName = "CaseStudy"; // Persistence unique name
	public void connect() {
		this.emf = Persistence.createEntityManagerFactory(persistenceName); // this matches line 3 of persistence.xml (and our project name)
		this.em = emf.createEntityManager();
	}
	
	public void disconnect() {
		if (this.em!=null) {
			em.close();
		}
		if (this.emf!=null) {
			emf.close();
		}
	}
}
