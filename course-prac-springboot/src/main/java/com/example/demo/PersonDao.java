package com.example.demo;

import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.criteria.CriteriaQuery;

@Repository
@Transactional
@Component
public class PersonDao {

	@Autowired
	private SessionFactory factory;
	
	public Session getSession() {
		Session session = factory.getCurrentSession();
		
		if(session == null) {
			session = factory.openSession();
		}
		
		return session;
	}
	
	public void savePerson(Person person) {
		getSession().save(person);
	}
	
	public List<Person> getPerson(){
		 CriteriaQuery<Person> criteriaQuery = getSession().getCriteriaBuilder().createQuery(Person.class);
	     criteriaQuery.from(Person.class);
	     
	     List<Person> contacts = getSession().createQuery(criteriaQuery).getResultList();
	     getSession().close();

	     return contacts;
	}
}
