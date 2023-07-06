package com.jspiders.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.TrainerDTO;
import com.mysql.cj.Query;

public class TrainerDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static javax.persistence.Query query;
	private static String jpql;
	
	private static void openConnection() {
		factory=Persistence.createEntityManagerFactory("hibernate");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	
	private static void closeConnection() {
		if(factory !=null) {
			factory.close();
		}
		if(manager != null) {
			manager.close();
		}
		if(transaction.isActive()) {
			transaction.isActive();
		}
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			jpql="from TrainerDTO";
			query=manager.createQuery(jpql);
			
			List<TrainerDTO> trainers=query.getResultList();
			
			for(TrainerDTO trainer :trainers) {
				System.out.println(trainer);
			}
			
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}
}
