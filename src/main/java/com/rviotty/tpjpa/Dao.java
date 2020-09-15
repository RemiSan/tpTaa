package com.rviotty.tpjpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.rviotty.tpjpa.entities.Fiche;
import com.rviotty.tpjpa.entities.Section;
import com.rviotty.tpjpa.entities.Tag;
import com.rviotty.tpjpa.entities.User;

public class Dao {

	public Dao() {
	}

	public List<User> getUsers(){
		List<User> users = EntityManagerHelper.getEntityManager().createQuery("Select a from User a", User.class).getResultList();
		return users;
	}
	
	public List<Section> getSections(){
		List<Section> sections = EntityManagerHelper.getEntityManager().createQuery("Select a from Section a", Section.class).getResultList();
		return sections;
	}
	
	public List<Fiche> getFiches(){
		List<Fiche> fiches = EntityManagerHelper.getEntityManager().createQuery("Select a from Fiche a", Fiche.class).getResultList();
		return fiches;
	}

	public List<Tag> getTags(){
		List<Tag> tags = EntityManagerHelper.getEntityManager().createQuery("Select a from Tag a", Tag.class).getResultList();
		return tags;
	}
	
	public void addEntity(Object entity) {
		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(entity);
		tx.commit();
	}
	
	public void close() {
		EntityManagerHelper.closeEntityManager();
	}
}
