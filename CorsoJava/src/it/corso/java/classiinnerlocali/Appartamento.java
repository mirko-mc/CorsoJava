package it.corso.java.classiinnerlocali;

import java.util.ArrayList;
import java.util.List;

public class Appartamento {
	private int piano;
	private List<StanzaStandard> stanzeSt;
	private List<StanzaInner> stanzeIn;
	
	public void aggiungiStanza(double mq, String accessori) {
		class CalcolaPerimetro {
			public double calcola(double lato1, double lato2) {
				return lato1 + lato2;
			}
		}
		
		/* CLASSE LOCALE
		 * trova esistenza all'interno di un metodo ed è disponibile solo all'interno di esso */
		CalcolaPerimetro cp = new CalcolaPerimetro();
		System.out.println("perimetro stanza " + cp.calcola(3, 6)*2);
		getStanzeIn().add(new StanzaInner(mq, accessori));
	}
	
	/* CLASSE INNER
	 * all'esterno è disponibile in lettura ma non in scrittura.
	 * per utilizzarla in scrittura bisogna farlo attraverso un metodo come aggiungiStanza
	 *  */
	class StanzaInner {
		private double mq;
		private String accessori;
		
		public StanzaInner(double mq, String accessori) {
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
	public int getPiano() {
		return piano;
	}
	public void setPiano(int piano) {
		this.piano = piano;
	}
	public List<StanzaStandard> getStanzeSt() {
		if (stanzeSt == null) {
			stanzeSt = new ArrayList<StanzaStandard>();
		}
		return stanzeSt;
	}
	public void setStanzeSt(List<StanzaStandard> stanzeSt) {
		this.stanzeSt = stanzeSt;
	}
	public List<StanzaInner> getStanzeIn() {
		if (stanzeIn == null) {
			stanzeIn = new ArrayList<StanzaInner>();
		}

		return stanzeIn;
	}
	public void setStanzeIn(List<StanzaInner> stanzeIn) {
		this.stanzeIn = stanzeIn;
	}
}
