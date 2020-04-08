package it.corso.web.taglib;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/* - configurare BUILDPATH aggiungendo le dipendenze alla libreria tomEE
 * - estendiamo con la classe TAGSUPPORT
 * - override DOENDTAG
 * - per prendere la request utilizzare l'oggetto PAGECONTEXT con cast HTTPSERVLETREQUEST
 * - prendiamo il valore dal parametro con IF
 * - creiamo oggetto JSPWRITER che si occupa di scrivere nell'HTML
 * - utilizziamo WRITER come se fossimo all'interno di una normale pagina JSP
 * - dichiaro il tag nel file TLD
 * */
public class StampaParametro extends TagSupport {

	@Override
	public int doEndTag() throws JspException {
		HttpServletRequest req = (HttpServletRequest)pageContext.getRequest();
		try {
			JspWriter writer = pageContext.getOut();
			if (req.getParameter("utente") != null) {
				writer.println("Ciao " + req.getParameter("utente"));
			} else {
				writer.println("Clicca qui per accedere!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}
}