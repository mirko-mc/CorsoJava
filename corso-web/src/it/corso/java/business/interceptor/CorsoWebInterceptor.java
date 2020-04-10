package it.corso.java.business.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class CorsoWebInterceptor {
	public void log(String dato) {
	}
	
	@AroundInvoke
	public Object filtra(InvocationContext ic) throws Exception {
		log("FILTRO");
		System.out.println("sono nel metodo filtra");
		
		return "OK";
	}
}