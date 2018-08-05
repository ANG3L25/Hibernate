package com.mysql.gestorpersistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.entidades.News;

public class GestorPersistencia {
	private EntityManagerFactory fabrica;
	
	public GestorPersistencia() {
		this.fabrica = Persistence.createEntityManagerFactory("miBaseDatos");
	}
	
	public News getID (int id) {
		EntityManager em = fabrica.createEntityManager();		
		News news = em.find(News.class, id);
		em.close();
		return news;
	}
	
	public void cerrar() {
		fabrica.close();
	}

}
