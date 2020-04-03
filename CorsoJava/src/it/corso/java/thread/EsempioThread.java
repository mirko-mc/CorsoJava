package it.corso.java.thread;

public class EsempioThread extends Thread {

	@Override
	public void run() {
		System.out.println("sono il thread " + getName());
		
		for (int i = 0; i < 10; i++) {
			System.out.print(getName() + " " + i + "-");
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
