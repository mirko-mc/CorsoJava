package it.esempio.gestionale;

public class Libro extends Prodotto {
	private String autore;
	private int numeroPagine;
	
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	
}
