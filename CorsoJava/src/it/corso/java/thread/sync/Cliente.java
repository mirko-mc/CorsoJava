package it.corso.java.thread.sync;

public class Cliente extends Thread {
	private double sommaDaPrelevare;
	
	public Cliente(String nomeCliente, double sommaDaPrelevare) {
		super();
		this.setName(nomeCliente);
		this.sommaDaPrelevare = sommaDaPrelevare;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " arriva al bancomat");
		System.out.println("quando " + Thread.currentThread().getName() + " arriva il saldo è " + ContoCorrente.getInstance().getSaldo());
		System.out.println("la somma che vuole prelevare " + Thread.currentThread().getName() + " è: " + sommaDaPrelevare);
		
		
		try {
			ContoCorrente.getInstance().prelievo(sommaDaPrelevare);
			System.out.println(Thread.currentThread().getName() + " tutto ok, prelievo effettuato");
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " noooooooooo hai finito i soldi");
			e.printStackTrace();
		}
	}
	
}