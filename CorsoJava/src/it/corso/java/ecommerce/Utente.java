package it.corso.java.ecommerce;

import java.util.List;

/*	utente: rappresenta l'utente che accede all'e-commerce e deve contenere tutti i dati anagrafici e di autenticazione dell'utente.
	Un utente deve avere un ruolo
 * */

public class Utente {
	/* ANAGRAFICA */
	private long idUt;
	private String nome;
	private String cognome;
	private String dataNascita;
	private String luogoNascita;
	private String provNascita;
	private String codiceFiscale;
	/* AUTENTICAZIONE UTENTE */
	private String username;
	private String password;
	/* ALTRE CLASSI */
	private List<TelefonoUtente> telUtente;
	
	/* METODI */
	public void Anagrafica(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
	
	public void Nascita(String dataNascita, String luogoNascita, String provNascita) {
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.provNascita = provNascita;
	}
	
	public void DatiAccesso(long id, String user, String pass) {
		this.idUt = id;
		this.username = user;
		this.password = pass;
	}

	
	/* GETTER SETTER */
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

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getProvNascita() {
		return provNascita;
	}

	public void setProvNascita(String provNascita) {
		this.provNascita = provNascita;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<TelefonoUtente> getTelUtente() {
		return telUtente;
	}

	public void setTelUtente(List<TelefonoUtente> telUtente) {
		this.telUtente = telUtente;
	}

	public long getIdUt() {
		return idUt;
	}

	public void setIdUt(long idUt) {
		this.idUt = idUt;
	}
}