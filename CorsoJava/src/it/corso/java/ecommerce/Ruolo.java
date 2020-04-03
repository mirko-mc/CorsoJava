package it.corso.java.ecommerce;

/*	ruolo: rappresenta il ruolo che ha l'utente all'interno dell'e-commerce.
	I ruoli previsti sono:
	- amministratore di sistema,
	- cliente,
	- responsabile catalogo,
	- contabile,
	- responsabile magazzino
 * */

public class Ruolo {
	private String ruolo;
	private static final String ruolo_amministratore_di_sistema = "amministratore di sistema";
	private static final String ruolo_cliente = "cliente";
	private static final String ruolo_responsabile_di_catalogo = "responsabile catalogo";
	private static final String ruolo_contabile = "contabile";
	private static final String ruolo_responsabile_di_magazzino = "responsabile magazzino";
	
	/* GETTER SETTER */
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public static String getRuoloAmministratoreDiSistema() {
		return ruolo_amministratore_di_sistema;
	}
	public static String getRuoloCliente() {
		return ruolo_cliente;
	}
	public static String getRuoloResponsabileDiCatalogo() {
		return ruolo_responsabile_di_catalogo;
	}
	public static String getRuoloContabile() {
		return ruolo_contabile;
	}
	public static String getRuoloResponsabileDiMagazzino() {
		return ruolo_responsabile_di_magazzino;
	}
}