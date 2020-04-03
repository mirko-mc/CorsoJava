package it.corso.java.lambda.from8;

public class Main {

	public static void main(String[] args) {
		FormaGeometrica Rettangolo = (a, b) -> a * b;
		Rettangolo.calcolaArea(3, 4);
		
		FormaGeometrica Quadrato = (a, b) -> a * b;
		Quadrato.calcolaArea(3, 3);
		
		StampaMaiuscolo Stampa = testo -> testo.toUpperCase();
	}
}
