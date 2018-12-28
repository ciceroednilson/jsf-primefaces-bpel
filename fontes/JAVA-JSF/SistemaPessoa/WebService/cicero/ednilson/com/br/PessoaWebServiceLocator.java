/**
 * PessoaWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cicero.ednilson.com.br;

public class PessoaWebServiceLocator extends org.apache.axis.client.Service implements cicero.ednilson.com.br.PessoaWebService {

    public PessoaWebServiceLocator() {
    }


    public PessoaWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PessoaWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Pessoa_pt
    private java.lang.String Pessoa_pt_address = "http://localhost:9001/soa-infra/services/default/ServicoPessoa/PessoaWebService";

    public java.lang.String getPessoa_ptAddress() {
        return Pessoa_pt_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Pessoa_ptWSDDServiceName = "Pessoa_pt";

    public java.lang.String getPessoa_ptWSDDServiceName() {
        return Pessoa_ptWSDDServiceName;
    }

    public void setPessoa_ptWSDDServiceName(java.lang.String name) {
        Pessoa_ptWSDDServiceName = name;
    }

    public cicero.ednilson.com.br.Pessoa_ptt getPessoa_pt() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Pessoa_pt_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPessoa_pt(endpoint);
    }

    public cicero.ednilson.com.br.Pessoa_ptt getPessoa_pt(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cicero.ednilson.com.br.Pessoa_pttBindingStub _stub = new cicero.ednilson.com.br.Pessoa_pttBindingStub(portAddress, this);
            _stub.setPortName(getPessoa_ptWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPessoa_ptEndpointAddress(java.lang.String address) {
        Pessoa_pt_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cicero.ednilson.com.br.Pessoa_ptt.class.isAssignableFrom(serviceEndpointInterface)) {
                cicero.ednilson.com.br.Pessoa_pttBindingStub _stub = new cicero.ednilson.com.br.Pessoa_pttBindingStub(new java.net.URL(Pessoa_pt_address), this);
                _stub.setPortName(getPessoa_ptWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Pessoa_pt".equals(inputPortName)) {
            return getPessoa_pt();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("br.com.ednilson.cicero", "PessoaWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("br.com.ednilson.cicero", "Pessoa_pt"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Pessoa_pt".equals(portName)) {
            setPessoa_ptEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
