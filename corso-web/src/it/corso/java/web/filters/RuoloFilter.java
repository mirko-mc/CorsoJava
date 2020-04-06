package it.corso.java.web.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class RuoloFilter
 */
/* in @WebFilter � necessario specificare i percorsi da intercettare. con /* verr� intercettato qualsiasi percorso.
 * � anche possibile specificare degli attributi. avendo specificato l'urlPattern nel web.xml, posso anche rimuoverlo da qui
 * */
@WebFilter(filterName = "ruolo", urlPatterns = "/*")
public class RuoloFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RuoloFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		/* cast per type mismatch tra req e request */
		HttpServletRequest req = (HttpServletRequest) request;
		req.setAttribute("ruolo", "sono il FilterRuolo");

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
