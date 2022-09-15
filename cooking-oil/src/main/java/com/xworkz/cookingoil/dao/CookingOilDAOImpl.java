package com.xworkz.cookingoil.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cookingoil.entity.CookingOilEntity;

public class CookingOilDAOImpl implements CookingOilDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
	public boolean save(CookingOilEntity entity) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			entityManager.close();
		}

		return true;
	}

}
