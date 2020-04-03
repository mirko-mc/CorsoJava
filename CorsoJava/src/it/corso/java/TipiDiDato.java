package it.corso.java;

public class TipiDiDato {
	/* TIPI PRIMITIVI: utilizzano una quantità di memoria definita. Ogni tipo primitivo ha un valore di default.
	 * boolean, byte, char, double, float, int, long, short
	 * TIPI DI RIFERIMENTO: utilizzano una quantità di memoria variabile in funzione del numero di 
	 * informazioni contenute (es oggetto indirizzo occupa memoria in base alle informazioni via, CAP, città, ecc)
	 * Ogni variabile di questo tipo viene inizializzata per default con il valore speciale null.
	 * classi, interfacce, ecc
	 * */
	private int a;
	public static void main(String[] args) {
		//tipo di riferimento
		TipiDiDato rif = new TipiDiDato();
		rif.a = 10;
		System.out.println("a riferimento = " + rif.a);
		
		/* BOOLEAN
		 * rappresenta i valori vero o falso
		 * valore di default: false
		 * */
		int anni = 45;
		boolean maggDi40 = false;
		boolean minUgDi40; //non inizializzata
		if (anni > 40) {
			maggDi40 = true;
			minUgDi40 = false;
		} else {
			minUgDi40 = true;
		}
		if(maggDi40) {
			System.out.println("il numero " + anni + " è maggiore di 40");
		}
		
		/* BYTE
		 * rappresenta valori interi compresi tra -128 e 127 inclusi
		 * viene usato per risparmiare memoria in array di grandi dimensioni
		 * le operazioni aritmetiche NON sono ammesse
		 * valore di default: 0
		 * */
		byte b1 = 100;
		byte b2 = -5;
		byte b3 = (byte) (b1+b2);
		int b4 = b1 + b2;
		System.out.println(b4);
		/* nella console viene stampato 95 */
		System.out.println(b3);
		/*NOTA: la variabile b3 contiene il valore in byte della somma tra b1 e b2
		 * b1+b2 = 95 quindi il valore di b3 è 95
		 * */
		
		byte b5 = 100;
		byte b6 = 50;
		byte b7 = (byte) (b5 + b6);
		System.out.println(b7);
		/* NOTA: la variabile b7 contiene il valore in byte della somma tra b5 e b6
		 * b5+b6 = 150 quindi il valore di b7 è -106
		 * */
		
		String str = "frase di esempio";
		/* getBytes() codifica la stringa in una sequenza di byte e li salva in un array di byte */
		byte[] strByte = str.getBytes();
		for(int i = 0; i < strByte.length; i++) {
		//stampiamo il valore in byte di ogni carattere della stringa
		System.out.print(strByte[i] + " ");
		}
		/* L'output nella console sarà: 102 114 97 115 101 32 100 105 32 101 115 101 109 112 105 111
		 * 102 è il valore in byte della lettera f
		 * */
		
		/* SHORT
		 * valori interi compresi tra -32768 e 32767 inclusi
		 * può essere usato per risparmiare memoria in array di grandi dimensioni
		 * le operazioni aritmetiche non sono ammesse
		 * valore di default: 0
		 * */
		short s1 = 20;
		short s2 = 40;
		short s3 = (short) (s1+s2);
		/*NOTA: s3 contiene il valore in byte della somma tra s1 ed s2
		 * s1+s2 = 60 quindi s3 vale 60
		 * */
		System.out.println(s3);
		
		short s4 = 20000;
		short s5 = 30000;
		short s6 = (short) (s4+s5);
		/* NOTA: s6 contiene il valore in byte della somma tra s4 ed s5
		 * s4+s5 = 50000 quindi s6 vale -15536
		 * */
		System.out.println(s6);
		
		/* INT
		 * valori interi compresi tra -2.147.483.648 e 2.147.483.647 inclusi
		 * utilizzato per i valori interi
		 * le operazioni aritmetiche sono ammesse
		 * valore di default: 0
		 * */
		int i1 = 100;
		int i2 = -10;
		int i3 = i1 + i2;
		/* NOTA: i3 contiene il risultato della somma tra i1 e i2 (90) */
		System.out.println(i3);
		
		int i4 = 5;
		int i5 = 4;
		int i6 = i4 * i5;
		/* NOTA: i6 contiene il risultato della moltiplicazione tra i4 e i5. (20) */
		System.out.println(i6);
		
		/* LONG
		 * valori interi compresi tra -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807 inclusi
		 * utilizzato quando si lavora con interi di grandi dimensioni
		 * le operazioni aritmetiche sono ammesse
		 * valore di default: 0L (cioè 0 long)
		 * */
		long l1 = 100;
		long l2 = -10;
		long l3 = l1 + l2;
		/* nella console viene stampato 90 */
		System.out.println(l3);
		
		long l4 = 5;
		long l5 = 4;
		long l6 = l4 * l5;
		/* nella console viene stampato 20 */
		System.out.println(l6);
		
		/* FLOAT
		 * valori in virgola mobile con precisione singola secondo la specifica IEEE 754
		 * più grande float positivo: 3.40282347e+38f
		 * più piccolo float positivo non-zero: 1.40239846e-45f
		 * NON dovrebbe essere utilizzato per valori precisi
		 * valore di default: 0.0f (cioè 0 float)
		 * */
		float f1 = 100.45f;
		float f2 = -10.30f;
		float f3 = f1 + f2;
		/* nella console viene stampato 90.149994
		 * NOTA: i numeri di tipo float terminano con la lettera "f" (es. 100.45f)
		 * Notate la leggera imprecisione nella somma tra f1 ed f2
		 * La stessa operazione fatta con numeri double dà come risultato 90.15
		 * */
		System.out.println(f3);
		
		/* DOUBLE
		 * valori in virgola mobile con precisione doppia secondo la specifica IEEE 754
		 * più grande double positivo: 1.79769313486231570e+308
		 * più piccolo double positivo non-zero: 4.94065645841246544e-324
		 * quando si lavora coi numeri decimale è consigliabile utilizzare double rispetto al float
		 * NON dovrebbe essere utilizzato per valori precisi
		 * valore di default: 0.0d (cioè 0 double)
		 * */
		double d1 = 100.45;
		double d2 = -10.30;
		double d3 = d1 + d2;
		/* nella console viene stampato 90.15
		 * NOTA: i numeri di tipo double si possono scrivere con o senza lettera "d" (es. 100.45d o 100.45 sono equivalenti).*/
		System.out.println(d3);
		
		/*CHAR
		 * carattere UNICODE (sistema di codifica che assegna un numero univoco ad ogni carattere utilizzato
		 * 		per la scrittura di testi)
		 * UNICODE più piccolo: \u0000 (cioè 0)
		 * UNICODE più grande: \uffff (cioè 65535)
		 * valore di default: \u0000 (cioè 0)
		 * */
		char a = 'a';
		char b = 'b';
		/* nella console viene stampato 195 */
		System.out.println(a+b);
		String s = "prov";
		/* nella console viene stampato "prova" */
		System.out.println(s+a);
		/* NOTA: un char è un carattere scritto tra apici (es. 'a')
		 * Una variabile char non può contenere due caratteri (es. 'ab' NON è un char!)
		 * L'operatore + su due char indica una somma tra interi, pertanto a+b restituisce come risultato 195, 
		 * 		somma tra 97 e 98 (numeri assegnati nella codifica Unicode rispettivamente alle lettere a e b)
		 * L'operatore + sulle stringhe indica la concatenazione, pertanto sommando un char ad una stringa si ha la concatenazione
		 * 		(ad es. s+a produce come output la stringa "prova").
		 * */
	}
}