package it.corso.java.liste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import it.esempio.gestionale.Smartphone;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
//		m.creaArray();
//		m.arrayMultidimensionale();
//		m.esempioHashMap();
//		m.getConfig();
//		m.esempioArrayList();
//		m.esempioIterazione();
	}
	
	public void esempioArrayList() {
		/* primo modo per creare oggetto di tipo arrayList:
		 * definire oggetto List ed inizializzarlo con costruttore new ArrayList */
		List<String> lista = new ArrayList<String>();
		lista.add("Paolo");
		lista.add("Mario");
		lista.add("Chiara");
		lista.add("Marta");
		lista.add(2, "Valerio");
		
		/* itera lista */
		for (String string : lista) {
			System.out.println(string);
		}
		
		/* dato l'indice rimuove l'elemento */
		lista.remove(2);
		
		System.out.println("-----------");
		for (String string : lista) {
			System.out.println(string);
		}
		
		/* dato indice e valore sostituisce il valore in quella posizione col valore passato */
		lista.set(2, "Claudia");
		System.out.println("-----------");
		for (String string : lista) {
			System.out.println(string);
		}
		
		System.out.println("-------");
		System.out.println("POSIZIONE DI MARIO: " + lista.indexOf("Mario"));
		
		System.out.println("-------");
		/* converte lista in array di stringhe */
		System.out.println(lista.toString());
		/* convertire lista in array */
		/* modo 1: aggiungere cast String[] prima di lista.toArray
		 * non garantisce la corretta conversione nell'array specificato, infatti genera errore */
//		String[] listaArray1 = (String[])lista.toArray();
		/* modo 2: metodo toArray e passare in ingresso un nuovo array come dimensione il numero di elementi della lista*/
		String[] listaArray2 = lista.toArray(new String[lista.size()]);
		
		for (String string : listaArray2) {
			System.out.println("--- " + string);
		}
		
		System.out.println("GRANDEZZA LISTA: " + lista.size());
		System.out.println("LISTA VUOTA: " + lista.isEmpty());
		lista.clear();
		System.out.println("GRANDEZZA LISTA: " + lista.size());
		System.out.println("LISTA VUOTA: " + lista.isEmpty());
		
		/* secondo modo:
		 * creare direttamente oggetto arrayList */
		ArrayList<Smartphone> lista2 = new ArrayList<Smartphone>();
		Smartphone sm = new Smartphone();
		sm.setMarca("Apple");
		sm.setModello("iPhone");
		
		lista2.add(sm);
		
		Smartphone sm2 = new Smartphone();
		sm.setMarca("Samsung");
		sm.setModello("Galaxy");
		
		lista2.add(sm2);
		System.out.println(lista2.toString());
	}
	public void getConfig() {
		Properties p = new Properties();
		
		InputStream is;
		try {
			is = new FileInputStream(new File("D:\\MIRKO\\DEV\\UDEMY\\Java EE Developer\\Lezioni\\config.properties"));
			
			p.load(is);
			
			System.out.println(p.getProperty("db-name"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void esempioHashMap() {
		/* due modi per creare */
		/* creando oggetto */
		Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();
		
		Smartphone sm = new Smartphone();
		sm.setMarca("Apple");
		sm.setModello("iPhone 10");
		
		mappa.put(sm.getModello(), sm);
		
		Smartphone sm2 = new Smartphone();
		sm2.setMarca("Samsung");
		sm2.setModello("Galaxy Note 10");
		
		mappa.put(sm2.getModello(), sm2);
		
		Smartphone sm3 = mappa.get("iPhone 10");
		System.out.println(sm3.getMarca() + " " + sm3.getModello());
		sm3 = mappa.get("Galaxy Note 10");
		System.out.println(sm3.getMarca() + " " + sm3.getModello());
		
		/* ritorna l'elenco delle chiavi della mappa
		 * utilizzato per iterare le chiavi della mappa */
		Set<String> chiavi = mappa.keySet();
		for (String string : chiavi) {
			System.out.println("chiave: " + string);
		}
		/* sapere se una mappa è vuota */
		System.out.println("LA MAPPA è VUOTA: " + mappa.isEmpty());
		/* verificare se un elemento esiste nella mappa */
		System.out.println("L'ELEMENTO Galaxy Note 10 ESISTE: " + mappa.containsKey("Galaxy Note 10"));
		/* rimuove l'oggetto dalla mappa */
		//mappa.remove("Galaxy Note 10");
		System.out.println("RIMOSSO ELEMENTO Galaxy Note 10");
		/* verificare se un elemento esiste nella mappa */
		System.out.println("L'ELEMENTO Galaxy Note 10 ESISTE: " + mappa.containsKey("Galaxy Note 10"));
		/* ritorna gli n elementi della mappa*/
		System.out.println("NUMERO ELEMENTI PRIMA DELLA PULIZIA: " + mappa.size());
		/* svuota la mappa */
		//mappa.clear();
		/* ritorna gli n elementi della mappa */
		System.out.println("NUMERO ELEMENTI DOPO LA PULIZIA: " + mappa.size());

		/* for each */
		System.out.println("----------> FOREACH");
		for (String string : chiavi) {
			System.out.println(string);
		}
		/* iterator */
		System.out.println("----------> ITERATOR");
		Iterator<String> it = chiavi.iterator();
		while (it.hasNext()) {
			String chiave = it.next();
			System.out.println(chiave);
		}
		
		/* creando istanza tramite classe hashmap */
		HashMap<String, Smartphone> mappa2 = new HashMap<String, Smartphone>();
	}
	
	public void arrayMultidimensionale() {
		int[][] matrice = new int[10][10];
		
		/* itera sulle righe */
		for(int i = 0; i < matrice.length; i++) {
			/* itera sulle colonne */
			for(int j = 0; j < matrice[i].length; j++) {
				matrice[i][j] = i + j;
			}
		}
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++) {
				System.out.println(matrice[i][j]);
			}
		}
		/*
		 * 1	2	3	4	5	6	7	8	9	10
		 * 2	2	3	4	5	6	7	8	9	10
		 * 3	2	3	4	5	6	7	8	9	10
		 * 4	2	3	4	5	6	7	8	9	10
		 * 5	2	3	4	5	6	7	8	9	10
		 * 6	2	3	4	5	6	7	8	9	10
		 * 7	2	3	4	5	6	7	8	9	10
		 * 8	2	3	4	5	6	7	8	9	10
		 * 9	2	3	4	5	6	7	8	9	10
		 * 10	2	3	4	5	6	7	8	9	10
		 */
	}
	
	public void creaArray() {
		int[] test;										/*definizione*/
		test = new int[5];								/*inizializzazione*/
		
		int[] numeri = new int[10];						/*definizione + inizializzazione*/
		
		numeri[0] = 10;
		numeri[1] = 11;
		numeri[2] = 12;
		numeri[3] = 13;
		numeri[4] = 14;
		numeri[5] = 15;
		numeri[6] = 16;
		numeri[7] = 17;
		numeri[8] = 18;
		numeri[9] = 19;
		
		for (int i = 0; i < numeri.length; i++) {
			numeri[i] = 10 + i;
		}
		
		Smartphone[] prodotti = new Smartphone[3];		/*definizione + inizializzazione*/
		
		prodotti[0] = new Smartphone();
		prodotti[0].setMarca("Apple");
		prodotti[0].setModello("iPhone");
		prodotti[1] = new Smartphone();
		prodotti[1].setMarca("Samsung");
		prodotti[1].setModello("Note");
		prodotti[2] = new Smartphone();
		prodotti[2].setMarca("Huawei");
		prodotti[2].setModello("P9 Plus");
		
		for (int i = 0; i < prodotti.length; i++) {
			Smartphone sm = prodotti[i];
			System.out.println(sm.getMarca() + " " + sm.getModello());
		}
		
		for (Smartphone sm : prodotti) {
			System.out.println(sm.getMarca() + " " + sm.getModello());
		}
	}
	
	public void esempioIterazione() {
		List<String> lista = new ArrayList<String>();
		lista.add("Paolo");
		lista.add("Mario");
		lista.add("Chiara");
		lista.add("Marta");
		
		/* for */
		System.out.println("----------> FOR");
		for (int i = 0; i < lista.size(); i++) {
			String nome = lista.get(i);
			System.out.println(nome);
		}
		/* for each */
		System.out.println("----------> FOREACH");
		for (String nome : lista) {
			System.out.println(nome);
		}
		/* iterator */
		System.out.println("----------> ITERATOR");
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			String nome = it.next();
			System.out.println(nome);
		}
	}
}