package it.corso.java.thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import it.corso.java.wrapper.Utils;

public class GetSitePage extends Thread {
	private String url;
	private String content;
	
	/* generazione costruttore */
	public GetSitePage(String url) {
		super();
		this.url = url;
	}

	@Override
	public void run() {
		try {
			/* passiamo l'url */
			URL u = new URL(url);
			/* creazione connessione */
			URLConnection con = u.openConnection();
			/* recuperiamo l'output della pagina */
			InputStream is = con.getInputStream();
			/* prendere inputstream e scriverlo all'interno del nostro file */
			setContent(Utils.getString(is));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}