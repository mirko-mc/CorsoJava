package it.corso.java.thread.lock;

public class Contatore extends Thread{
	private EsempioReentrantLock counter;
	private int limite;
	private int sleep;
	
	public Contatore(EsempioReentrantLock counter, int limite, int sleep) {
		super();
		this.counter = counter;
		this.limite = limite;
		this.sleep = sleep;
	}

	@Override
	public void run() {
		while (counter.conta() < limite) {
			counter.somma();
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}