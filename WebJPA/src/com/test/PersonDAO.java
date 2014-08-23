package com.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.pojo.PersonView;

public class PersonDAO {
	private EntityManager entityManager;

	public PersonDAO(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	public void printPerson(){
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<PersonView> criteriaQuery = criteriaBuilder.createQuery(PersonView.class);
		List<PersonView> personViews = entityManager.createQuery(criteriaQuery).getResultList();
		System.out.println(personViews);
		
	}
	
	public static void main(String[] args){
		PersonDAO personDAO = new PersonDAO(JpaFactory.getEntityManager());
		personDAO.printPerson();
	}

	
	
	

}
