package com.jspiders.hibernatemanytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernatemanytoone.dto.PlayerDTO;
import com.jspiders.hibernatemanytoone.dto.TeamDTO;


public class PlayerTeamDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("ManyToOne");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}

	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			TeamDTO team1 = new TeamDTO();
			team1.setId(1);
			team1.setName("MI");
			team1.setCity("Mumbai");
			manager.persist(team1);
			
			TeamDTO team2 = new TeamDTO();
			team2.setId(2);
			team2.setName("RCB");
			team2.setCity("Bengalore");
			manager.persist(team2);
			
			PlayerDTO player1= new PlayerDTO();
			player1.setId(1);
			player1.setName("Rohit Sharma");
			player1.setRole("Bat");
			player1.setJersey(45);
			player1.setAge(36);
			player1.setTeam(team1);
			manager.persist(player1);
			
			PlayerDTO player2= new PlayerDTO();
			player2.setId(2);
			player2.setName("Virat Kohli");
			player2.setRole("Bat");
			player2.setJersey(18);
			player2.setAge(34);
			player2.setTeam(team2);
			manager.persist(player2);
			
			PlayerDTO player3= new PlayerDTO();
			player3.setId(3);
			player3.setName("S K Y");
			player3.setRole("Bat");
			player3.setJersey(32);
			player3.setAge(8);
			player3.setTeam(team1);
			manager.persist(player3);
			
			PlayerDTO player4= new PlayerDTO();
			player4.setId(4);
			player4.setName("FAF");
			player4.setRole("Bat");
			player4.setJersey(25);
			player4.setAge(36);
			player4.setTeam(team2);
			manager.persist(player4);
			
			transaction.commit();

		}catch(Exception e){
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}

}
