package it.corso.java.business;

import javax.ejb.Local;

/**
 * Session Bean implementation class CorsoWebStatefulBean
 */
@Local
public interface CorsoWebStatefulLocal {
    public void incrementa(int c);
    public int getContatore();
    public void chiudiConnessione();
}