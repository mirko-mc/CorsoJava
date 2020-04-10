package it.corso.java.business;

public interface CorsoWeb {
	/* per far sì che il client acceda al metodo SALUTO in CorsoWebBean o lo dichiariamo in ogni interfaccia oppure
	 * creaiamo interfaccia PADRE (questa) che sarà estesa dalle altre ereditando il metodo.
	 * qui metteremo tutti i metodi che vogliamo siano esposti sia LOCAL che REMOTE
	 * */
	public String saluto();
	public void stampaFattura();
}
