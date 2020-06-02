package it.corso.java.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class Client {
    public static void main(String args[]) {
        try {
        	/* Cerchiamo di stabilire una connessione con il server creando un oggetto di tipo Socket */
            Socket s1 = new Socket("127.0.0.1", 8081);
            /* Se non riceviamo errori di connessione recuperiamo il messaggio inviato dal server e lo stampiamo */
            InputStream is = s1.getInputStream();
            
            BufferedReader dis = null;
            StringBuilder sb = new StringBuilder();
            String line;
 
            try {
                dis = new BufferedReader(new InputStreamReader(is));
                while ((line = dis.readLine()) != null) {
                    sb.append(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (dis != null) {
                    try {
                        dis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
 
            System.out.println(sb.toString());            
 
            dis.close();
            /* chiudiamo la connessione con il server */
            s1.close();
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}