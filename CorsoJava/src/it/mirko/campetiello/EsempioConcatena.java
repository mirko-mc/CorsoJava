package it.mirko.campetiello;

public class EsempioConcatena {
	public static void main(String[] args) {
		System.out.println("134 -> " + concatena("Mirko", "Campetiello"));
		System.out.println("135 -> " + concatena("Mirko", "Campetiello", true));
		System.out.println("135 -> " + concatena("Mirko", "Campetiello", false));
		System.out.println("136 -> " + sottostringa("Hi"));
		System.out.println("136 -> " + sottostringa("Mirko"));
	}
/*	134
 *	Scrivere una classe EsempioConcatena.java e creare un metodo concatena che prenda in ingresso due parametri (nome e cognome)
 *	e ritorni la concatenazione tra i due parametri. 
 *
 *	Invocare questo metodo nel main() per stampare nella console il proprio nome e cognome.
 *
 *	Il package della classe deve essere it.tuonome.tuocognome
 * */
	public static String concatena(String nome, String cognome) {
		String spazio = " ";
		return nome.concat(spazio).concat(cognome);
	}
	
/*	135
 *	Nella classe EsempioConcatena.java, creare un metodo concatena che prenda in ingresso tre parametri (nome, cognome, stampaMaiuscolo di tipo boolean).
 *	Il metodo deve ritornare:
 *	il proprio nome e cognome tutto maiuscolo, se stampaMaiuscolo è true
 *	il proprio nome e cognome tutto minuscolo, se stampaMaiuscolo è false
 *	
 *	Invocare questo metodo nel main() due volte, impostando come valore di stampaMaiuscolo,
 *	prima true e poi false, per stampare nella console il proprio nome e cognome.
 *	
 *	Suggerimento: usare i metodi toLowerCase() e toUpperCase() della classe String.
 *
 *	Il package della classe deve essere it.tuonome.tuocognome
 * */
	public static String concatena(String nome, String cognome, boolean stampaMaiuscolo) {
		String spazio = " ";
		if (stampaMaiuscolo) {
			return nome.concat(spazio).concat(cognome).toUpperCase();
		} else {
			return nome.concat(spazio).concat(cognome).toLowerCase();
		}
	}
	
/*	136
 *	Nella classe EsempioConcatena.java, creare un metodo sottostringa che prenda in ingresso un testo e ritorni le prime tre lettere del testo passato.
 *	Se il testo passato ha meno di 3 caratteri, il metodo deve ritornare il testo intero.
 *
 *	Invocare questo metodo nel main(), per stampare nella console le prime tre lettere del testo.
 *
 *	Suggerimento: Utilizzare il metodo substring della classe String. Il package della classe deve essere it.tuonome.tuocognome
 * */
	public static String sottostringa(String testo) {
		if (testo.length() > 3) {
			return testo.substring(0, 3);
		}
		return testo;
	}
}
