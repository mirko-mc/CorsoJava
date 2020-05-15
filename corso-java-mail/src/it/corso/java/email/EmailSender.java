package it.corso.java.email;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
/* per la password bisogna creare un app password su dalle impostazioni sicurezza del proprio account google */
public class EmailSender {
 private String from = "test@gmail.com";
 private String username = "rako8088@gmail.com";
 private String password = "gvgrbedauyabqstk";
 
 public static void main(String[] args) throws AddressException, MessagingException {
   EmailSender es = new EmailSender();
   es.sendEmail(
     "rako8088@gmail.com",
     "Email di prova",
     "Eccomi!!!!!!!!!!!!!!! \n\n\nHo inviato l'email!");
 }
 
 public void sendEmail(String to, String subject, String text) throws AddressException, MessagingException {
   /***** creiamo un oggetto di tipo Properties che conterrà i parametri di configurazione per la connessione al mail server *****/
   Properties props = new Properties();
   props.put("mail.smtp.auth", "true");
   props.put("mail.smtp.starttls.enable", "true");
   props.put("mail.smtp.host", "smtp.gmail.com");
   props.put("mail.smtp.port", "587");
 
  /******* Creiamo una connessione al mail server ********/
  Session session = Session.getInstance(
     props,
     new javax.mail.Authenticator() {
       protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication(username, password);
       }
    });
 
  /****** creiamo il messaggio impostando, destinatari, oggetto e contenuto del messaggio ******/
  Message message = new MimeMessage(session);
  message.setFrom(new InternetAddress(from));
  message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
  message.setSubject(subject);
  message.setText(text);
 
  /***** INVIAMO L'EMAIL! ******/
  Transport.send(message);
 }
}