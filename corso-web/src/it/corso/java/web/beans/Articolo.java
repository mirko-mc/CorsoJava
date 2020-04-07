package it.corso.java.web.beans;

import java.io.Serializable;

public class Articolo implements Serializable {
	private static final long serialVersionUID = 332421202563944801L;
	private String nome;
	private String codice;
	private double prezzo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
