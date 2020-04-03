package it.corso.java;

public class Calcolatrice {
	public double somma(double a, double b) {
		return a+b;
	}
	
	public double sottrazione(double a, double b) {
		return a-b;
	}

	public double moltiplicazione(double a, double b) {
		return a*b;
	}

	public double divisione(double a, double b) {
		if(b==0) {
			System.out.println("ATTENZIONE: divisione per 0!!!");
		}
		return a/b;
	}
}
