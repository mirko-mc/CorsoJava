package it.corso.java;

public class IfElseSwitchCase {

	public static void main(String[] args) {
/*		COMANDI CONDIZIONALI
 * 		I comandi condizionali sono delle espressioni che consentono di eseguire una
 * 			porzione di codice in base al verificarsi di una condizione
 * 		I comandi condizionali consentono di implementare algoritmi simili al seguente:
 * 		SE si verifica la condizione1
 * 			esegui queste istruzioni
 * 		ALTRIMENTI SE si verifica la condizione2
 * 			esegui queste istruzioni
 * 		...
 * 		ALTRIMENTI
 * 			esegui queste istruzioni perché nessuna delle precedenti è soddisfatta
 * 		In Java esistono due comandi condizionali:
 * 		- if-else
 * 		- switch-case
 * 
 * 		IF-ELSE
 * 		Il comando if-else consente di eseguire una porzione di codice solo se si verifica una condizione.
 * 		La sintassi del comando if-else è la seguente:
 * 		if(condizione_1) {
 * 			esegui queste istruzioni e non eseguire le successive
 * 		} else if(condizione_2) {
 * 			esegui queste istruzioni e non eseguire le successive
 * 		} else {
 * 			esegui queste istruzioni perché nessuna delle precedenti condizioni era vera }
 * 		
 * 		i comandi else ed else if non sono obbligatori
 * 		tutte le condizioni devono essere espressioni di tipo boolean, che restituiscono true o false
 * 		le parentesi graffe sono obbligatorie se al verificarsi di una condizione devo eseguire più istruzioni
 * 			ma il consiglio è di utilizzarle sempre per semplicità di lettura del codice e per evitare bug applicativi
 * */
		IfElseSwitchCase.getInstance().isNull("text");
		System.out.println(singleton.recMagg(5, 3, 2));
		System.out.println(singleton.isNull(""));
		System.out.println(singleton.recTes(2));
	}

	public int recMagg(int n1, int n2, int n3) {
		int magg = 0;
		if(n1 > n2 && n1 > n3) {
			magg = n1;
		} else if(n2 > n1 && n2 > n3) {
			magg = n2;
		} else {
			magg = n3;
		}
		return magg;
	}
	
	public boolean isNull(String text) {
		if(text == null) {
			return true;
		} return false;
	}
	
	private static IfElseSwitchCase singleton;
	public static IfElseSwitchCase getInstance() {
		if(singleton == null) {
			singleton = new IfElseSwitchCase();
		} return singleton;
	}
	
/*		SWITCH-CASE
 * 		Il comando switch-case è un tipo di comando condizionale che consente di eseguire una
 * 			porzione di codice solo se si verifica una condizione.
 * 		La sintassi del comando switch-case è la seguente:
 * 		switch(parametro) {
 * 			case valore_1:
 * 			...istruzioni...
 * 			case valore_2:
 * 			...istruzioni...
 * 			default:
 * 			...istruzioni... }
 * 		LOGICA DI FUNZIONAMENTO: vengono eseguite le istruzioni a partire dal case
 * 			che ha lo stesso valore di parametro.
 * 		Es. se parametro = valore_2 lo switch eseguirà tutte le istruzioni del
 * 			case valore_2 e del case default
 * 		Il parametro deve essere una variabile o un'espressione che ritorna un valore di tipo:
 * 			byte, short, char, int, Enum, String
 * 		I valori nella clausola case (valore_1) devono essere dello stesso tipo del parametro.
 * 		Il case default è opzionale e contiene le istruzioni da eseguire sempre
 * 			anche se non viene verificata nessuna clausola case.
 * 		l'esecuzione di uno switch si interrompe utilizzando il comando break
 * 			(è un comando di interruzione di ciclo ma si può utilizzare anche nello switch)
 * */
	/**
	 * @param codice valori ammessi: 1, 2, 3
	 * @return
	 */
	public String recTes(int codice) {
		String testo = null;
		switch (codice) {
		case 1:
			testo = "codice 1";
			break;
		case 2:
			testo = "codice 2";
			break;
		case 3:
			testo = "codice 3";
			break;
		default:
			testo = "codice 4";
		}
		return testo;
	}
}