package it.corso.java.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dispatcher
 */
@WebServlet("/web")
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		
		String pagina = request.getParameter("pagina");
		if (pagina != null && !pagina.trim().equals("")) {
			if (pagina.equals("1")) {
				request.setAttribute("oggetto", "test");
				/* esempio carrello elettronico
				 * supponiamo che il carrello elettronico sia una lista di stringhe.
				 * getAttribute restituisce un oggetto mentre la nostra variabile carrello è una lista di stringhe. quindi aggiungiamo il cast.
				 * */
				/* prendiamo l'oggetto carrello dalla sessione. se non c'è lo creiamo */
				List<String> carrello = (List<String>) request.getSession().getAttribute("carrello");
//				carrello = null;
				/* se carrello non c'è, lo creiamo */
				if (carrello == null) {
					/* creiamo il carrello inizializzando la variabile */
					carrello = new ArrayList<String>();
					/* se il carrello non è in sessione, lo aggiungo alla sessione dopo averlo creato */
					request.getSession().setAttribute("carrello", carrello);
					}

				/* prendiamo i parametri (dati) dalla request */
				String articolo = request.getParameter("articolo");
//				articolo = "";
				/* se l'articolo è diverso da null e non è uguale a "", aggiungiamo l'articolo al carrello */
				if (articolo != null && !articolo.equals("")) {
					carrello.add(articolo);
				}
				
				request.removeAttribute("oggetto");
				
				request.getServletContext().getRequestDispatcher("/jsp/pagina1.jsp").include(request, response);
				} else if (pagina.equals("2")) {
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
