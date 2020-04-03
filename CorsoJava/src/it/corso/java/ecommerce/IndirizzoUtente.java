package it.corso.java.ecommerce;

/*	indirizzo utente: rappresenta un indirizzo fisico dell'utente (via, CAP, citt�, ...). Un utente pu� avere pi� indirizzi.
	Per ciascun indirizzo � necessario specificare il tipo che pu� essere:
	- "indirizzo di spedizione",
	- "indirizzo di fatturazione"
 * */

public class IndirizzoUtente {
	/* INDIRIZZO - residenza, fatturazione, spedizione*/
	private String indResidenza;
	private String indFatturazione;
	private String indSpedizione;
	
	public String componiIndirizzo(String via, String civico, String cap, String paese, String provincia, String nazione) {
		String separatore = ", ";
		String spazio = " ";
		String indirizzo = via.concat(spazio).concat(civico).concat(separatore).concat(cap).concat(spazio).concat(paese).concat(spazio).concat(provincia).concat(separatore).concat(nazione);

		return indirizzo;
	}

	public String getIndResidenza() {
		return indResidenza;
	}

	public void setIndResidenza(String indResidenza) {
		this.indResidenza = indResidenza;
	}

	public String getIndFatturazione() {
		return indFatturazione;
	}

	public void setIndFatturazione(String indFatturazione) {
		this.indFatturazione = indFatturazione;
	}

	public String getIndSpedizione() {
		return indSpedizione;
	}

	public void setIndSpedizione(String indSpedizione) {
		this.indSpedizione = indSpedizione;
	}
}