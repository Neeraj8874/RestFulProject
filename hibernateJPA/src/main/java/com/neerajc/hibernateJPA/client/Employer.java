package com.neerajc.hibernateJPA.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.neerajc.hibernateJPA.pojo.Labour;

public class Employer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    EntityManagerFactory en = Persistence.createEntityManagerFactory("labour");
    EntityManager em =  en.createEntityManager();
    em.getTransaction().begin();
    Labour labour =  new Labour();
    labour.setLid(0);
    labour.setLname("  Mandeep");
    labour.setLsalary(34000);
    em.persist (labour);
    em.getTransaction().commit();
    em.close();
	}

}
