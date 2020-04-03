package it.corso.java.annotation;

public class Prodotto {
	private long id;
	private String nome;
	private String descrizione;
	private double prezzo;
	
	@Deprecated
	public double calcolaIva(double ivaperc) {
		return getPrezzo() * ivaperc/100;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}	
}