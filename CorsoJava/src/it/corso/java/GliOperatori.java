package it.corso.java;

public class GliOperatori {

	public static void main(String[] args) {
		/* PUNTO .
		 * serve per accedere a:
		 * - campi di una classe
		 * - metodi di una classe
		 * - oggetti
		 * */
		
		/* ARITMETICI
		 * somma (c = a + b oppure a += b)
		 * sottrazione (c = a - b oppure a -= b)
		 * moltiplicazione (c = a * b oppure a *= b)
		 * divisione (c = a / b oppure a /= b)
		 * modulo (simbolo % oppure %=): calcola il resto della divisione intera
		 * il tipo di dato ritornato dipende dagli operandi.
		 * 		es. operazione tra due int restituisce un valore int
		 * 		es. divisione tra int restituisce int con decimale arrotondato
		 * */
		int a = 10;
		int b = 3;
		int c = a + b;
//		somma memorizzata in una variabile
		System.out.println("c=a+b - c=10+3 = " + c);
//		somma modificando il valore nella prima variabile (a)
		System.out.println(" a+=b - 10+=3  = " + (a+=b));
//		resto della divisione modificando il valore nella prima variabile (a)
		System.out.println(" a%=b - 10%=3  = " + (a%=b));
		
		/* LOGICI
		 * confrontano due elementi ritornando true o false
		 * - AND (A && B): restuisce true solo e solo se A e B sono vere, altrimenti false
		 * - OR (A || B): restuisce false solo e solo se A e B sono false, altrimenti true
		 * - NOT (!A): cambia il valore di un'espressione. se A restituisce true,
		 * 		il NOT cambia il valore in false e viceversa
		 * */
		a = 10;
//		AND
		if(a>b && a>5) {
			System.out.println("le due condizioni sono vere");
		} else {
			System.out.println("almeno una condizione è falsa");
		}
//		OR
		if(a>b || a<10) {
			System.out.println("almeno una condizione è vera");
		} else {
			System.out.println("le due condizioni sono false");
		}
//		NOT
		if(!(a>b)) {
			System.out.println("a è minore di b");
		} else {
			System.out.println("a è maggiore di b");
		}
		
		/* RELAZIONALI (O DI CONFRONTO)
		 * confrontano due operandi restituendo true o false
		 * maggiore di (A>B): restuisce true se A è maggiore di B, altrimenti false
		 * maggiore o uguale di (A>=B): restuisce true se A è maggiore o uguale a B, altrimenti false
		 * minore di (A<B): restuisce true se A è minore di B, altrimenti false
		 * minore o uguale di (A<=B): restuisce true se A è minore o uguale a B, altrimenti false
		 * uguale a (A==B): restuisce true se A è uguale a B, altrimenti false 
		 * diverso da (A!=B): restuisce true se A è diverso da B, altrimenti false
		 * */
		
		/* CASTING
		 * consente il passaggio di una variabile da un tipo di dato ad un altro
		 * - implicito: avviene senza dichiarazione esplicita se viene seguito l'ordine indicato
		 * 		byte -> short -> int -> long -> float -> double
		 * 				 char -> int -> long -> float -> double
		 * - esplicito: avviene solo tramite dichiarazione esplicita
		 * 		(int) myvar converte il valore della variabile myvar di tipo long in un int
		 * */
//		cast implicito
		long l1 = a;
//		cast esplicito
		int d = (int)l1;
	}

}
