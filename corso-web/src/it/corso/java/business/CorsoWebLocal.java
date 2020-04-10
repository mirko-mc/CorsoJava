package it.corso.java.business;

import javax.ejb.Local;

@Local
public interface CorsoWebLocal extends CorsoWeb {
	/* qui metteremo tutti i metodi che vogliamo siano esposti solo LOCAL */
	public void salvaFattura();
}
