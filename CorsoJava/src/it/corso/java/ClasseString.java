package it.corso.java;

public class ClasseString {

	public static void main(java.lang.String[] args) {
		/* STRING
		 * sequenza di caratteri (lettere, numeri, apici, apostrofi, caratteri speciali, ecc)
		 * le stringhe si rappresentano con l'oggetto String del package java.lang
		 * non esiste il tipo primitivo string
		 * */
		String stringa1 = "12345";
		String stringa2 = "><{$";
		
		String var1 = "lorem \" ipsum ";
		
		/* la classe String è immutabile, cioè lo stato di un'istanza di quella classe 
		 * NON può essere modificato dopo che è stato creato.
		 * pertanto la classe String non è ereditabile 
		 * */
		//ottenere istanza della classe String
		//stringa con valore
		String s1 = "  stringa 1 ";
		//stringa con valore nullo
		String s2;
		//stringa con creazione dell'oggetto
		String s3 = new String();
		//stringa con creazione ed inizializzazione dell'oggetto
		String s4 = new String(" stringa 4   ");
		//stringa creata a partire da un array di chat
		char[] array = {'s','t','r','i','n','g','a',' ','5'};
		String s5 = new String(array);
		
		/* CONCATENAZIONE
		 * unisce più stringhe in un'unica stringa e si può effettuare in due modi:
		 * - utilizzando l'operatore +
		 * - utilizzando il metodo concat della classe String 
		 * */
		String s6 = s1+s4;
		String s7 = s1.concat(s4);
		System.out.println("concat + " + s6);
		System.out.println(".concat " + s7);
		
		/* TRASFORMAZIONE
		 * trasforma la stringa (in minuscolo, in maiuscolo,
		 * eliminare spazi iniziali e finali, eliminare determinati caratteri, etc...)
		 * */
		System.out.println(".toUpperCase" + s6.toUpperCase());
		System.out.println(".toLowerCase" + s6.toLowerCase());
		System.out.println(".trim" + s6.trim());
		
		/* SOSTITUZIONE
		 * sostituisce caratteri all'interno di una stringa:
		 * - replace(CharSequence target, CharSequence replacement):
		 *		sostituisce tutte le sottostringhe uguale a quella TARGET
		 *		con la sottostringa REPLACEMENT
		 * - replaceAll(String regex, String replacement):
		 * 		sostituisce tutte le sottostringhe che corrispondono all'espressione
		 * 		regolare REGEX, con la sottostringa REPLACEMENT
		 * - replaceFirst(String regex, String replacement):
		 * 		sostituisce la prima sottostringa che corrisponde all'espressione
		 * 		regolare REGEX, con la sottostringa REPLACEMENT
		 * */
		System.out.println(".replace" + s6.replace("a", "O"));
		System.out.println(".replaceAll" + s6.replaceAll("[m-zM-Z]+", "O"));
		System.out.println(".replaceFirst" + s6.replaceFirst("[m-zM-Z]+", "O"));
		
		/* ESTRAZIONE
		 * recuperare porzione di stringa:
		 * - substring(beginIndex):
		 *		restituisce la sottostringa che va dal carattere che si trova
		 *		all'indice indicato in beginIndex fino alla fine della stringa
		 * - substring(beginIndex, endIndex):
		 * 		restituisce la sottostringa che va dal carattere che si trova
		 * 		all'indice indicato in beginIndex fino al carattere che si trova all'indice endIndex-1.
		 * */
		System.out.println(".substring(5)" + s6.substring(5));
		System.out.println(".substring(5, 11)" + s6.substring(5, 11));
		
		/* CONFRONTO
		 * effettuare il confronto tra stringhe
		 * - equals(Object anObject):
		 * 		effettua un confronto tra due stringhe e ritorna true se sono uguali,
		 * 		false altrimenti. Questo metodo è case sensitive (cioè "parola" e "Parola"
		 * 		sono diverse).
		 * - equalsIgnoreCase(String anotherString):
		 * 		effettua un confronto tra due stringhe e ritorna true se sono uguali,
		 * 		false altrimenti. Questo metodo non è case sensitive (cioè "parola" e "Parola"
		 * 		sono uguali).
		 * */
		System.out.println(".equals(s1)" + s6.equals(s1));
		System.out.println(".equalsIgnoreCase" + s6.equalsIgnoreCase(s6));
		
		//METODI UTILI
		//.lenght restituisce la lunghezza della stringa
		System.out.println("la stringa è " + s6.length() + " caratteri");
		/*.ValueOf(int i) ritorna una stringa contenente il numero intero
		 * (converte anche tipi boolean, char, long, float, Object, etc...)
		 * */
		System.out.println(".ValueOf " + s6.valueOf(20));
		/* .split(String regex) divide una stringa in un array di stringhe
		 * secondo l'espressione regolare indicata
		 * */
		String[] s6ar = s6.split(" ");
		for(int i = 0; i < s6ar.length; i++) {
		System.out.println(".split " + s6ar[i]);
		}
		
		/* .startsWith(String prefix): ritorna true se la stringa inizia con il prefisso indicato, false altrimenti
		 * */
		System.out.println(".startsWith(\"  str\") " + s6.startsWith("  str"));
		
		/* .endsWith(String suffix): ritorna true se la stringa finisce con il suffisso indicato, false altrimenti
		 * */
		System.out.println(".endsWith(\"str\") " + s6.endsWith("str"));
		
		/* .charAt(int index): ritorna il carattere presente nella stringa all'indice indicato
		 * */
		System.out.println(".charAt(10) " + s6.charAt(5));
		
		//verificare se una stringa è palindroma
		String str1 = "anna";
		String str2 = "";
		for(int i = str1.length()-1; i >= 0; i--) {
			str2 += str1.charAt(i);
			}
		boolean isPalindrome = str1.equals(str2);
		System.out.println("str1 è palindroma? " + isPalindrome);
		
		//controllare le occorrenze di un carattere o una sottostringa
		str1 = "Oggi è una bella giornata.";
		String token = "gg";
		int nOccorrenze = 0;
		for(int i = 0; i <= str1.length()-token.length(); i++) {
			String temp = str1.substring(i, i+token.length());
			if(temp.equals(token)) {
				nOccorrenze++;
				}
			}
		System.out.println("Il token '" + token + "' compare " + nOccorrenze + " volte.");
	}
}