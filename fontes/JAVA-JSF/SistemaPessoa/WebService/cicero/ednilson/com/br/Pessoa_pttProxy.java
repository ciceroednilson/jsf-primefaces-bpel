package cicero.ednilson.com.br;

public class Pessoa_pttProxy implements cicero.ednilson.com.br.Pessoa_ptt {
  private String _endpoint = null;
  private cicero.ednilson.com.br.Pessoa_ptt pessoa_ptt = null;
  
  public Pessoa_pttProxy() {
    _initPessoa_pttProxy();
  }
  
  public Pessoa_pttProxy(String endpoint) {
    _endpoint = endpoint;
    _initPessoa_pttProxy();
  }
  
  private void _initPessoa_pttProxy() {
    try {
      pessoa_ptt = (new cicero.ednilson.com.br.PessoaWebServiceLocator()).getPessoa_pt();
      if (pessoa_ptt != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pessoa_ptt)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pessoa_ptt)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pessoa_ptt != null)
      ((javax.xml.rpc.Stub)pessoa_ptt)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cicero.ednilson.com.br.Pessoa_ptt getPessoa_ptt() {
    if (pessoa_ptt == null)
      _initPessoa_pttProxy();
    return pessoa_ptt;
  }
  
  public cicero.ednilson.com.br.CadastrarPessoaResponseType cadastrarPessoa(cicero.ednilson.com.br.CadastrarPessoaRequestType parameters) throws java.rmi.RemoteException{
    if (pessoa_ptt == null)
      _initPessoa_pttProxy();
    return pessoa_ptt.cadastrarPessoa(parameters);
  }
  
  public cicero.ednilson.com.br.AlterarPessoaResponseType alterarPessoa(cicero.ednilson.com.br.AlterarPessoaRequestType parameters) throws java.rmi.RemoteException{
    if (pessoa_ptt == null)
      _initPessoa_pttProxy();
    return pessoa_ptt.alterarPessoa(parameters);
  }
  
  public cicero.ednilson.com.br.ExcluirPessoaResponseType excluirPessoa(cicero.ednilson.com.br.ExcluirPessoaRequestType parameters) throws java.rmi.RemoteException{
    if (pessoa_ptt == null)
      _initPessoa_pttProxy();
    return pessoa_ptt.excluirPessoa(parameters);
  }
  
  public cicero.ednilson.com.br.ConsultarPessoasResponseType consultarPessoas(java.lang.String parameters) throws java.rmi.RemoteException{
    if (pessoa_ptt == null)
      _initPessoa_pttProxy();
    return pessoa_ptt.consultarPessoas(parameters);
  }
  
  public cicero.ednilson.com.br.BuscarPessoaPorCodigoResponseType buscarPessoaPorCodigo(cicero.ednilson.com.br.BuscarPessoaPorCodigoRequestType parameters) throws java.rmi.RemoteException{
    if (pessoa_ptt == null)
      _initPessoa_pttProxy();
    return pessoa_ptt.buscarPessoaPorCodigo(parameters);
  }
  
  
}