package it.corso.java.business;

import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class CorsoWebStatefulBean
 */
@Stateful(passivationCapable = false)
public class CorsoWebStatefulBean implements CorsoWebStatefulLocal {
	private int contatore;
    /**
     * Default constructor. 
     */
    public CorsoWebStatefulBean() {
    }

    public void incrementa(int c) {
    	setContatore(getContatore() + c);
    }

	public int getContatore() {
		return contatore;
	}

	public void setContatore(int contatore) {
		this.contatore = contatore;
	}
	
	@Remove
	public void chiudiConnessione() {
	}
}