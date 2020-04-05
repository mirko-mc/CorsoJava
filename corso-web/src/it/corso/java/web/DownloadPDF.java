package it.corso.java.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadPDF
 */
@WebServlet("/downloadpdf")
public class DownloadPDF extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadPDF() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html>");
		out.println("<head><title>Ciao!</title>");
		out.println("<body><h1>Ciao " + nome + " " + cognome + "</h1>");
		out.println("</body></html>");
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		try {
//			azioni(request, response);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		response.addCookie("corso-web", "success");
//		response.sendRedirect("http://www.google.it");
//		response.getWriter().append((String)request.getAttribute("nomeAttributo"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//		try {
//			azioni(request, response);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html>");
		out.println("<head><title>Ciao!</title>");
		out.println("<body><h1>Ciao " + nome + " " + cognome + "</h1>");
		out.println("<body><p>sono nel post</p>");
		out.println("</body></html>");
	}

	private void azioni(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.getWriter().append("\n - getMethod: " + request.getMethod());
		
		response.getWriter().append("\n - getContext: " + request.getContextPath());
		
		response.getWriter().append("\n - getHeader(\"user-agent\"): " + request.getHeader("user-agent") + "\n");
		
		Enumeration<String> en = request.getHeaderNames();
		response.getWriter().append("\ngetHeaderNames: ");
		while (en.hasMoreElements()) {
			String element = (String) en.nextElement();
			response.getWriter().append("\n > " + element + ": " + request.getHeader(element));
		}
		
		response.getWriter().append("\n\n - getQueryString: " + request.getQueryString());
		
		response.getWriter().append("\n - getParameter(\"pippo\"): " + request.getParameter("pippo"));
	}
	
	@Override
	public void init() throws ServletException {
		/* effettuare connessione al DB
		 * verificare che i REST WebService da invocare rispondano correttamente
		 * */
		super.init();
	}

	@Override
	public void destroy() {
		/* chiusura connessioni al DB o ai servizi
		 * scruttura di eventuali log applicativi
		 * */
		super.destroy();
	}

}
