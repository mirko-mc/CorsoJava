package it.corso.java.thread;

public class EsempioTryCatchFinally extends Thread {
	private long sleep;

	public EsempioTryCatchFinally(long sleep) {
		super();
		this.sleep = sleep;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleep);
		} catch (Exception e) {
		} finally {
			System.out.println("entrato nel finally");
		}
	}
}