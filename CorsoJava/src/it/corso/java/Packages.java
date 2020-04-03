package it.corso.java;

public class Packages {

	public static void main(String[] args) {
/*		PACKAGE
 * 		Il package è uno strumento che consente di raggruppare ed organizzare gli elementi (classi, interfacce, enumeration, etc...)
 * 		all'interno di un progetto, semplificando la lettura del codice sorgente e l'accesso a tali elementi.
 * 		Java organizza i suoi elementi in package, in base alla loro funzione.
 * 		Quando sviluppiamo un software, anche i nostri elementi possono essere raggruppati in package creati ad hoc per il progetto.
 * 		Esempi:
 * 		- java.lang: contiene le classi principali del linguaggio (Object, Class, System, String, StringBuffer,...)
 * 		- java.util: contiene le classi di utilità generica (Date, List, ArrayList, ...)
 * 		- java.io: contiene le classi per la gestione di input ed output (File, InputStream, OutputStream, FileInputStream, FileOutputStream)
 * 		
 * 		NAMING CONVENTION
 * 		I package dovrebbero essere scritti con lettere minuscole (lowercase).
 * 		Il package dovrebbe iniziare con le estensioni dei domini com, edu, gov, mil, net, org, o con le due lettere che idenditificano una nazione (secondo lo standard ISO Standard 3166, 1981)
 * 		Esempi:
 * 			com.nomeazienda.entities
 * 			it.corsi.java
 * 			it.miosoftware.fatturazione
 * 		Avere package strutturati, consente di gestire meglio le classi all’interno di un progetto di grandi dimensioni.
 * 		Esempio di organizzazione di package per una web application Java:
 * 			it.corsi.java.forms 		conterrà classi di tipo “Form”
 * 			it.corsi.java.bean 			conterrà classi di tipo “JavaBean”
 * 			it.corsi.java.actions 		conterrà classi di tipo “Action”
 * */
		
/*		IMPORT
 * 		Se vogliamo utilizzare librerie esterne al package è necessario importarle all'interno della nostra classe attraverso il comando "import".
 * 		Per utilizzare una classe esterna al nostro progetto dobbiamo:
 * 		- indicare al progetto dove si trova il jar della libreria esterna che contiene le classi che vogliamo utilizzare,
 * 			se la libreria non è disponibile tra quelle fornite da Java
 * 		- effettuare la dichiarazione di import, per poter utilizzare gli elementi (classi, interfacce, etc...) presenti nel package dichiarato,
 * 			senza il prefisso del package
 * 		La dichiarazione di import si effettua tramite il comando di Java import, seguito dal package da importare.
 * 		Le dichiarazioni import devono essere inserite all'inizio del file .java, subito dopo l'istruzione package.
 * 		import di libreria esterna: click dx sul progetto > build path > configure build path > 
 * 			 > libraries > add external libraries
 * */
	}

}
