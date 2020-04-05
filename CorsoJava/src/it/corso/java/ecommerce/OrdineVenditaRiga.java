package it.corso.java.ecommerce;

/*	riga ordine di vendita: rappresenta l'i-esima riga dell'ordine.
	Ogni riga deve contenere:
	- i riferimenti dell'articolo,
	- il prezzo unitario,
	- la quantità,
	- lo sconto,
	- l'IVA
 * */

public class OrdineVenditaRiga {
	private Articolo articolo;
	private double prezzo;
	private int quantita;
	private double sconto;
	
	public OrdineVenditaRiga(Articolo articolo, double prezzo, int quantita, double sconto) {
		super();
		this.articolo = articolo;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.sconto = sconto;
	}

	public Articolo getArticolo() {
		return articolo;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public double getSconto() {
		return sconto;
	}

	public void setSconto(double sconto) {
		this.sconto = sconto;
	}

	@Override
	public String toString() {
		return "ID: " + articolo.getIdArt() + "|NOME: " +  articolo.getNomeArt() + "|PREZZO: " + articolo.getPrezzo() + "|QUANTITA': " + getQuantita() + "|SCONTO: " + getSconto() + "%|IVA: " + articolo.getIva() + "%\n";
	}
}