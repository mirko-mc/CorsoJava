package it.corso.java;

import java.io.File;

public class CorsoJava {
	public int b = 5; //variabile di istanza
	public static String stampa = "CIAO"; //variabile di classe
	
	public static void main(String[] args) {
		/*System.out.println("Ciao!");
		
		CorsoJava c1 = new CorsoJava(); //variabile di istanza
		c1.b = 10;
		
		CorsoJava c2 = new CorsoJava(); //variabile di istanza
		c2.b = 30;
		
		System.out.println(CorsoJava.stampa); //variabile di classe
		
		int a = 10; //variabile locale
		
		CorsoJava c3; //dichiarazione
		
		c3 = new CorsoJava(); //inizializzazione
		c3.b = 20;
		CorsoJava c4 = new CorsoJava(); //dichiarazione + inizializzazione
		
		int vall = 0;
		System.out.println(vall);
		
		CorsoJava c5 = null;
		c5.b = 30;
		
		double d = 0;
		System.out.println(d);
		*/
		String test = "prova di stampa";
		byte[] testAr = test.getBytes();
		
		for (int i = 0; i < testAr.length; i++) {
			System.out.println(testAr[i]);
		}
		
		int val1 = 10;
		int val2 = 20;
		
		Calcolatrice c = new Calcolatrice();
		double somma = c.somma(val1, val2);
		double sottrazione = c.sottrazione(val1, val2);
		double moltiplicazione = c.moltiplicazione(val1, val2);
		double divisione = c.divisione(val1, val2);
		
		System.out.println(somma);
		System.out.println(sottrazione);
		System.out.println(moltiplicazione);
		System.out.println(divisione);
		
		
		long val3 = 0;
		
		float a = 100.45f;
		
	}
	
	public String concatena(String stringa1, String stringa2, double c, File file) {
		
		return stringa1.concat(stringa2);
	}
}
