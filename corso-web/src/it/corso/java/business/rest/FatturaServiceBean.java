package it.corso.java.business.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Session Bean implementation class FatturaServiceBean
 */
@Stateless
@Path(value = "/fattura")
public class FatturaServiceBean {

    /**
     * Default constructor. 
     */
    public FatturaServiceBean() {
    }

    @GET
    @Produces(value = "text/plain")
    @Path(value = "/numero")
    public String generaProssimoNumero() {
    	System.out.println("generato numero fattura");
    	return "1234";
    }
    
    @GET
    @Produces(value = "text/plain")
    /* con più metodi GET e senza specificare il PATH avremo errore perchè GENERAPROSSIMONUMERO e GENERAANNO si equivalgono */
    @Path(value = "anno")
    public String generaAnno() {
    	System.out.println("generato anno fattura");
    	return "2020";
    }
}