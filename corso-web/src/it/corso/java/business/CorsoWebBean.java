package it.corso.java.business;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

import it.corso.java.business.interceptor.CorsoWebInterceptor;
import it.corso.java.business.interceptor.CorsoWebInterceptor2;

/**
 * Session Bean implementation class CorsoWebBean
 */
@Stateless
/* INTERCEPTORS qui fa si che venga invocato per ogni metodo dell'EJB */
@Interceptors({CorsoWebInterceptor.class})
public class CorsoWebBean implements CorsoWebLocal, CorsoWebRemote{
	/* il nostro sessionBean implementa le 2 interfacce (local e remote)
	 * quindi il client che vuole accedere al metodo saluto dovrà accedere ad un'interfaccia
	 * */
	/**
	 * Default constructor. 
	 */
	public CorsoWebBean() {
	}

	/* non specificando di che tipo è la transazione, di default viene considerata REQUIRED */
	public String saluto() {
		return "Ciao, sono un EJB!";
	}

	/* gestire manualmente la transizione tramite annotation.  */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void salvaFattura() {
	}

	/* INTERCEPTORS qui fa si che venga invocato solo per questo metodo.
	 * per far invocare più INTERCEPTORS bisogna inserirli in un array e verranno eseguiti secondo l'indice dell'array
	 * */
	@Interceptors({CorsoWebInterceptor.class, CorsoWebInterceptor2.class})
	public void stampaFattura() {
	}
	
	public void collegati() {
	}
}
