package it.corso.java.ecommerce;

import java.util.ArrayList;

/*	Per ogni cliente deve essere possibile visualizzare la lista degli ordini effettuati.
	ATTENZIONE: l'esercizio deve riguardare solo la modellazione del sistema tramite la definizione e l'implementazione delle classi che rappresentano le varie entità
 * */
public class Main {
	public static void main(String[] args) {
		Utente u = new Utente();
		Ruolo r = new Ruolo();
		IndirizzoUtente i = new IndirizzoUtente();
		/* -- UTENTE -- */
		u.Anagrafica("name", "surname", "codiceFiscale");
		u.Nascita("20/20/2020", "luogoNascita", "provinciaNascita");
		u.DatiAccesso(15, "username", "password");
		u.DatiAccesso(58, "username", "password");
		/* -- RUOLO -- */
		r.setRuolo(Ruolo.getRuoloAmministratoreDiSistema());
		/* -- INDIRIZZO -- */
		i.setIndResidenza(i.componiIndirizzo("via residenza", "324", "25650", "resi", "de", "nza"));
		i.setIndSpedizione(i.componiIndirizzo("via spedizione", "324", "25650", "spedi", "zi", "one"));
		i.setIndFatturazione(i.componiIndirizzo("via fatturazione", "324", "25650", "fattura", "zi", "one"));
		/* -- TELEFONO -- */
		u.setTelUtente(new ArrayList<TelefonoUtente>());
		TelefonoUtente t1 = new TelefonoUtente("fisso", "numeroFisso");
		TelefonoUtente t2 = new TelefonoUtente("cellulare", "numeroCellulare");
		u.getTelUtente().add(t1);
		u.getTelUtente().add(t2);
		/* CATEGORIA */
		CategorieProdotto c = new CategorieProdotto();
		c.setCategorieProd(new ArrayList<CategoriaProdotto>());
		CategoriaProdotto c1 = new CategoriaProdotto(589, "informatica", "pc fissi e notebook", false);
		CategoriaProdotto c2 = new CategoriaProdotto(147, "accessori informatica", "borse, mouse, ecc...", true);
		c.getCategorieProd().add(c1);
		c.getCategorieProd().add(c2);
		/* ARTICOLO */
		Articolo a1 = new Articolo(135, "notebook", "sony vaio", 699.00, "informatica");
		Articolo a2 = new Articolo(458, "kit wireless", "logitech", 30.00, "accessori informatica");
		/* ORDINE */
		OrdineVendita odv = new OrdineVendita();
		odv.aggiungiOrdineVendita(54, "20/20/2020", i.getIndSpedizione(), i.getIndFatturazione(), u.getNome() + " " + u.getCognome(), OrdineVendita.getStatoOrdineCreato(), OrdineVendita.getPagamentoBonificoBancario());
		odv.setRigaOdv(new ArrayList<OrdineVenditaRiga>());
		OrdineVenditaRiga ro1 = new OrdineVenditaRiga(a1, a1.getPrezzo(), 3, 10);
		OrdineVenditaRiga ro2 = new OrdineVenditaRiga(a2, a2.getPrezzo(), 5, 10);
		OrdineVenditaRiga ro3 = new OrdineVenditaRiga(a2, a2.getPrezzo(), 7, 10);
		odv.getRigaOdv().add(ro1);
		odv.getRigaOdv().add(ro2);
		odv.getRigaOdv().add(ro3);
		/* RIGA ORDINE */
		/* -- STAMPA ORDINE -- */
		System.out.println("+-------------------- ANAGRAFICA --------------------");
		System.out.println("| NOME -> " + u.getNome());
		System.out.println("| COGNOME -> " + u.getCognome());
		System.out.println("| DATA NASCITA -> " + u.getDataNascita());
		System.out.println("| LUOGO NASCITA -> " + u.getLuogoNascita());
		System.out.println("| PROVINCIA NASCITA -> " + u.getProvNascita());
		System.out.println("| CODICE FISCALE -> " + u.getCodiceFiscale());
		System.out.println("+-------------------- DATI D'ACCESSO ----------------");
		System.out.println("| ID UTENTE -> " + u.getIdUt());
		System.out.println("| USERNAME -> " + u.getUsername());
		System.out.println("| PASSWORD -> " + u.getPassword());
		System.out.println("+-------------------- RUOLO -------------------------");
		System.out.println("| RUOLO -> " + r.getRuolo());
		System.out.println("+-------------------- TELEFONOI ---------------------");
		System.out.print("| TELEFONO/I -> ");
		System.out.println("| " + u.getTelUtente().toString());
		System.out.println("+-------------------- INDIRIZZI ---------------------");
		System.out.println("| INDIRIZZO RESIDENZA -> " + i.getIndResidenza());
		System.out.println("| INDIRIZZO SPEDIZIONE -> " + i.getIndSpedizione());
		System.out.println("| INDIRIZZO FATTURAZIONE -> " + i.getIndFatturazione());
		System.out.println("+-------------------- CATEGORIE ---------------------");
		System.out.println("| NOME CATEGORIA -> " + c.getCategorieProd());
		System.out.println("+-------------------- ARTICOLI ----------------------");
		System.out.println("| ARTICOLI -> " + a1.getIdArt());
		System.out.println("+-------------------- ORDINE ------------------------");
		System.out.println("| " + odv.getCliente() + "| " + odv.getStatoOrdine() + "| " + odv.getDataOrdine() + "| " + odv.getMetodoPagamento());
		System.out.println("| " + odv.getIndSped() + odv.getIndFatt());
		System.out.println("| " + odv.getRigaOdv());
		/*---------------------------------------------------------------*/
		if(u.getNome() == "name") {
			System.out.println("| " + odv.getCliente() + "| " + odv.getStatoOrdine() + "| " + odv.getDataOrdine() + "| " + odv.getMetodoPagamento());
			System.out.println("| " + odv.getIndSped() + odv.getIndFatt());
			System.out.println("| " + odv.getRigaOdv());
		}
	}
}