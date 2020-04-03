package it.corso.java.generics;

import java.util.ArrayList;
import java.util.List;

import it.corso.java.classiinnerlocali.Appartamento;

public class Main {

	public static void main(String[] args) {
		/* COSA SONO JAVA GENERICS
		 * un geenerics è uno strumento che permette di definire elementi parametrizzati attraverso la notazione <tipo>
		 * in modo da indicare cosa conterrà l'elemento
		 * 
		 * COS'E' IL CASTING
		 * indica a java il tipo di elemento
		 * il casting è un'operazione pesante per java
		 * */
		
		/* senza generics */
		List lista1 = new ArrayList();
		lista1.add("es 1");
		lista1.add("es 2");
		lista1.add(new Appartamento());
		/* con casting */
		String test1 = (String) lista1.get(0);
		
		/* con generics */
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("es 3");
		lista2.add("es 4");
		/* la lista è stata tipizzata String quindi Java genera errore al rigo successivo
		 * in quanto l'elemento aggiunto non è una stringa
		 * */
//		lista2.add(new Appartamento());
		/* senza casting perchè già parametrizzato */
		String test2 = lista2.get(0);
	}
}