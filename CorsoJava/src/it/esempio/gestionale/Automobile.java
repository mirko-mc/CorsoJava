package it.esempio.gestionale;

public class Automobile extends Prodotto {
	private String classe;
	private String verniciatura;
	private String motore;
	private String alimentazione;
	
	/** @return the classe */
	public String getClasse() {
		return classe;
	}
	/** @param classe the classe to set */
	public void setClasse(String classe) {
		this.classe = classe;
	}
	/** @return the verniciatura */
	public String getVerniciatura() {
		return verniciatura;
	}
	/** @param verniciatura the verniciatura to set */
	public void setVerniciatura(String verniciatura) {
		this.verniciatura = verniciatura;
	}
	/** @return the motore */
	public String getMotore() {
		return motore;
	}
	/** @param motore the motore to set */
	public void setMotore(String motore) {
		this.motore = motore;
	}
	/** @return the alimentazione */
	public String getAlimentazione() {
		return alimentazione;
	}
	/** @param alimentazione the alimentazione to set */
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	
	/** Questo metodo stampa le caratteristiche di un'automobile */
	@Override
	public void stampaProdotto() {
		super.stampaProdotto();
	}
}
