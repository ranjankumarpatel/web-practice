package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaFactory {

	public JpaFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static EntityManagerFactory entityManagerFactory;
	
	public static EntityManagerFactory getEntityManagerFactory(){
		if(entityManagerFactory==null){
			entityManagerFactory = Persistence.createEntityManagerFactory("TestDBJPA");
		}	
		return entityManagerFactory;
		
	}
	
	public static EntityManager getEntityManager(){
		return getEntityManagerFactory().createEntityManager();
	}
	
	

}
