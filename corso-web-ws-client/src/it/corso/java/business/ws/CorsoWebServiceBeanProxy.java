package it.corso.java.business.ws;

public class CorsoWebServiceBeanProxy implements it.corso.java.business.ws.CorsoWebServiceBean {
  private String _endpoint = null;
  private it.corso.java.business.ws.CorsoWebServiceBean corsoWebServiceBean = null;
  
  public CorsoWebServiceBeanProxy() {
    _initCorsoWebServiceBeanProxy();
  }
  
  public CorsoWebServiceBeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initCorsoWebServiceBeanProxy();
  }
  
  private void _initCorsoWebServiceBeanProxy() {
    try {
      corsoWebServiceBean = (new it.corso.java.business.ws.CorsowebLocator()).getCorsoWebServiceBeanPort();
      if (corsoWebServiceBean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)corsoWebServiceBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)corsoWebServiceBean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (corsoWebServiceBean != null)
      ((javax.xml.rpc.Stub)corsoWebServiceBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.corso.java.business.ws.CorsoWebServiceBean getCorsoWebServiceBean() {
    if (corsoWebServiceBean == null)
      _initCorsoWebServiceBeanProxy();
    return corsoWebServiceBean;
  }
  
  public java.lang.String salutami(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (corsoWebServiceBean == null)
      _initCorsoWebServiceBeanProxy();
    return corsoWebServiceBean.salutami(arg0, arg1);
  }
  
  
}