package it.corso.java.classiinnerlocali;

import java.util.List;

import it.corso.java.classiinnerlocali.Appartamento.StanzaInner;

public class Main {

	public static void main(String[] args) {
		Appartamento a = new Appartamento();
		
		a.setPiano(0);
		a.getStanzeSt().add(new StanzaStandard(16, "angolo cottura"));
//		a.getStanzeIn().add(new StanzaInner(16, "angolo cottura"));
		a.aggiungiStanza(30, "angolo cottura");
		
		List<StanzaStandard> ss = a.getStanzeSt();
		for (StanzaStandard stanzaStandard : ss) {
			System.out.println(stanzaStandard.getMq() + " " + stanzaStandard.getAccessori());
		}
		
		List<StanzaInner> si = a.getStanzeIn();
		for (StanzaInner stanzaInner : si) {
			System.out.println(stanzaInner.getMq() + " " + stanzaInner.getAccessori());
		}
	}

}
