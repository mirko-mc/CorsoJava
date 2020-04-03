package it.esempio.gestionale;

public class Prodotto {
	private long id;
	private String nome;
	private String descrizione;
	private double prezzo;
	private Categoria categoriaMerceologica;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public Categoria getCategoriaMerceologica() {
		return categoriaMerceologica;
	}
	public void setCategoriaMerceologica(Categoria categoriaMerceologica) {
		this.categoriaMerceologica = categoriaMerceologica;
	}
	
	public void stampaProdotto() {
		System.out.println(getId() + " " + getNome() + " " + getPrezzo());
	}
}
