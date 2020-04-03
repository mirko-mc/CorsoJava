package it.esempio.gestionale;

public class ProdottoElettronico extends Prodotto {
	private String modello;
	private String marca;
	
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return getMarca() + " " + getModello();
	}
	
	
}
