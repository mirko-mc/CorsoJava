package it.corso.java.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server {
    private ServerSocket sSocket;
 
    /* creiamo l'istanza della classe ServerSocket, mettendola in ascolto sulla porta passata in input */
    public Server (int port) {
        try {
            sSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Errore durante la creazione del server: " + e.getMessage());
        }
        System.out.println("Server creato");
    }
 
    /* ci mettiamo in attesa di una richiesta dal client, attraverso l'istruzione Socket s1 = sSocket.accept(); */
    public void runServer() {
        while (true) {
            try {
                System.out.println("Server in attesa di chiamate da qualche client...");
 
                Socket s1 = sSocket.accept();
 
                System.out.println("Il client " + s1.getRemoteSocketAddress().toString() + " si è connesso.");
 
                /* Quando riceviamo una richiesta, prendiamo l'OutputStream dall'istanza della classe Socket ricevuta
                 * e lo utilizziamo per scrivere il messaggio da inviare al client */
                OutputStream s1out = s1.getOutputStream();
 
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));
                bw.write("Ciao! Io sono il server " + sSocket.getLocalSocketAddress().toString()); 
 
                bw.close();
                /* chiudiamo la connessione con il client */
                s1.close();
 
                System.out.println("Connessione con il client " + s1.getRemoteSocketAddress().toString() + " chiusa.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
 
    public static void main (String args[]) {
    	/* Se tutto è stato effettuato correttamente e la porta 8081 è libera, il server verrà avviato
    	 * e sarà in ascolto su questa porta */
        Server s = new Server(8081);  
        s.runServer();
    }
}