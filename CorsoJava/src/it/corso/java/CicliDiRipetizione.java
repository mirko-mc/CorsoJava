package it.corso.java;

public class CicliDiRipetizione {

	public static void main(String[] args) {
		CicliDiRipetizione CicRip = new CicliDiRipetizione();
		CicRip.esempioWhile(0);
		CicRip.esempioDoWhile(0);
		CicRip.esempioFor();
		CicRip.esempioForEach();
		CicRip.esempioBreak(10, 20);
		CicRip.esempioContinue(10, 20);
		CicRip.esempioContinue2(10, 20);
		
/*		COMANDI DI CICLO
 * 		I comandi di ciclo consentono di eseguire ripetutamente un blocco di codice.
 * 		In Java esistono i seguenti comandi di ciclo:
 * 		- while
 * 		- do-while
 * 		- for
 * 		Le istruzioni di un ciclo sono racchiuse tra parentesi graffe {}.
 * 		Se il ciclo deve eseguire solo un'istruzione è possibile omettere le parentesi il consiglio
 * 		è di utilizzare le parentesi sempre, per semplicità di lettura del codice e
 * 			per evitare eventuali bug applicativi.
 * */
	}
	
/*		WHILE
 * 		Il comando "while" esegue un blocco di codice finché non viene verificata FALSE
 * 			la condizione specificata all'inizio del blocco di codice.
 * 		La sintassi del comando while è la seguente:
 * 		while(condizione) {
 * 			esegui queste istruzioni finché non si verifica la "condizione" }
 * 		ATTENZIONE: se la condizione del while è sempre vera, una volta entrato nel while,
 * 			il programma andrà in loop infinito e non terminerà mai.
 * */
	public void esempioWhile(int numero) {
		while(numero < 30) {
		System.out.println("While è " + numero
		+ " ed è minore di 30.");
		numero++; /* incremento di 1 il valore di numero */
		}
		System.out.println("While è maggiore o uguale a 30.");
		}
	
/*		DO-WHILE
 * 		Il comando "do-while" è simile al comando while, solo che nel do-while la condizione
 * 			viene verificata alla fine del blocco di codice e non all'inizio.
 * 		Nel do-while l'esecuzione del blocco di codice viene effettuata almeno una volta 
 * 			anche se la condizione è falsa.
 * 		Anche in questo caso è importante che la condizione diventi false
 * 			altrimenti il ciclo andrà in loop infinito.
 * 		La sintassi del comando while è la seguente:
 * 		do {
 * 		esegui queste istruzioni finché non si verifica la "condizione"
 * 		} while(condizione);
 * */
	public void esempioDoWhile(int numero) {
		do {
		System.out.println("DoWhile è " + numero);
		numero++;
		} while(numero < 30);
		System.out.println("DoWhile è maggiore o uguale a 30.");
		}
	
/*		FOR
 * 		Il comando "for" esegue un blocco di codice finché non viene verificata la condizione specificata.
 * 		La sintassi del comando for è la seguente:
 * 		for(inizializzazione; condizione; incremento) {
 * 			esegui queste istruzioni finché si verifica la "condizione" }
 * 		- inizializzazione : quest'espressione contiene la definizione ed inizializzazione
 * 			della variabile utilizzata per governare l'esecuzione del ciclo
 * 		- condizione: questa espressione contiene la condizione che si deve verificare
 * 			sulla variabile definita nell'inizializzazione affinché il ciclo continui
 * 		- incremento: questa espressione viene richiamata dopo ogni iterazione del ciclo e serv
 * 			per aumentare o diminuire il valore della variabile definita nell'inizializzazione
 * 		ATTENZIONE: le espressioni inizializzazione, condizione ed incremento sono facoltative,
 * 			pertanto è possibile creare un ciclo che va in loop infinito e non termina mai.
 * */
	public void esempioFor() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("For = " + i);
			}
	}
	
/*		FOREACH
 * 		cicla ogni elemento dell'array
 * */
		int arrInt[] = {1,2,3};
	public void esempioForEach() {
		if(arrInt != null) {
			for(int elemento : arrInt) {
				System.out.println("ForEach = " + elemento);
			}
		}
	}
	
/*		BREAK
 * 		utilizzato per terminare l'esecuzione di un blocco di codice in un ciclo
 * */
	public void esempioBreak(int interruttore, int estremo) {
		for(int i = 0; i < estremo; i++) {
			if(i == interruttore) {
				System.out.println("break: i = interruttore = " + i);
				break; /* il ciclo si interrompe con i = 10*/
			}
		}
		System.out.println("break: estremo");
	}
/*		CONTINUE
 * 		utilizzato per saltare alla fine di un blocco di codice, interrompendo l'iterazione corrente
 * */
	public void esempioContinue(int interruttore, int estremo) {
		for(int i = 0; i < estremo; i++) {
			if(i == interruttore) {
				System.out.println("continue: i = interruttore = " + i);
				continue;
			}
		}
		System.out.println("continue: estremo");
	}
	
	public void esempioContinue2(int interruttore, int estremo) {
		for(int i = 0; i < estremo; i++) {
			if(i%2 == 0) {
				System.out.println("continue: i = " + i);
				/*commenta il continue per notare la differenza. sostituisce ELSE in questo caso*/
				continue;
			}
			System.out.println("continue: estremo = " + i);
		}
	}
	
}