package com.xworkz.submarine.dao;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.submarine.entity.SubmarineEntity;

public class SubmarineDAOImpl implements SubmarineDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

	public boolean save(SubmarineEntity entity) {

		EntityManager manager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

}
