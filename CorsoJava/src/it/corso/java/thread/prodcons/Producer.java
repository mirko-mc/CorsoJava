package it.corso.java.thread.prodcons;

import java.util.List;

public class Producer implements Runnable {
	private final List<Integer> bufferCondiviso;
	private final int SIZE;
	private int i;
	
	public Producer(List<Integer> bufferCondiviso, int size) {
		this.bufferCondiviso = bufferCondiviso;
		SIZE = size;
	}

	@Override
	public void run() {
		while (true) {
			try {
				produce();
				i++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void produce() throws InterruptedException {
		/* il thread resta in stato wait se il buffer è pieno */
		while (bufferCondiviso.size() == SIZE) {
			synchronized (bufferCondiviso) {
				System.out.println("il buffer è pieno, il thread producer resta in attesa..."
						+ "la dimensione del buffer adesso è: " + bufferCondiviso.size());
				bufferCondiviso.wait();
			}
		}
		synchronized (bufferCondiviso) {
			bufferCondiviso.add(i);
			bufferCondiviso.notifyAll();
			System.out.println("il thread producer ha aggiunto al buffer l'elemento " + i
						+ ". la dimensione del buffer adesso è: " + bufferCondiviso.size());
		}
	}
}