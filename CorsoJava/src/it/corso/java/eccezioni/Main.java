package it.corso.java.eccezioni;

import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws CorsoJavaException {
		 File f = new File("test.txt");
		 f.exists();
		 
//		 FileReader fr = new FileReader(f);
		 
		 Main m = new Main();
//		 m.stampaTesto2("frase");
//		 m.stampaTesto("prova");
//		 try {
//			m.stampaTesto3(null);
//		} catch (CorsoJavaException e) {
//			System.out.println(e.getMessage());
//		}
		 
		m.esegui(null);
		
		System.out.println("ECCOMI DOPO ESEGUI");
	}
	
	private void stampaTesto(String testo) {
		String tmp = testo.concat("...");
		System.out.println(tmp);
/*		if(testo != null) {
			String tmp = testo.concat("...");
			System.out.println(tmp);
		} else {
			System.out.println("la variabile è NULL");
		}*/	
	}
	
	private void stampaTesto2(String testo) {
		try {
		stampaTesto(testo);
		int val = 10;
		if(testo != null && testo.length() < val) {
			System.out.println("il testo ha meno di " + val + " caratteri");
		}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("sono nel finally");
		}
	}
	
	private void stampaTesto3(String testo) throws CorsoJavaException {
		if(testo == null) {
			throw new CorsoJavaException();
		}
		stampaTesto(testo);
	}
	
	private String esegui(String testo) throws CorsoJavaException {
		stampaTesto3(testo);
		return "ho stampato il testo"; 
	}
}
