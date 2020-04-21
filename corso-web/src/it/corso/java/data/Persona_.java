package it.corso.java.data;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-04-17T17:18:02.271+0200")
@StaticMetamodel(Persona.class)
public class Persona_ {
	public static volatile SingularAttribute<Persona, Long> id;
	public static volatile SingularAttribute<Persona, String> nome;
	public static volatile SingularAttribute<Persona, String> cognome;
	public static volatile SingularAttribute<Persona, Integer> anni;
}
