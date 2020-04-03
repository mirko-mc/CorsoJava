package it.mirko.campetiello;

import java.util.Date;

/*	Creare una classe che rappresenta un articolo ed ha i seguenti attributi private:
	Creare:
 	- i get e set public di tutti gli attributi
	- un costruttore che inizializzi tutti gli attributi della classe
	- un metodo conta che ritorna il numero di caratteri presenti nel testo
	- un metodo contaPalindrome che ritorna il numero di parole palindrome presenti nel testo
 * */
public class Articolo {
	public static void main(String[] args) {
		Articolo a = new Articolo(123, "il coronavirus", "che ne sacc", "osso asso osso", "Paolo Preite", new Date(), new Date());
		a.conta();
		a.contaPalindromi();
	}
	
	private long id;
	private String titolo;
	private String abstract_;
	private String testo;
	private String autore;
	private Date dataCreazione = new Date();
	private Date dataPubblicazione = new Date();
	
	
	/* COSTRUTTORE */	
	public Articolo(long id, String titolo, String abstract_, String testo, String autore, Date dataCreazione, Date dataPubblicazione) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.abstract_ = abstract_;
		this.testo = testo;
		this.autore = autore;
		this.dataCreazione = dataCreazione;
		this.dataPubblicazione = dataPubblicazione;
	}
	
	
	
	/* METODI */
	private void conta() {
		System.out.println("---------- CONTA");
		int conta = 0;
		for (int i = 0; i < testo.length(); i++) {
			if (!testo.substring(i, i+1).equals(" ")) {
				System.out.print(testo.substring(i, i+1));
				conta++;
			}
		}
		System.out.println("\nil testo contiene " + conta + " caratteri");
	}
	
	private void contaPalindromi() {
		System.out.println("---------- CONTA PALINDROMI");
		int conta = 0;
		String confronta;
		String[] palindromo = testo.split(" ");
		for (String temp : palindromo) {
			System.out.println(temp);
			confronta = "";
			for (int i = temp.length(); i > 0; i--) {
				confronta += temp.substring(i-1, i);
			}
			if (temp.equals(confronta)) {
				System.out.println("trovato un palindromo");
				conta++;
			} else {
				System.out.println("non è palindromo");
			}
		}
		System.out.println("ho trovato " + conta + " palindromi");
	}
	
	/* GETTER SETTER */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAbstract_() {
		return abstract_;
	}
	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public Date getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	public Date getDataPubblicazione() {
		return dataPubblicazione;
	}
	public void setDataPubblicazione(Date dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}
}