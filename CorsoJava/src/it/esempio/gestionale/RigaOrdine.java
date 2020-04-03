package it.esempio.gestionale;

public class RigaOrdine {
	private long id;
	private Prodotto prodotto;
	private int quantità;
	private double prezzoUnitario;
	private OrdineDiVendita odv;
	
	
	public RigaOrdine(long id, Prodotto prodotto, int quantità, double prezzoUnitario) {
		super();
		this.id = id;
		this.prodotto = prodotto;
		this.quantità = quantità;
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
	public int getQuantità() {
		return quantità;
	}
	public void setQuantità(int quantità) {
		this.quantità = quantità;
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
		return "ID: " + getId() + " | Prodotto: " + getProdotto() + " | Quantità: " + getQuantità() + " | Prezzo Unitario: " + getPrezzoUnitario() + "\n";
	}
	
}
