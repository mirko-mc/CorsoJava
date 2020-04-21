package it.corso.java.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conto_corrente")
public class ContoCorrente {
	private Integer id;
	private String numeroConto;
	private Utente utenteConto;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_conto_corrente")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "numero_conto")
	public String getNumeroConto() {
		return numeroConto;
	}
	public void setNumeroConto(String numeroConto) {
		this.numeroConto = numeroConto;
	}
	/* MANYTOONE perchè più conti correnti possono appartenere a un utente */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_utente")
	public Utente getUtenteConto() {
		return utenteConto;
	}
	public void setUtenteConto(Utente utenteConto) {
		this.utenteConto = utenteConto;
	}
}
