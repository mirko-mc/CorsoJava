package it.corso.java;

public class Sintassi {

	public static void main(String[] args) {
/*		CLASSI
 * 		- i file contenenti Classi ed Interfacce iniziano sempre con la dichiarazione del package
 * 		SI													NO
 * 		package it.corso.java;								public class NomeClasse { ... }
 * 		public class NomeClasse { ... }
 * 		- prima del nome dell'elemento da creare è necessario inserire la visibilità ed il tipo di elemento
 * 		SI													NO
 * 		package it.corso.java;								package it.corso.java;
 * 		public interface NomeInterfaccia { ... }			NomeInterfaccia { ... }
 * 		- dopo il nome dell'elemento è possibile inserire altri elementi (ad es. implements o extends)
 * 		SI													NO
 * 		package it.corso.java;								package it.corso.java;
 * 		public class NomeClasse extends ClasseA { ... }		public class NomeClasse extends { ... }
 * 
 * 		SI													NO
 * 		package it.corso.java;								package it.corso.java;
 * 		public class NomeClasse {							public class NomeClasse
 * 			private int id;										private int id;
 * 		}
 * 		- una classe può contenere variabili e metodi. La classe astratta può contenere anche solo la definizione dei metodi, senza l’implementazione
 * 		package it.corsi.java;
 * 		public class NomeClasse {
 * 			private String varA;
 * 			public String getVarA() {
 * 				return this.varA; } }
 * 		un'interfaccia può contenere variabili e definizioni di metodi (non le implementazioni)
 * 		SI													NO
 * 		package it.corsi.java;								package it.corsi.java;
 * 		public interface NomeInterfaccia {					public interface NomeInterfaccia {
 * 		public String getUser(); }							public String getUser(); {
 * 																... } }
 * */
		
/*		METODI - VARIABILI
 * 		prima del nome del metodo è necessario inserire la visibilità (ad es. public) ed il tipo di dato ritornato (ad es. String).
 * 		Se il metodo non ritorna niente è necessario utilizzare l'istruzione void.
 * 		Se la visibilità non viene inserita si considera quella default
 * 		SI													NO
 * 		package it.corsi.java;								package it.corsi.java;
 * 		public class NomeClasse {							public class NomeClasse {
 * 			public String calcolaCodiceFiscale(…) { …. }		calcolaCodiceFiscale(…) { …. }
 * 		void stampaSomma() { …. } }							private stampaSomma() { …. } }
 * 		dopo il nome del metodo è necessario specificare eventuali argomenti in input, racchiusi tra parentesi tonde ().
 * 		Il contenuto di un metodo è racchiuso tra parentesi graffe {}
 * 		SI													NO
 * 		package it.corsi.java;								package it.corsi.java;
 * 		public class NomeClasse {							public class NomeClasse {
 * 			private int id;										private id;
 * 			String nome;										nome;
 * 			public int calcolaSomma(int a, int b) {				public int calcolaSomma(int a, b) {
 * 			return a+b; }											return a+b; }
 * 		void stampaSomma() {									void stampaSomma() {
 * 			String out = calcolaSomma(3,4);							private String out = calcolaSomma(3,4);
 * 			System.out.println(out); } }							System.out.println(out); } }
 * */
	}

}
