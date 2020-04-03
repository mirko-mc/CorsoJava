package it.corso.java;

public class Modificatori {

	public static void main(String[] args) {
/*		MODIFICATORI
 * 		sono parole riservate al linguaggio java
 * 		vanno scritti prima della dichiarazione del componente ed è possibile utilizzare più modificatori alla volta senza un ordine preciso
 * 		PUBLIC: può essere utilizzato su classi, metodi e variabili di istanza (cioè le variabili definite all'interno di una classe,
 * 				ma fuori dai metodi della classe stessa)
 * 			- le classi public sono visibili da qualsiasi classe situata in qualsiasi package
 * 			- i metodi o le variabili di istanza public sono visibili da qualsiasi classe in qualsiasi package
 * 		PROTECTED: può essere utilizzato su metodi e variabili di istanza. E' leggermente più restrittivo del modificatore public.
 * 			- i metodi o le variabili di istanza protected sono visibili da qualsiasi classe definita nello stesso package e
 * 			  da tutte le sottoclassi (o classi derivate) definite in qualsiasi package
 * 		DEFAULT (o senza modificatore): è possibile definire classi, metodi e variabili di istanza senza modificatore.
 * 			- una classe definita senza modificatore è visibile solo dalle classi appartenenti allo stesso package
 * 			- i metodi o le variabili di istanza senza modificatore sono visibili solo alle classi appartenenti allo stesso package della classe che li definisce
 * 		PRIVATE: può essere utilizzato su metodi e variabili di istanza. E' il modificatore più restrittivo.
 * 			- i metodi o le variabili di istanza private sono visibili solo all'interno della classe che li definisce
 * 		FINAL: può essere utilizzato su classi, metodi e variabili. Questo modificatore indica che la caratteristica non può essere modificata.
 * 			- una classe definita final non può essere estesa (quindi non posso derivare altre classi)
 * 			- un metodo final non può essere sovrascritto (tecnicamente non posso fare l'override del metodo)
 * 			- un attributo final è una costante (cioè il suo valore non cambia mai)
 * 		STATIC: può essere utilizzato su metodi e variabili. Gli elementi static sono caricati in memoria insieme alla classe che li definisce
 * 				ed appartengono alla classe e non all'oggetto (cioè alla singola istanza).
 * 			- Un elemento static può essere utilizzato anche se non esiste nessuna istanza dell'oggetto che li contiene.
 * 			  Il metodo main è un esempio (viene eseguito prima di tutto anche se non esiste un'istanza della classe)
 * 			- Un metodo static non può accedere ad elementi non static, poiché questi potrebbero non esistere in memoria.
 * 		TABELLA RIEPILOGO VISIBILITA' MODIFICATORE
 * 					ovunque     stessa classe     stesso package     classe derivata
 * 		public		S			S				  S					 S
 * 		protected	N			S				  S					 S
 * 		default		N			S				  S					 N
 * 		private		N			S				  N					 N
 * */
		
	}

}
