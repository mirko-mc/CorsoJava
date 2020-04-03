package it.mirko.campetiello;

public class ciao {
/*	132
 *	Scrivere una classe Ciao.java che stampi sulla console il testo Ciao TuoNome TuoCognome!.
 *	
 *	Il package della classe deve essere it.tuonome.tuocognome
 * */
	public static void main(String[] args) {
		System.out.println("132 -> Ciao Mirko Campetiello");
		
		stampaSaluto();
	}
	
/*	133
 *	Nella classe Ciao.java, creare un metodo privato stampaSaluto() che stampi sulla console il testo Ciao TuoNome TuoCognome! all’interno di un rettangolo.
 *	Invocare il metodo nel metodo main.
 *	Suggerimento: usare solo System.out.println("") per costruire il rettangolo, mendiante l’uso dei simboli - + |
 * */
	private static void stampaSaluto() {
		System.out.println("133 -> +--------------------------+");
		System.out.println("133 -> |  Ciao Mirko Campetiello  |");
		System.out.println("133 -> +--------------------------+");
	}
}