package it.corso.java.web;

import java.io.IOException;
import java.io.PrintWriter;

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
//		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
//		String pagina = request.getParameter("pagina");
//		if (pagina != null && !pagina.trim().equals("")) {
//			if (pagina.equals("1")) {
//				request.getServletContext().getRequestDispatcher("/jsp/pagina1.jsp").include(request, response);
//				} else if (pagina.equals("2")) {
//					request.getServletContext().getRequestDispatcher("/jsp/pagina2.jsp").include(request, response);
//					} else if (pagina.equals("3")) {
//						request.getServletContext().getRequestDispatcher("/jsp/pagina3.jsp").include(request, response);
//						} else {
//							request.getServletContext().getRequestDispatcher("/jsp/body.jsp").include(request, response);
//							}
//			} else {
//				request.getServletContext().getRequestDispatcher("/jsp/body.jsp").include(request, response);
//				}
//		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
		request.getServletContext().getRequestDispatcher("/jsp/home.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
