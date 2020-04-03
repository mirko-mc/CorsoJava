package it.corso.java.annotation;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Prodotto p = new Prodotto();
		p.calcolaIva(22);
	}

}
