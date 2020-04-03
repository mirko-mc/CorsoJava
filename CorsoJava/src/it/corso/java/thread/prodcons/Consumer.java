package it.corso.java.thread.prodcons;

import java.util.List;

public class Consumer implements Runnable {
	private final List<Integer> bufferCondiviso;
	
	public Consumer(List<Integer> bufferCondiviso, int size) {
		this.bufferCondiviso = bufferCondiviso;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("il consumer sta leggendo il buffer...");
				consumer();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void consumer() throws InterruptedException {
		/* il thread resta in stato wait se il buffer è vuoto */
		while (bufferCondiviso.isEmpty()) {
			synchronized (bufferCondiviso) {
				System.out.println("il buffer è vuoto, il thread consumer resta in ascolto..."
						+ "la dimensione del buffer adesso è: " + bufferCondiviso.size());
				bufferCondiviso.wait();
			}
		}
		/* il buffer contiene elementi, quindi il thread può eliminarne uno e notificarlo al producer */
		synchronized (bufferCondiviso) {
			System.out.println("il thread consumer sta leggendo il buffer ed eliminando il seguente elemento "
						+ bufferCondiviso.remove(0) + ". la dimensione del buffer adesso è: " + bufferCondiviso.size());
			bufferCondiviso.notifyAll();
		}
	}
}