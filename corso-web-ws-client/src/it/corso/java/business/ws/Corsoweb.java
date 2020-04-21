/**
 * Corsoweb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.corso.java.business.ws;

public interface Corsoweb extends javax.xml.rpc.Service {
    public java.lang.String getCorsoWebServiceBeanPortAddress();

    public it.corso.java.business.ws.CorsoWebServiceBean getCorsoWebServiceBeanPort() throws javax.xml.rpc.ServiceException;

    public it.corso.java.business.ws.CorsoWebServiceBean getCorsoWebServiceBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
