package it.corso.java.data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/* annotiamo con EBMEDDABLE perchè non si tratta di una vera e propra ENTITY ma è una tabella secondaria */
@Embeddable
public class Cliente {
	private String nome;
	private String cognome;
	
	@Column(name = "nome", table = "cliente")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name = "cognome", table = "cliente")
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
}
