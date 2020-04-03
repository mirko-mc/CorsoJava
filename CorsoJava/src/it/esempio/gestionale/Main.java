package it.esempio.gestionale;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		OrdineDiVendita odv = new OrdineDiVendita();
		odv.setCliente(new Cliente());
		odv.setDataOrdine(new Date());
		odv.setStatoOrdine(OrdineDiVendita.STATO_SPEDITO);
		odv.setRigheOrdine(new ArrayList<RigaOrdine>());
		
		odv.getCliente().setCodicefiscale("sedici_cifre");
		odv.getCliente().setCognome("Genovesi");
		odv.getCliente().setNome("Antonio");
		
		Smartphone sm1 = new Smartphone();
		sm1.setMarca("Apple");
		sm1.setModello("iPhone");
		sm1.setPrezzo(800);

		Televisore tv1 = new Televisore();
		tv1.setMarca("Samsung");
		tv1.setModello("SMART TV");
		tv1.setPrezzo(1000);
		
		RigaOrdine rg1 = new RigaOrdine(1, sm1, 1, sm1.getPrezzo());
		RigaOrdine rg2 = new RigaOrdine(2, tv1, 1, tv1.getPrezzo());
		
		
		odv.getRigheOrdine().add(rg1);
		odv.getRigheOrdine().add(rg2);
		
		System.out.println("ORDINE DI VENDITA\n" + odv);
		System.out.println("PRODOTTI\n" + odv.getRigheOrdine());
	}
}