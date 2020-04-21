package it.corso.java.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import it.corso.java.business.interceptor.CorsoWebInterceptor;
import it.corso.java.business.interceptor.CorsoWebInterceptor2;
import it.corso.java.data.Cliente;
import it.corso.java.data.ContoCorrente;
import it.corso.java.data.Corso;
import it.corso.java.data.Fattura;
import it.corso.java.data.Studente;
import it.corso.java.data.Utente;

/**
 * Session Bean implementation class CorsoWebBean
 */
@Stateless
/* INTERCEPTORS qui fa si che venga invocato per ogni metodo dell'EJB */
//@Interceptors({CorsoWebInterceptor.class})
public class CorsoWebBean implements CorsoWebLocal, CorsoWebRemote{
	/* il nostro sessionBean implementa le 2 interfacce (local e remote)
	 * quindi il client che vuole accedere al metodo saluto dovrà accedere ad un'interfaccia
	 * */
	@PersistenceContext(unitName = "corsoWebPersistence")
	EntityManager manager;
	/**
	 * Default constructor. 
	 */
	public CorsoWebBean() {
	}

	/* non specificando di che tipo è la transazione, di default viene considerata REQUIRED */
	@Interceptors({CorsoWebInterceptor.class})
	public String saluto() {
		salvaFattura();
		stampaFattura();
		return "Ciao, sono un EJB!";
	}

	/* gestire manualmente la transizione tramite annotation.  */
//	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void salvaFattura() {
		Fattura f = new Fattura();
		/* validi quando avevamo i campi di FATTURA e CLIENTE tutti nella classe FATTURA */
//		f.setCognome("Preite");
//		f.setNome("Paolo");
		f.setDataFattura(new Date());
		f.setNumeroFattura("1234");
		Cliente c = new Cliente();
		c.setCognome("Preite");
		c.setNome("Paolo");
		/* passo i valori alla classe FATTURA */
		f.setCliente(c);
		manager.persist(f);
		System.out.println("SALVAFATTURA eseguito");
	}

	/* INTERCEPTORS qui fa si che venga invocato solo per questo metodo.
	 * per far invocare più INTERCEPTORS bisogna inserirli in un array e verranno eseguiti secondo l'indice dell'array
	 * */
//	@Interceptors({CorsoWebInterceptor.class, CorsoWebInterceptor2.class})
	public void stampaFattura() {
		Fattura f = manager.find(Fattura.class, 1);
		/* valido quando avevamo i campi di FATTURA e CLIENTE tutti nella classe FATTURA */
//		System.out.println("ID -> " + f.getId() + "\nNome -> " + f.getNome() + "\nCognome -> " + f.getCognome() + "\nNumero Fattura -> " + f.getNumeroFattura() + "\nData Fattura -> " + f.getDataFattura());
		System.out.println("ID -> " + f.getId() + "\nNome -> " + f.getCliente().getNome() + "\nCognome -> " + f.getCliente().getCognome() + "\nNumero Fattura -> " + f.getNumeroFattura() + "\nData Fattura -> " + f.getDataFattura());
	}
	
	public void collegati() {
	}
	
	public void creaContoAssociatoAdUnUtente() {
		Utente u = manager.find(Utente.class, 3);
		ContoCorrente c = new ContoCorrente();
		c.setNumeroConto("166899");
		c.setUtenteConto(u);
		manager.persist(c);
	}
	
	public void creaConto() {
		/* istanzio le classi da utilizzare */
		Utente u1 = new Utente();
		Utente u2 = new Utente();
		ContoCorrente c1 = new ContoCorrente();
		ContoCorrente c2 = new ContoCorrente();
		ContoCorrente c3 = new ContoCorrente();
		/* popolo i le variabili che dovranno popolare le tabelle */
		u1.setNome("Paolo");
		u1.setCognome("Preite");
		/* creo oggetto ARRAYLIST per poter passare più valori in una chiamata */
		u1.setConti(new ArrayList<ContoCorrente>());
		/* imposto numero conto corrente */
		c1.setNumeroConto("051879");
		/* prendo il proprietario del conto corrente dalla classe UTENTE */
		c1.setUtenteConto(u1);
		/* aggiungo il conto alla lista di conti posseduti */
		u1.getConti().add(c1);
		c2.setNumeroConto("051879");
		c2.setUtenteConto(u1);
		u1.getConti().add(c2);
		/* inserisco i dati nelle tabelle */
		manager.persist(u1);
		u2.setNome("Paoluccio");
		u2.setCognome("Preituccio");
		c3.setNumeroConto("899166");
		c3.setUtenteConto(u2);
		manager.persist(c3);
		System.out.println("DOVREI AVER AGGIUNTO I DATI NELLE TABELLE. CONTROLLA");
	}
	
	public void assegnaStudenteAlCorso() {
		Corso c = manager.find(Corso.class, 2);
		Studente s = new Studente();
		s.setCognome("Preite");
		s.setNome("Paolo");
		s.setCorsi(new ArrayList<Corso>());
		s.getCorsi().add(c);
		manager.persist(s);
	}
	
	public long elencoUtentiCount() {
		/* creo oggetto INTERFACCIA DYNAMICQUERY */
		Query q = manager.createQuery("SELECT COUNT(u.id) FROM Utente u");
		/* questa query ritorna il numero totale dei risultati ottenibili */
		return (long)q.getSingleResult();
	}
	
	/* dichiaro che devono essere passati dei valori: la POSizione iniziale da cui partire a restituire i risultati e MAXRESULTS max quanti risultati per pagina */
	public void elencoUtenti2(int pos, int maxResults) {
		/* creo DYNAMICQUERY */
		Query q2 = manager.createQuery("SELECT u FROM Utente u");
		/* dichiaro la POSizione iniziale da cui partire a restituire i risultati... */
		q2.setFirstResult(pos);
		/* ...e MAXRESULTS max quanti risultati per pagina */
		q2.setMaxResults(maxResults);
		/* recuperiamo i dati dalla query */
		List<Utente> utenti2 = q2.getResultList();
		/* iteriamo i risultati */
		System.out.println("DYNAMICQUERY :c");
		for (Utente u : utenti2) {
			System.out.println(u.getId() + ") " + u.getCognome() + " " + u.getNome());
		}
	}
	
	public void elencoUtenti() {
		/* NAMEDQUERY */
		/* creo oggetto INTERFACCIA NAMEDQUERY */
		Query q = manager.createNamedQuery("elencoUtenti");
		/* recuperiamo i dati dalla query */
		List<Utente> utenti = q.getResultList();
		/* iteriamo i risultati */
		System.out.println("NAMEDQUERY");
		for (Utente u : utenti) {
			System.out.println(u.getId() + ") " + u.getCognome() + " " + u.getNome());
		}
		/* 
		 * IL RISULTATO SARA' LO STESSO. LA DIFFERENZA E' CHE LA NAMEDQUERY VERRA' MEMORIZZATA NELLA CACHE DA JPA PER ESSERE RIUTILIZZATA, LA DYNAMICQUERY NO
		 * NELL'INTERFACCIA QUERY POSSIAMO UTILIZZARE SIA JPQL CHE SQL MA SI CONSIGLIA JPQL PER LA PORTABILITA' 
		 * */
		/* DYNAMICQUERY */
		/* creo DYNAMICQUERY con specifica di PARAMETRI */
//		Query q2 = manager.createQuery("SELECT u FROM Utente u"/* WHERE u.cognome = :c"*/);
		Query q2 = manager.createQuery("SELECT u FROM Utente u WHERE u.cognome = :c");
		Query q3 = manager.createQuery("SELECT u FROM Utente u WHERE u.cognome = ?1");
		/* imposto i valori dei PARAMETRI descritti nella DYNAMICQUERY (:c - ?1) */
		q2.setParameter("c", "Preite");
		q3.setParameter(1, "Preituccio");
		/* recuperiamo i dati dalla query */
		List<Utente> utenti2 = q2.getResultList();
		List<Utente> utenti3 = q3.getResultList();
		/* iteriamo i risultati */
		System.out.println("DYNAMICQUERY :c");
		for (Utente u : utenti2) {
			System.out.println(u.getId() + ") " + u.getCognome() + " " + u.getNome());
		}
		System.out.println("DYNAMICQUERY ?1");
		for (Utente u : utenti3) {
			System.out.println(u.getId() + ") " + u.getCognome() + " " + u.getNome());
		}
	}
	
/* http://localhost:8080/corso-web/web */
}
