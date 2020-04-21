package it.corso.java.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	private long id;
	private String nome;
	private String cognome;
	private int anni;
	/* INDIRIZZI ci servirà in futuro quando tratteremo la relazione tra tabelle */
	private List<Indirizzo> indirizzi;
	/* dichiaro la classe ACCOUNT per stabilire la relazione ONE-TO-ONE */
	private Account account;
	
	@Id
	@Column(name = "id_persona")
	/* GENERATIONTYPE.IDENTITY forza il container ad usare l'autoincrement nel caso non lo facesse */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "nome", nullable = false, length = 100)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name = "cognome")
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Column(name = "anni")
	public int getAnni() {
		return anni;
	}
	public void setAnni(int anni) {
		this.anni = anni;
	}
	/* specificare il CASCADE per estendere il CRUD alle entità collegate. senza darà errore */
	@OneToOne(cascade = CascadeType.ALL)
	/* definisco tipo di relazione tra le due tabelle e la colonna che farà da FOREIGNKEY */
	@JoinColumn(name = "id_account")
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}