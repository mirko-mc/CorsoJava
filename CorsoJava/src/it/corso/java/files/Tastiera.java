package it.corso.java.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tastiera {

	public static void main(String[] args) {
		esempioInputStreamReader();
		esempioScanner();
	}
	
	public static void esempioScanner() {
		System.out.println("INPUT STREAM READER");
		String saluto = "ciao ";

		System.out.println("inserisci il tuo nome: ");
		Scanner scan = new Scanner(System.in);
		saluto += scan.nextLine();
		scan.close();
		
		System.out.println("inserisci il tuo cognome: ");
		scan = new Scanner(System.in);
		saluto += " " + scan.nextLine();
		scan.close();
			
		System.out.println(saluto);
	}
	
	public static void esempioInputStreamReader() {
		System.out.println("SCANNER");
		String saluto = "ciao ";
		
		try {
			System.out.println("inserisci il tuo nome: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			saluto += br.readLine();
			
			System.out.println("inserisci il tuo cognome: ");
			br = new BufferedReader(new InputStreamReader(System.in));
			saluto += " " + br.readLine();
			
			System.out.println(saluto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
