package it.corso.java.business;

import javax.ejb.Remote;

@Remote
public interface CorsoWebRemote extends CorsoWeb {
	/* qui metteremo tutti i metodi che vogliamo siano esposti solo REMOTE */
	public void collegati();
}
