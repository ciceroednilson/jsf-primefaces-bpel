package sistema.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import sistema.entity.PessoaEntity;
import cicero.ednilson.com.br.AlterarPessoaRequestType;
import cicero.ednilson.com.br.AlterarPessoaResponseType;
import cicero.ednilson.com.br.BuscarPessoaPorCodigoRequestType;
import cicero.ednilson.com.br.BuscarPessoaPorCodigoResponseType;
import cicero.ednilson.com.br.Pessoa_pttProxy;

@ManagedBean
@ViewScoped
public class EditarPessoaController {

	private PessoaEntity pessoaEntity = new PessoaEntity();
	
	/*CLASSE QUE REPRESENTA O NOSSO WEB SERVICE*/
	Pessoa_pttProxy pessoa_pttProxy =  new Pessoa_pttProxy();
	
	public PessoaEntity getPessoaEntity() {
		return pessoaEntity;
	}

	public void setPessoaEntity(PessoaEntity pessoaEntity) {
		this.pessoaEntity = pessoaEntity;
	}


	public void init(){
	
	
		int codigoPessoa = queryStringIdPessoa();
	
		BuscarPessoaPorCodigoRequestType buscarPessoaPorCodigoRequestType =  new BuscarPessoaPorCodigoRequestType();
		
		buscarPessoaPorCodigoRequestType.setCodigo(BigInteger.valueOf(codigoPessoa));
		
		try {
			
			BuscarPessoaPorCodigoResponseType buscarPessoaPorCodigoResponseType = pessoa_pttProxy.buscarPessoaPorCodigo(buscarPessoaPorCodigoRequestType);
			
			pessoaEntity.setCodigoPessoa(buscarPessoaPorCodigoResponseType.getCodigo());
			pessoaEntity.setNome(buscarPessoaPorCodigoResponseType.getNome());
			pessoaEntity.setTipoPessoa(buscarPessoaPorCodigoResponseType.getTipoPessoa());
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void salvarAlteracao(ActionEvent actionEvent){
		
		AlterarPessoaRequestType alterarPessoaRequestType =  new AlterarPessoaRequestType();
		
		try {
			
			alterarPessoaRequestType.setCodigoPessoa(pessoaEntity.getCodigoPessoa());
			alterarPessoaRequestType.setNomePessoa(pessoaEntity.getNome());
			alterarPessoaRequestType.setTipoPessoa(pessoaEntity.getTipoPessoa());
			
			/*CHAMA A OPERAÇÃO PARA ALTERAR A PESSOA*/
			AlterarPessoaResponseType alterarPessoaResponseType = pessoa_pttProxy.alterarPessoa(alterarPessoaRequestType);
			
			
			
			redirecionaConsulta(alterarPessoaResponseType.getMensagemRetorno());
			
		} catch (RemoteException e) {
			
			mensagem("Erro ao tentar alterar o registro " + e.getMessage());
		}
	}
	
	public int queryStringIdPessoa(){
		
		Map<String, String> params =FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
					
		return Integer.parseInt(params.get("codigoPessoa"));
	}
	 public void mensagem(String mensagem) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	 }
	 
	 public void redirecionaConsulta(String mensagemAlteracao){
		 
		 
			FacesContext facesContext = FacesContext.getCurrentInstance();
			ExternalContext externalContext = facesContext.getExternalContext();
			
			try {
			
				externalContext.redirect("consultarPessoa.xhtml?mensagemAlteracao=" + mensagemAlteracao);
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
	 }
	 
	 
}
