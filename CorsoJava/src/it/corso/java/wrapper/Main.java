package it.corso.java.wrapper;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		Integer b = 5;
		Integer c = a + b;
		/* la differenza è che a. non ha metodi, b. sì */
		System.out.println(c);
		
		/* boxing */
		Double d1 = new Double(10.40);
		double d2 = 10.40;
		Double d3 = d2;
		
		/* autoboxing */
		Double d4 = 10.40;
		
		/* unboxing */
		double d5 = d4;
		
	}

}
