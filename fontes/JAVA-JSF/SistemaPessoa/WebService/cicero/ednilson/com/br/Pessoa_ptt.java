/**
 * Pessoa_ptt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cicero.ednilson.com.br;

public interface Pessoa_ptt extends java.rmi.Remote {
    public cicero.ednilson.com.br.CadastrarPessoaResponseType cadastrarPessoa(cicero.ednilson.com.br.CadastrarPessoaRequestType parameters) throws java.rmi.RemoteException;
    public cicero.ednilson.com.br.AlterarPessoaResponseType alterarPessoa(cicero.ednilson.com.br.AlterarPessoaRequestType parameters) throws java.rmi.RemoteException;
    public cicero.ednilson.com.br.ExcluirPessoaResponseType excluirPessoa(cicero.ednilson.com.br.ExcluirPessoaRequestType parameters) throws java.rmi.RemoteException;
    public cicero.ednilson.com.br.ConsultarPessoasResponseType consultarPessoas(java.lang.String parameters) throws java.rmi.RemoteException;
    public cicero.ednilson.com.br.BuscarPessoaPorCodigoResponseType buscarPessoaPorCodigo(cicero.ednilson.com.br.BuscarPessoaPorCodigoRequestType parameters) throws java.rmi.RemoteException;
}
