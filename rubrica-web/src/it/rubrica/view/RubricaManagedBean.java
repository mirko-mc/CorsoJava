package it.rubrica.view;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import it.rubrica.business.RubricaLocal;
import it.rubrica.data.Contatto;

@ManagedBean(name = "rubrica")
@RequestScoped
public class RubricaManagedBean implements Serializable{
	private static final long serialVersionUID = 1L;
	/* creo un riferimento per puntare all'EJB */
	@EJB
	private RubricaLocal rubricaBusiness;
	/* creo oggetto contatto che servirà per mappare tutti i campi all'interno di questo oggetto per poi passarli all'EJB */
	private Contatto contatto;
	
	public List<Contatto> getElencoContatti() {
		/* da qui ci colleghiamo all'EJB che si collegherà al database tramite JPA per effettuare la query */
		return rubricaBusiness.getContatti();
	}
	
	/* creo costruttore default che ci assicura che ogni volta che viene creata un istanza del bean, l'oggetto contatto viene inizializzato e non è nul */
	public RubricaManagedBean() {
		contatto = new Contatto();
	}

	public void salva() {
		rubricaBusiness.addContatto(contatto);
	}
	
	public void cancella() {
		rubricaBusiness.removeContatto(contatto);
	}
	
	/* GETTER SETTER */
	public Contatto getContatto() {
		return contatto;
	}
	public void setContatto(Contatto contatto) {
		this.contatto = contatto;
	}

	public RubricaLocal getRubricaBusiness() {
		return rubricaBusiness;
	}

	public void setRubricaBusiness(RubricaLocal rubricaBusiness) {
		this.rubricaBusiness = rubricaBusiness;
	}
}