package it.esempio.smartphone;

import java.util.ArrayList;
import java.util.List;

public class Prodotto {
	private String id;
	private String nome;
	private String descrizione;
	private double prezzo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	protected void stampa() {
		/*...*/
	}
	
	private void sincronizza() {
		/*...*/
	}
	
	public List<String> getStores() {
		ArrayList<String> tmp = new ArrayList<String>();
		tmp.add("negozio 1");
		tmp.add("negozio 2");
		tmp.add("negozio 3");
		tmp.add("negozio 4");
		return tmp;
	}
}
