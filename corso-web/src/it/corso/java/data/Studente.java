package it.corso.java.data;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "studente")
public class Studente {
	private Integer id;
	private String nome;
	private String cognome;
	private List<Corso> corsi;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_studente")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "nome")
	/* di default l'attributo viene valorizzato al momento della creazione dell’entità che lo contiene (EAGER).
	 * se vogliamo valorizzarlo al momento dell’invocazione del suo metodo get bisogna impostare LAZY.
	 * LAZY è necessario per campi di tipo @LOB (sono campi con tipo di dato BLOB
	 * (che contengono file di grandi dimensioni) in modo che il caricamento ell'ENTITY sia più veloce).
	 * 
	 * modalità di caricamento default nelle RELAZIONI:
	 * One-To-One   -> EAGER
	 * Many-To-One  -> EAGER
	 * One-To-Many  -> LAZY
	 * Many-To-Many -> LAZY
	 * non sempre la modalità di caricamento di default è da preferire. impostare secondo necessità
	 * */
	@Basic(fetch = FetchType.LAZY)
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
	@ManyToMany//(cascade = CascadeType.ALL)
	@JoinTable(
			/* nome della terza tabella che contiene gli id */
			name = "studente_corso",
			/* mappatura sulla tabbella studente dato che siamo nella classe STUDENTE */
			joinColumns = {@JoinColumn(name = "id__studente", referencedColumnName = "id_studente")},
			/* colonna della tabbella mappata su CORSO */
			inverseJoinColumns = {@JoinColumn(name = "id__corso", referencedColumnName = "id_corso")}
			)
	public List<Corso> getCorsi() {
		return corsi;
	}
	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
}
