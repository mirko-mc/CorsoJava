package it.corso.java.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.corso.java.business.PersonaServiceBeanLocal;
import it.corso.java.data.Account;
import it.corso.java.data.Persona;

/**
 * Servlet implementation class Persona
 */
@WebServlet("/persona")

public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	PersonaServiceBeanLocal personaService;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public PersonaServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* elimina doGet di default
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 * */
		/* se è diverso da null allora associa nella variabile method il valore della variabile nella request altrimenti scrivi niente
		 * cosè ci assicuriamo che non sarà mai null
		 * */
		String method = request.getParameter("method") != null ? request.getParameter("method") : "";
		/* se il parametro passato è uguale ad ADD... */
		if (method.equals("add")) {
			/* ...allora imposto i valori... */
			Persona p = new Persona();
			p.setNome("Mario");
			p.setCognome("Rossi");
			p.setAnni(40);
			
			/* SET di USERNAME e PASSWORD e passo i dati di ACCOUNT a PERSONA */
			Account a = new Account();
			a.setPassword("12345678");
			a.setUsername("ppreite");
			p.setAccount(a);
			
			/* ...e li inserisco nel database...  */
			personaService.inserisci(p);
			response.getWriter().println("INSERISCI eseguito");
			System.out.println("INSERISCI eseguito");
		} /* se il parametro passato è uguale a GET... */
		else if(method.equals("get")) {
			/* ...recupero il parametro ID e lo passo nella variabile ID... */
			Long id = Long.parseLong(request.getParameter("id"));
			/* ...recupero dal DATABASE la riga corrispondente a quell'ID... */
			Persona p = personaService.getPersonaById(id);
			/* ...e stampo i dati dell persona */
			response.getWriter().println("HO RECUPERATO:" + "\nNOME -> " + p.getNome() + "\nCOGNOME -> " + p.getCognome() + "\nANNI -> " + p.getAnni() + "\nUSERNAME -> " + p.getAccount().getUsername() + "\nPASSWORD -> " + p.getAccount().getPassword());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
