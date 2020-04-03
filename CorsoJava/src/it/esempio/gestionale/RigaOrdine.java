package it.esempio.gestionale;

public class RigaOrdine {
	private long id;
	private Prodotto prodotto;
	private int quantit�;
	private double prezzoUnitario;
	private OrdineDiVendita odv;
	
	
	public RigaOrdine(long id, Prodotto prodotto, int quantit�, double prezzoUnitario) {
		super();
		this.id = id;
		this.prodotto = prodotto;
		this.quantit� = quantit�;
		this.prezzoUnitario = prezzoUnitario;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	public int getQuantit�() {
		return quantit�;
	}
	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}
	public double getPrezzoUnitario() {
		return prezzoUnitario;
	}
	public void setPrezzoUnitario(double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	public OrdineDiVendita getOdv() {
		return odv;
	}
	public void setOdv(OrdineDiVendita odv) {
		this.odv = odv;
	}
	
	@Override
	public String toString() {
		return "ID: " + getId() + " | Prodotto: " + getProdotto() + " | Quantit�: " + getQuantit�() + " | Prezzo Unitario: " + getPrezzoUnitario() + "\n";
	}
	
}
