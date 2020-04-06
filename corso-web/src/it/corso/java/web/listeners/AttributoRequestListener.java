package it.corso.java.web.listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AttributoRequestListener
 *
 */
@WebListener
public class AttributoRequestListener implements ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public AttributoRequestListener() {
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  {
    	System.out.println(srae.getName() + " rimosso dalla request");
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  {
    	System.out.println(srae.getName() + " aggiunto alla request");
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  {
    	System.out.println(srae.getName() + " modificato nella request");
    }
	
}
