/**
 * Pessoa_pttBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cicero.ednilson.com.br;

public class Pessoa_pttBindingStub extends org.apache.axis.client.Stub implements cicero.ednilson.com.br.Pessoa_ptt {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CadastrarPessoa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("br.com.ednilson.cicero", "CadastrarPessoaRequestType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("br.com.ednilson.cicero", ">CadastrarPessoaRequestType"), cicero.ednilson.com.br.CadastrarPessoaRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("br.com.ednilson.cicero", ">CadastrarPessoaResponseType"));
        oper.setReturnClass(cicero.ednilson.com.br.CadastrarPessoaResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "CadastrarPessoaResponseType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AlterarPessoa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("br.com.ednilson.cicero", "AlterarPessoaRequestType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("br.com.ednilson.cicero", ">AlterarPessoaRequestType"), cicero.ednilson.com.br.AlterarPessoaRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("br.com.ednilson.cicero", ">AlterarPessoaResponseType"));
        oper.setReturnClass(cicero.ednilson.com.br.AlterarPessoaResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "AlterarPessoaResponseType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExcluirPessoa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("br.com.ednilson.cicero", "ExcluirPessoaRequestType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("br.com.ednilson.cicero", ">ExcluirPessoaRequestType"), cicero.ednilson.com.br.ExcluirPessoaRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("br.com.ednilson.cicero", ">ExcluirPessoaResponseType"));
        oper.setReturnClass(cicero.ednilson.com.br.ExcluirPessoaResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "ExcluirPessoaResponseType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConsultarPessoas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("br.com.ednilson.cicero", "ConsultarPessoasRequestType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("br.com.ednilson.cicero", ">ConsultarPessoasResponseType"));
        oper.setReturnClass(cicero.ednilson.com.br.ConsultarPessoasResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "ConsultarPessoasResponseType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BuscarPessoaPorCodigo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("br.com.ednilson.cicero", "BuscarPessoaPorCodigoRequestType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("br.com.ednilson.cicero", ">BuscarPessoaPorCodigoRequestType"), cicero.ednilson.com.br.BuscarPessoaPorCodigoRequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("br.com.ednilson.cicero", ">BuscarPessoaPorCodigoResponseType"));
        oper.setReturnClass(cicero.ednilson.com.br.BuscarPessoaPorCodigoResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("br.com.ednilson.cicero", "BuscarPessoaPorCodigoResponseType"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public Pessoa_pttBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Pessoa_pttBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Pessoa_pttBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">>ConsultarPessoasResponseType>ListaPessoas");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.PessoaType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", "pessoaType");
            qName2 = new javax.xml.namespace.QName("br.com.ednilson.cicero", "ItemPessoa");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">AlterarPessoaRequestType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.AlterarPessoaRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">AlterarPessoaResponseType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.AlterarPessoaResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">BuscarPessoaPorCodigoRequestType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.BuscarPessoaPorCodigoRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">BuscarPessoaPorCodigoResponseType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.BuscarPessoaPorCodigoResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">CadastrarPessoaRequestType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.CadastrarPessoaRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">CadastrarPessoaResponseType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.CadastrarPessoaResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">ConsultarPessoasResponseType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.ConsultarPessoasResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">ExcluirPessoaRequestType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.ExcluirPessoaRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", ">ExcluirPessoaResponseType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.ExcluirPessoaResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("br.com.ednilson.cicero", "pessoaType");
            cachedSerQNames.add(qName);
            cls = cicero.ednilson.com.br.PessoaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public cicero.ednilson.com.br.CadastrarPessoaResponseType cadastrarPessoa(cicero.ednilson.com.br.CadastrarPessoaRequestType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CadastrarPessoa");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CadastrarPessoa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cicero.ednilson.com.br.CadastrarPessoaResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (cicero.ednilson.com.br.CadastrarPessoaResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, cicero.ednilson.com.br.CadastrarPessoaResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cicero.ednilson.com.br.AlterarPessoaResponseType alterarPessoa(cicero.ednilson.com.br.AlterarPessoaRequestType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("AlterarPessoa");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AlterarPessoa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cicero.ednilson.com.br.AlterarPessoaResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (cicero.ednilson.com.br.AlterarPessoaResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, cicero.ednilson.com.br.AlterarPessoaResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cicero.ednilson.com.br.ExcluirPessoaResponseType excluirPessoa(cicero.ednilson.com.br.ExcluirPessoaRequestType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ExcluirPessoa");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExcluirPessoa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cicero.ednilson.com.br.ExcluirPessoaResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (cicero.ednilson.com.br.ExcluirPessoaResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, cicero.ednilson.com.br.ExcluirPessoaResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cicero.ednilson.com.br.ConsultarPessoasResponseType consultarPessoas(java.lang.String parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ConsultarPessoas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ConsultarPessoas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cicero.ednilson.com.br.ConsultarPessoasResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (cicero.ednilson.com.br.ConsultarPessoasResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, cicero.ednilson.com.br.ConsultarPessoasResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cicero.ednilson.com.br.BuscarPessoaPorCodigoResponseType buscarPessoaPorCodigo(cicero.ednilson.com.br.BuscarPessoaPorCodigoRequestType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("BuscarPessoaPorCodigo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BuscarPessoaPorCodigo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cicero.ednilson.com.br.BuscarPessoaPorCodigoResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (cicero.ednilson.com.br.BuscarPessoaPorCodigoResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, cicero.ednilson.com.br.BuscarPessoaPorCodigoResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
