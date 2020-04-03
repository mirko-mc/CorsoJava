package it.esempio.smartphone;

import java.util.ArrayList;
import java.util.List;

public class Televisore extends Prodotto {
	private String pollici;
	private String accessori;
	public String getPollici() {
		return pollici;
	}
	public void setPollici(String pollici) {
		this.pollici = pollici;
	}
	public String getAccessori() {
		return accessori;
	}
	public void setAccessori(String accessori) {
		this.accessori = accessori;
	}
	
	public void cambiaCanale() {
		/*...*/
	}
	public void accendi() {
		/*...*/
	}
	@Override
	protected void stampa() {
		super.stampa();
	}
	
	@Override
	public List<String> getStores() {
		ArrayList<String> tmp = new ArrayList<String>();
		tmp.add("negozio 5");
		tmp.add("negozio 6");
		return tmp;
	}
	
}
