package it.corso.java.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "indirizzo")
public class Indirizzo {
	private Long id;
	private String via;
	private String citta;
	
	/* GETTER SETTER */
	@Id
	@Column(name = "id_indirizzo")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "via")
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	@Column(name = "citta")
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	
}