package it.corso.java.business.ws;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Session Bean implementation class CorsoWebServiceBean
 */
@Stateless
@WebService(serviceName = "corsoweb")
public class CorsoWebServiceBean {

    /**
     * Default constructor. 
     */
    public CorsoWebServiceBean() {
    }

    @WebMethod(operationName = "salutami")
    public String saluta(String nome, String cognome) {
    	return "ciao " + nome + " " + cognome;
    }
}
