package it.esempio.smartphone;

public class Main {

	public static void main(String[] args) {		
		Smartphone iPhone7 = new Smartphone();
		iPhone7.setImei("123456789");
		iPhone7.setMarca("Apple");
		iPhone7.setModello("iPhone 7");
		iPhone7.setDescrizione(iPhone7.getMarca() + " " + iPhone7.getModello() );
		iPhone7.setPrezzo(970.00);
		
		Smartphone Note7 = new Smartphone();
		Note7.setImei("987654321");
		Note7.setMarca("Samsung");
		Note7.setModello("Note 7");
		Note7.setDescrizione(Note7.getMarca() + " " + Note7.getModello() );
		Note7.setPrezzo(800.00);
		
		System.out.println("Marca:___________" + Note7.getMarca() + "\n" +
						   "Modello:_________" + Note7.getModello() + "\n" +
						   "IMEI:____________" + Note7.getImei() + "\n" +
						   "Descrizione:_____" + Note7.getDescrizione() + "\n" +
						   "Prezzo:__________" + Note7.getPrezzo() + "\n\n" +
						   "Marca:___________" + iPhone7.getMarca() + "\n" +
						   "Modello:_________" + iPhone7.getModello() + "\n" +
						   "IMEI:____________" + iPhone7.getImei() + "\n" +
						   "Descrizione:_____" + iPhone7.getDescrizione() + "\n" +
						   "Prezzo:__________" + iPhone7.getPrezzo());
		
		Televisore tv = new Televisore();
		tv.setNome("sfgs");
		tv.setPrezzo(54);
		System.out.println(tv.getNome());
	}

}
 