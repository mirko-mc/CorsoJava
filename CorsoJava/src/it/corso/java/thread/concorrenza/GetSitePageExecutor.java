package it.corso.java.thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

import it.corso.java.wrapper.Utils;

public class GetSitePageExecutor implements Callable<String> {
	private String url;
	
	public GetSitePageExecutor(String url) {
		super();
		this.url = url;
	}



	@Override
	public String call() throws Exception {
		try {
			/* passiamo l'url */
			URL u = new URL(url);
			/* creazione connessione */
			URLConnection con = u.openConnection();
			/* recuperiamo l'output della pagina */
			InputStream is = con.getInputStream();
			/* prendere inputstream e scriverlo all'interno del nostro file */
			return Utils.getString(is);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}

}
