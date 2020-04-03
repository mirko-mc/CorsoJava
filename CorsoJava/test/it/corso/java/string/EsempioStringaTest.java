package it.corso.java.string;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class EsempioStringaTest {

	@Test
	void testIsPalindroma() {
		EsempioStringa es = new EsempioStringa();
		
			assertTrue("La variabile è TRUE", es.isPalindroma("osso"));
			assertFalse("La variabile è FALSE", es.isPalindroma("maria"));
	}

	@Test
	void testContaOccorrenze() {
		EsempioStringa es = new EsempioStringa();
		
		String testo = "Oggi è una giornata di sole";
		
		int occ = 3;
		/* se questo test fallisce... */
		assertEquals("il numero di occorrenze è diverso da quello atteso", occ, es.contaOccorrenze(testo, "g"));
		/* ...questo test non viene nemmeno eseguito */
		assertNotNull(testo);
	}

}
