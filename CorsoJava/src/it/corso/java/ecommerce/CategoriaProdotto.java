package it.corso.java.ecommerce;

import java.util.List;

/*	categoria di prodotto: rappresenta una categoria merceologica.
	Una categoria merceologica può avere altre sotto-categorie.
 * */

public class CategoriaProdotto {
	private long idCat;
	private String nomeCat;
	private String descrizioneCat;
	private boolean sottocategoria;
	private List<CategoriaProdotto> categoriaProd;
	
	public CategoriaProdotto(long idCat, String nomeCat, String descrizioneCat, boolean sottocategoria) {
		super();
		this.idCat = idCat;
		this.nomeCat = nomeCat;
		this.sottocategoria = sottocategoria;
		this.descrizioneCat = descrizioneCat;
	}
	
	/* GETTER SETTER */
	public long getIdCat() {
		return idCat;
	}
	public void setIdCat(long idCat) {
		this.idCat = idCat;
	}
	public String getNomeCat() {
		return nomeCat;
	}
	public void setNomeCat(String nomeCat) {
		this.nomeCat = nomeCat;
	}
	public String getDescrizioneCat() {
		return descrizioneCat;
	}
	public void setDescrizioneCat(String descrizioneCat) {
		this.descrizioneCat = descrizioneCat;
	}

	public boolean isSottocategoria() {
		return sottocategoria;
	}

	public void setSottocategoria(boolean sottocategoria) {
		this.sottocategoria = sottocategoria;
	}

	@Override
	public String toString() {
		return "CATEGORIA: " + getNomeCat() + " |E' UNA SOTTOCATEGORIA? " + isSottocategoria() + "\n";
	}

	public List<CategoriaProdotto> getCategoriaProd() {
		return categoriaProd;
	}

	public void setCategoriaProd(List<CategoriaProdotto> categoriaProd) {
		this.categoriaProd = categoriaProd;
	}
}