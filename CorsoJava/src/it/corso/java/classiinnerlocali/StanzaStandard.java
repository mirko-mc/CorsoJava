package it.corso.java.classiinnerlocali;

public class StanzaStandard {
	private double mq;
	private String accessori;
	
	public StanzaStandard(double mq, String accessori) {
		super();
		this.mq = mq;
		this.accessori = accessori;
	}
	public double getMq() {
		return mq;
	}
	public void setMq(double mq) {
		this.mq = mq;
	}
	public String getAccessori() {
		return accessori;
	}
	public void setAccessori(String accessori) {
		this.accessori = accessori;
	}
	
}
