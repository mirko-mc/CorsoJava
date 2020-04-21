package it.corso.java.data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "fattura")
/* indichiamo la tabella collegata specificando NOMETABELLA e CHIAVEPRIMARIA per il CRUD */
@SecondaryTable(name = "cliente", pkJoinColumns = {@PrimaryKeyJoinColumn(name = "id_cliente")})
public class Fattura implements Serializable {
	private Integer id;
	private String numeroFattura;
	private Date dataFattura;
	/* dichiariamo la classe CLIENTE che contiene i campi della tabella secondaria */
	private Cliente cliente;
	
	@Id
	@Column(name = "id_fattura")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "numero")
	public String getNumeroFattura() {
		return numeroFattura;
	}
	public void setNumeroFattura(String numeroFattura) {
		this.numeroFattura = numeroFattura;
	}
	/* nel DATABASE l'abbiamo dichiarato come DATETIME quindi qui va specificato */
	@Temporal(TemporalType.DATE)
	@Column(name = "data_fattura")
	public Date getDataFattura() {
		return dataFattura;
	}
	public void setDataFattura(Date dataFattura) {
		this.dataFattura = dataFattura;
	}
	/* specifichiamo che questo campo è da mappare sulla tabella CLIENTE */
//	li sposto nella CLASSE CLIENTE PER EMBEDDED
//	@Column(name = "nome", table = "cliente")
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	@Column(name = "cognome", table = "cliente")
//	public String getCognome() {
//		return cognome;
//	}
//	public void setCognome(String cognome) {
//		this.cognome = cognome;
//	}
	/* annotiamo con EMBEDDED per indicare che la classe contiene i campi della tabella secondaria */
	@Embedded
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
