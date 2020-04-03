package it.corso.java.thread;

import java.io.InterruptedIOException;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		EsempioTryCatchFinally t1 = new EsempioTryCatchFinally(10);
		
		/* avvio il thread */
		t1.start();
		/* interrompo il thread */
		t1.interrupt();
	}
}