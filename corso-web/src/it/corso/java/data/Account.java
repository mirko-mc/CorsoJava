package it.corso.java.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	private Integer id;
	private String username;
	private String password;
	/* dichiarare la classe PERSONA per avere una relazione ONE-TO-ONE BIDIREZIONALE (ogni tabella accede ai campi dell'altra) */
//	private Persona persona;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_account")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/* specificare con MAPPEDBY il nome della variabile utilizzata per inserire la mappatura all'interno della classe PERSONA per relazione ONE-TO-ONE BIDIREZIONALE */
//	@OneToOne(mappedBy = "account")
//	public Persona getPersona() {
//		return persona;
//	}
//	public void setPersona(Persona persona) {
//		this.persona = persona;
//	}
}
