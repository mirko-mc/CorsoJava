package it.esempio.smartphone;

import java.util.ArrayList;
import java.util.List;

public class Smartphone extends Prodotto {
	private String serialNumber;
	private String imei;
	private String marca;
	private String modello;
	private Display schermo;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public Display getSchermo() {
		return schermo;
	}
	public void setSchermo(Display schermo) {
		this.schermo = schermo;
	}
	
	@Override
	public List<String> getStores() {
		ArrayList<String> tmp = new ArrayList<String>();
		tmp.add("negozio 4");
		tmp.add("negozio 5");
		return tmp;
	}
}
