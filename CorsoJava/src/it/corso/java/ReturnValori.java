package it.corso.java;

public class ReturnValori {

	public static void main(String[] args) {
/*		RETURN
 * 		Il comando return viene utilizzato quando un metodo deve ritornare un valore
 * 			al termine dell'esecuzione.
 * 		Il valore ritornato dal metodo deve essere compatibile con quello definito
 * 			in fase di dichiarazione.
 * */
		ReturnValori ret = new ReturnValori();
		System.out.println(ret.molt(3, 5));
		System.out.println(ret.divi(20, 4));
		System.out.println(ret.retTes(null));
	}
	public int molt(int a, int b) {
		return a*b;
		}
		public double divi(double dividendo, double divisore) {
		return dividendo/divisore;
		}
		public String retTes(String testo) {
		if(testo == null) {
		return "il testo è null";
		} else if(testo.trim().equals("")) {
		return "il testo è vuoto";
		}
		return "il testo c'è ed è: " + testo;
		}
}