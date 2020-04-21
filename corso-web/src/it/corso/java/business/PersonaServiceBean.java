package it.corso.java.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.corso.java.data.Persona;

/**
 * Session Bean implementation class PersonaServiceBean
 */
@Stateless
public class PersonaServiceBean implements PersonaServiceBeanRemote, PersonaServiceBeanLocal {
    @PersistenceContext(unitName="corsoWebPersistence")
	EntityManager manager;
	/**
     * Default constructor. 
     */
    public PersonaServiceBean() {
    }

    /* C - CREATE */
    public void inserisci(Persona p) {
    	/* per inserire una nuova entità si usa PERSIST */
    	manager.persist(p);
    }
    
    /* R - READ */
    public Persona getPersonaById(Long id) {
    	/* per recuperare un'entità si usa FIND specificando CLASSE.CLASS e il valore dell'id */
    	return manager.find(Persona.class, id);
    }
    
    /* U - UPDATE */
    public void aggiorna(Persona p) {
    	/* l'entitymanager aggiorna in automatico i dati modificati di un'entità recuperata tramite FIND
    	 * per FORZARE l'aggiornamento di un'entità si usa MERGE */
    	manager.merge(p);
    }
    
    /* D - DELETE */
    public void cancella(Persona p) {
    	/* per rimuovere un'entità si usa REMOVE */
    	manager.remove(p);
    }
}
