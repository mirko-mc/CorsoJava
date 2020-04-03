package it.corso.java.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class EsempioReentrantLock {
	private ReentrantLock istLock = new ReentrantLock();
	private int contatore = 0;
	private int somma = 0;
	
	public int conta() {
		System.out.println("il thread " + Thread.currentThread().getName() + " ha richiesto di incrementare il contatore");
		istLock.lock();
		
		try {
			System.out.println(Thread.currentThread().getName() + "contatore = " + contatore);
			contatore++;
			return contatore;			
		} finally {
			istLock.unlock();
		}
	}
	
	public void somma() {
		System.out.println("il thread " + Thread.currentThread().getName() + " ha richiesto di visualizzare la somma dei contatori");
		
		if (istLock.tryLock()) {
			try {
				somma += contatore;
				System.out.println(Thread.currentThread().getName() + " la somma vale = " + somma);
			} finally {
				istLock.unlock();
			}
		} else {
			System.out.println("--------------- il thread che ha il lock dell'oggetto è " + Thread.currentThread().getName());
		}
	}
}