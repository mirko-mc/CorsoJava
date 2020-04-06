package it.corso.java.web.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class AttributoSessionListener
 *
 */
@WebListener
public class AttributoSessionListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public AttributoSessionListener() {
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
    	System.out.println(se.getName() + " aggiunto nella request");
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  {
    	System.out.println(se.getName() + " rimosso nella request");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  {
    	System.out.println(se.getName() + " modificato nella request");
    }
	
}
