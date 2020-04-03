package it.corso.java.ecommerce;

/*	articolo: rappresenta un articolo venduto tramite l'e-commerce.
	Un articolo deve appartenere ad una categoria di prodotto.
 * */

public class Articolo {
	private long idArt;
	private String nomeArt;
	private String descrizioneArt;
	private String categoria;
	private double prezzo;
	private int iva = 22;
	
	public Articolo(long idArt, String nomeArt, String descrizioneArt, double prezzo, String categoria) {
		super();
		this.idArt = idArt;
		this.nomeArt = nomeArt;
		this.descrizioneArt = descrizioneArt;
		this.prezzo = prezzo;
		this.setCategoria(categoria);
	}

	/* GETTER SETTER */
	public long getIdArt() {
		return idArt;
	}
	public void setIdArt(long idArt) {
		this.idArt = idArt;
	}
	public String getNomeArt() {
		return nomeArt;
	}
	public void setNomeArt(String nomeArt) {
		this.nomeArt = nomeArt;
	}
	public String getDescrizioneArt() {
		return descrizioneArt;
	}
	public void setDescrizioneArt(String descrizioneArt) {
		this.descrizioneArt = descrizioneArt;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}