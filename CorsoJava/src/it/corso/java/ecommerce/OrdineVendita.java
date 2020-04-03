package it.corso.java.ecommerce;

import java.util.List;
/*	ordine di vendita: rappresenta un ordine effettuato da un cliente.
 * 	Ad ogni ordine è necessario associare un indirizzo di spedizione ed uno di fatturazione.
	Un ordine di vendita deve avere uno stato, a scelta tra:
	- "CREATO",
	- "PAGATO",
	- "SPEDITO",
	- "CONSEGNATO".
Un ordine di vendita deve avere una modalità di pagamento a scelta tra:
	- Bonifico Bancario,
	- Carta di credito,
	- Paypal.
	Il sistema deve prevedere la possibilità di aggiungere nuove modalità di pagamento.
 * */
public class OrdineVendita {
	private long idOdv;
	private String dataOrdine;
	private String indSped;
	private String indFatt;
	private List<OrdineVenditaRiga> rigaOdv;
	private String cliente;
	private Articolo articolo;
	
	private String statoOrdine;
	public static final String stato_ordine_creato = "CREATO";
	public static final String stato_ordine_pagato = "PAGATO";
	public static final String stato_ordine_spedito = "SPEDITO";
	public static final String stato_ordine_consegnato = "CONSEGNATO";
	private String metodoPagamento;
	private static final String pagamento_Bonifico_Bancario = "Bonifico Bancario";
	private static final String pagamento_Carta_di_Credito = "Carta di Credito";
	private static final String pagamento_PayPal = "PayPal";
	
	public void aggiungiOrdineVendita(long idOdv, String dataOrdine, String indSped, String indFatt, String cliente,
			String statoOrdine, String metodoPagamento) {
		this.idOdv = idOdv;
		this.dataOrdine = dataOrdine;
		this.indSped = indSped;
		this.indFatt = indFatt;
		this.cliente = cliente;
		this.statoOrdine = statoOrdine;
		this.metodoPagamento = metodoPagamento;
	}
	
	/* GETTER SETTER */
	public long getIdOdv() {
		return idOdv;
	}
	public void setIdOdv(long idOdv) {
		this.idOdv = idOdv;
	}
	public String getDataOrdine() {
		return dataOrdine;
	}
	public void setDataOrdine(String dataOrdine) {
		this.dataOrdine = dataOrdine;
	}
	public String getIndSped() {
		return indSped;
	}
	public void setIndSped(String indSped) {
		this.indSped = indSped;
	}
	public String getIndFatt() {
		return indFatt;
	}
	public void setIndFatt(String indFatt) {
		this.indFatt = indFatt;
	}
	public Articolo getArticolo() {
		return articolo;
	}
	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}
	public String getStatoOrdine() {
		return statoOrdine;
	}
	public void setStatoOrdine(String statoOrdine) {
		this.statoOrdine = statoOrdine;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public static String getStatoOrdineCreato() {
		return stato_ordine_creato;
	}
	public static String getStatoOrdinePagato() {
		return stato_ordine_pagato;
	}
	public static String getStatoOrdineSpedito() {
		return stato_ordine_spedito;
	}
	public static String getStatoOrdineConsegnato() {
		return stato_ordine_consegnato;
	}
	public static String getPagamentoBonificoBancario() {
		return pagamento_Bonifico_Bancario;
	}
	public static String getPagamentoCartaDiCredito() {
		return pagamento_Carta_di_Credito;
	}
	public static String getPagamentoPaypal() {
		return pagamento_PayPal;
	}
	public List<OrdineVenditaRiga> getRigaOdv() {
		return rigaOdv;
	}
	public void setRigaOdv(List<OrdineVenditaRiga> rigaOdv) {
		this.rigaOdv = rigaOdv;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}