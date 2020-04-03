package it.corso.java.ecommerce;

/*	telefono utente: rappresenta un numero di telefono dell'utente.
	Un utente può avere più numeri di telefono.
 * */

public class TelefonoUtente {
	private String tipoNumero;
	private String numero;
	
	/* COSTRUTTORE */
	public TelefonoUtente(String tipoNumero, String numero) {
		this.tipoNumero = tipoNumero;
		this.numero = numero;
	}

	/* GETTER SETTER */
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getTipoNumero() {
		return tipoNumero;
	}


	public void setTipoNumero(String tipoNumero) {
		this.tipoNumero = tipoNumero;
	}

	@Override
	public String toString() {
		return tipoNumero + " " + numero + "\n";
	}
}