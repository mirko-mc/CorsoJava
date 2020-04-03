package it.corso.java.thread.sync;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		Cliente c1 = new Cliente("Zod",20);
//		Cliente c2 = new Cliente("Torty",50);
//		/* avvio il thread */
//		c1.start();
//		c2.start();
//		/* attendo il completamento */
//		c1.join();
//		c2.join();
		
		ClienteNonSync c3 = new ClienteNonSync("Zod",20);
		ClienteNonSync c4 = new ClienteNonSync("Torty.0",50);
		/* avvio il thread */
		c3.start();
		c4.start();
		/* attendo il completamento */
		c3.join();
		c4.join();
	}
}