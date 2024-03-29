package it.corso.java.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.corso.java.business.CorsoWebLocal;
import it.corso.java.business.CorsoWebRemote;
import it.corso.java.business.CorsoWebStatefulLocal;
import it.corso.java.web.beans.Articolo;

/**
 * Servlet implementation class Dispatcher
 */
@WebServlet("/web")
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/* creo istanza dell'interfaccia LOCAL che punta al nostro EJB
	 * nel video da errore senza annotation, qui no
	 * */
	@EJB
	CorsoWebLocal corsoLocal;
	@EJB
	CorsoWebRemote corsoRemote;
	@EJB
	CorsoWebStatefulLocal corsoStateful;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dispatcher() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		
//		corsoLocal.salvaFattura();
//		corsoLocal.stampaFattura();
//		corsoLocal.creaConto();
//		corsoLocal.creaContoAssociatoAdUnUtente();
//		corsoLocal.assegnaStudenteAlCorso();
//		corsoLocal.elencoUtenti();
		/* ----- IMPAGINAZIONE ----- */
		long righeTotali = corsoLocal.elencoUtentiCount();
		int risultatiPerPagina = 2;
		int rigaDiPartenza = 1;
		corsoLocal.elencoUtenti2(rigaDiPartenza, risultatiPerPagina);
		/* ------------------------- */
//		corsoRemote.collegati();
		String saluto = corsoLocal.saluto();
//		response.sendError(404);
		
		String pagina = request.getParameter("pagina");
		if (pagina != null && !pagina.trim().equals("")) {
			if (pagina.equals("1")) {
				request.setAttribute("oggetto", "test");
				/* esempio carrello elettronico
				 * supponiamo che il carrello elettronico sia una lista di stringhe.
				 * getAttribute restituisce un oggetto mentre la nostra variabile carrello � una lista di stringhe. quindi aggiungiamo il cast.
				 * */
				/* prendiamo l'oggetto carrello dalla sessione. se non c'� lo creiamo */
				List<String> carrello = (List<String>) request.getSession().getAttribute("carrello");
//				carrello = null;
				/* se carrello non c'�, lo creiamo */
				if (carrello == null) {
					/* creiamo il carrello inizializzando la variabile */
					carrello = new ArrayList<String>();
					/* se il carrello non � in sessione, lo aggiungo alla sessione dopo averlo creato */
					request.getSession().setAttribute("carrello", carrello);
					}

				/* prendiamo i parametri (dati) dalla request */
				String articolo = request.getParameter("articolo");
//				articolo = "";
				/* se l'articolo � diverso da null e non � uguale a "", aggiungiamo l'articolo al carrello */
				if (articolo != null && !articolo.equals("")) {
					carrello.add(articolo);
				}
				
				carrello.add("saluto dell'EJB LOCAL: " + corsoLocal.saluto());
				carrello.add("saluto dell'EJB REMOTE: " + corsoRemote.saluto());
				corsoStateful.incrementa(1);
				System.out.println(corsoStateful.getContatore());
				corsoStateful.chiudiConnessione();
				request.removeAttribute("oggetto");
				
				request.getServletContext().getRequestDispatcher("/jsp/pagina1.jsp").include(request, response);
				} else if (pagina.equals("2")) {
					/* dichiaro un nuovo oggetto articolo dal package beans */
					Articolo art = new Articolo();
					/* assegno valori alle variabili */
					art.setCodice("123");
					art.setNome("gioco di merda");
					art.setPrezzo(36);
					/* associo l'oggetto art alla variabile articolo */
					request.setAttribute("articolo", art);
					
					request.getServletContext().getRequestDispatcher("/jsp/pagina2.jsp").include(request, response);
					} else if (pagina.equals("3")) {
						request.getServletContext().getRequestDispatcher("/jsp/pagina3.jsp").include(request, response);
						} else {
							request.getServletContext().getRequestDispatcher("/jsp/body.jsp").include(request, response);
							}
			} else {
				request.getServletContext().getRequestDispatcher("/jsp/body.jsp").include(request, response);
				}
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
//		request.getServletContext().getRequestDispatcher("/jsp/home.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
/* http://localhost:8080/corso-web/web */