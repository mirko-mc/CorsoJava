package it.corso.java.rubrica.model;
/* questa è la classe che mappa la nostra tabella */
public class Contatto {
	/* dichiarazione variabili contatto */
	private int id;
	private String nome;
	private String cognome;
	private String telefono;
	
	/* creiamo costruttore default qualora dovessimo averne bisogno */
	public Contatto() {
		super();
	}

	/* creiamo costruttore per nome, cognome, telefono */
	public Contatto(String nome, String cognome, String telefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}
	/* getter and setter */
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}