package it.esempio.gestionale;

public class Smartphone extends ProdottoElettronico {
	private String display;
	private String cpu;
	private String ram;
	
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	@Override
	public void stampaProdotto() {
		System.out.println(getId() + " " + getModello() + " " + getMarca() + " " + getCpu());
	}
}
