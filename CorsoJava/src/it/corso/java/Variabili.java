package it.corso.java;

public class Variabili {
	/* VARIABILE LOCALE
	 * sono definite all'interno di un metodo. sono create quando un metodo viene chiamato
	 * e cancellate dalla memoria quando il metodo termina
	 * 
	 * VARIABILE DI ISTANZA
	 * sono definite all'interno di una classe ma fuori dai metodi della classe stessa
	 * (altrimenti diventano variabili locali)
	 * 
	 * VARIABILE DI CLASSE
	 * sono variabili di istanza ma nella loro definizione viene usato il modificatore static
	 * 
	 * PARAMETRI
	 * vengono dichiarate all'interno delle parentesi tonde di un determinato metodo
	 * */
	
	//variabile di ISTANZA
	public int b = 5;
	//variabile di CLASSE
	public static String stampa = "CIAO";
	public static void main(String[] args) {
		//variabile di ISTANZA
		Variabili c1 = new Variabili();
		c1.b = 10;
		//variabile di ISTANZA
		Variabili c2 = new Variabili();
		c2.b = 30;
		System.out.println("c1.b + c2.b = " + c1.b + c2.b);
		//variabile di CLASSE
		System.out.println("stampa = " + Variabili.stampa);
		//variabile LOCALE
		int a = 10;
		System.out.println("a = " + a);
		
		//dichiarazione
		int c3;
		//inizializzazione
		c3 = 10;
		//dichiarazione + inizializzazione
		int c4 = 10;
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		}
}