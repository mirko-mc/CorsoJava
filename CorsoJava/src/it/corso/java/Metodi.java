package it.corso.java;

public class Metodi {

	public static void main(String[] args) {
/*		METODI
 * 		sono blocchi di codice riutilizzabili e sono utilizzati per rappresentare
 * 		il comportamento di classi di oggetti
 * */
		
/* 		DEFINIZIONE DI UN METODO
 * 		[modificatore di accesso] [altri modificatori] TipoRitornato nomeMetodo(parametri) [throws Eccezioni] {
 * 			blocco di codice appartenente al metodo
 * 			return variabile;
 * 		}
 *		[modificatore di accesso]: uno a scelta tra:
 *			- private
 *			- protected
 *			- public
 *			- default 
 *		[altri modificatori]: static final (è possibile che siano presenti anche tutti e due)
 *		TipoRitornato:
 *			- void se il metodo non ritorna niente (in questo caso lo statement return non va inserito)
 *			- tipo primitivo o classe in base al valore ritornato
 *		nomeMetodo: nome del metodo scelto
 *		(parametri): lista dei parametri ammessi in ingresso: tipo1 param1, tipo n param n
 *			è possibile anche definire metodi che non accettano parametri in ingresso
 *			le variabili definite tramite parametri possono essere utilizzate nel corpo del metodo (tra parentesi graffe)
 *			i valori passati al metodo al momento della chiamata sono detti parametri attuali
 *		[throws Eccezioni]: lista delle classi delegate alla gestione delle eccezioni in caso di errore
 *			ClasseEccezione1, ClasseEccezioneN
 * */
		
/*		SIGNATURE DEL METODO
 * 		in java un metodo è determinato univocamente dal nome e dalla lista dei parametri formali
 * 		la coppia nome-parametri definisce la signature del metodo (cioè la firma)
 * 		è possibile definire lo stesso metodo più volte purchè ogni definizione abbia
 * 			una lista di parametri diversa
 * 			(i tipi dei parametri in ingresso devono essere differenti per numero e tipo)
 * 		esempio signature del metodo
 * 		public String getUserInfo(String nome, String cognome, int anni) {
 * 		return nome + " " + cognome + ", età: " + anni; }
 * 		public String getUserInfo(String nome, String cognome, String codiceFiscale) {
 * 		return nome + " " + cognome + ", codice Fiscale: " + codiceFiscale; }
 * */
/*		OVERLOADING DEI METODI
 * 		L’overloading dei metodi è una caratteristica di Java che consente di definire più volte
 * 			un metodo di una classe, utilizzando diversi parametri
 * 		ad esempio supponiamo di avere una classe User che gestisce un utente e le sue caratteristiche
 * 			Mediante l’overloading possiamo definire più volte il metodo getUser, passando in ingresso diversi parametri
 * 		public class Utente {
 * 		private int id;
 * 		...
 * 		public getUser(int id) {
 * 		// ... }
 * 		public getUser(String codiceFiscale) {
 * 		// ... }
 * 		public getUser(int id, String codiceFiscale) {
 * 		// ... }}
 * */
		Metodi c = new Metodi();
		String d = c.concatena("io ","sono ","ineluttabile");
		System.out.println(d);		
	}
/*		VARARGS
 * 		definire un metodo con numero di parametri formali indefinito tramite il modificatore ... (3 punti)
 * 		sarà possibile passare al metodo 0 o N parametri di tipo string 
 * */
	public String concatena(String...vars) {
		String out = "";
		for(int i=0; i<vars.length; i++) {
			out += vars[i];
			}
		return out;
		}
/*		MODIFICATORI DI ACCESSO
 * 		determinano la visibilità e quindi l’utilizzo di un metodo, analogamente a quanto accade per le variabili
 * 		- public: il metodo è visibile a tutte le classi
 * 		- private: il metodo è visibile solo alla classe che lo definisce
 * 		- protected: il metodo è visibile solo dalle classi che stanno nello stesso package della classe che lo definisce
 * 				e dalle classi derivate da essa
 * 		- default: il metodo è visibile solo alle classi che si trovano nello stesso package della classe che lo definisce
 * 		- final: utilizzato per rendere un metodo non ridefinibile; su un metodo contrassegnato come final,
 * 				non è possibile fare l’override nella sottoclasse che eredita la classe che lo definisce.
 * 		- static: utilizzato per definire metodi associati ad una classe, ma non ad un’istanza.
 * 				Questo vuol dire che i metodi statici non possono interagire con le variabili di istanza, ma solamente con quelle statiche
 * */

}