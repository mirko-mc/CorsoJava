package it.esempio.gestionale;

public class Cliente {
	private long id;
	private String nome;
	private String cognome;
	private String codicefiscale;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodicefiscale() {
		return codicefiscale;
	}
	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
	
	@Override
	public String toString() {
		return getNome() + " " + getCognome() + " " + getCodicefiscale();
	}
	
}