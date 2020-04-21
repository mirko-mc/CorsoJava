package it.corso.java.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utente")
/* linguaggio JPQL. simile a SQL ma in più è portatile (non cambia a prescindere dal DBMS utilizzato)
 * questa query restituisce l'elenco di tutti gli utenti presente nel database */
@NamedQuery(name = "elencoUtenti", query = "SELECT u FROM Utente u")
public class Utente {
	private Integer id;
	private String nome;
	private String cognome;
	private List<ContoCorrente> conti;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utente")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "nome")
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
	/* ONETOMANY perchè un utente può avere più conti correnti
	 * in MAPPEDBY dobbiamo mettere qual è l'attributo usato all'interno della classe CONTOCORRENTE che mappa UTENTE
	 * CASCADETYPE.ALL vuol dire che quando, ad esempio, creo un utente e all'interno della lista metto più conti correnti, l'insert dell'utente sarà in transazione
	 * con l'insert di tutti i conti correnti. quindi in una sola operazione effettua il CRUD su UTENTE e CONTOCORRENTE
	 * */
	@OneToMany(mappedBy = "utenteConto",cascade = CascadeType.ALL)
	public List<ContoCorrente> getConti() {
		return conti;
	}
	public void setConti(List<ContoCorrente> conti) {
		this.conti = conti;
	}
}
