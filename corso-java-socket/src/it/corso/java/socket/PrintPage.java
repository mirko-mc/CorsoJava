package it.corso.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class PrintPage {
	public static void main(String[] args) {
		printWebPage();
	}
	private static void printWebPage() {
		try {
			/* Creo un'istanza della URL da invocare */
			URL url = new URL("https://intel.ingress.com/intel?state=GOOGLE&code=4%2FzwFSxZ2TMmm9xRDHVYP1phEdV8ImG3WiuPGzRgNzlFMPVtwQd7xPyAlv81ZMYS1HOqpYsd7eHw2L_gFzBSm18jQ&scope=email+profile+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.profile+openid&authuser=0&prompt=consent");

			/* Creo un'istanza della classe URLConnection */
			URLConnection con = url.openConnection();

			/* Recupero il contenuto della pagina */
			InputStream is = con.getInputStream();

			BufferedReader br = null;
			StringBuilder sb = new StringBuilder();
			String line;

			try {
				/* Creo un'istanza della classe BuffererReader per leggere il contenuto della pagina */
				br = new BufferedReader(new InputStreamReader(is));
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println(sb.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}