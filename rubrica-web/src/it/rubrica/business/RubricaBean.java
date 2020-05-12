package it.rubrica.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import it.rubrica.data.Contatto;

@Stateless
public class RubricaBean implements RubricaLocal, RubricaRemote {
	@PersistenceContext(unitName = "rubricaPersistence")
	EntityManager manager;
	
	public void addContatto(Contatto c) {
		manager.persist(c);
	}
	
	public void updateContatto(Contatto c) {
		manager.merge(c);
	}
	
	public void removeContatto(Contatto c) {
		manager.remove(c);
	}
	
	public Contatto getContatto(Integer id) {
		return manager.find(Contatto.class, id);
	}
	
	public List<Contatto> getContatti() {
		Query q = manager.createQuery("SELECT c FROM Contatto c");
		return q.getResultList();
	}
}