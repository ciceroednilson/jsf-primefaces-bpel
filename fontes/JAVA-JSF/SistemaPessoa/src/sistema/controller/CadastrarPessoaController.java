package sistema.controller;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import cicero.ednilson.com.br.CadastrarPessoaRequestType;
import cicero.ednilson.com.br.CadastrarPessoaResponseType;
import cicero.ednilson.com.br.Pessoa_pttProxy;
import sistema.entity.PessoaEntity;

@ManagedBean
public class CadastrarPessoaController {
	
	/*CLASSE QUE REPRESENTA O NOSSO WEB SERVICE*/
	Pessoa_pttProxy pessoa_pttProxy =  new Pessoa_pttProxy();
	
	private PessoaEntity pessoaEntity = new PessoaEntity();
	
	
	public PessoaEntity getPessoaEntity() {
		return pessoaEntity;
	}

	public void setPessoaEntity(PessoaEntity pessoaEntity) {
		this.pessoaEntity = pessoaEntity;
	}

	public void salvarPessoa(ActionEvent actionEvent) {
	     
		 
		 CadastrarPessoaRequestType cadastrarPessoaRequestType =  new CadastrarPessoaRequestType();
		 
		 try {
			 
			 /*SETA OS VALORES DO FORMULÁRIO NAS CLASSES DO SERVIÇO*/
			 cadastrarPessoaRequestType.setDataCadasto(Calendar.getInstance());
			 cadastrarPessoaRequestType.setNome(pessoaEntity.getNome());
			 cadastrarPessoaRequestType.setTipoPessoa(pessoaEntity.getTipoPessoa());
			 
			 /*CHAMANDO A OPERAÇÃO PARA CADASTRAR A PESSOA*/
			 CadastrarPessoaResponseType cadastrarPessoaResponseType = pessoa_pttProxy.cadastrarPessoa(cadastrarPessoaRequestType);
			 
			 this.mensagem(cadastrarPessoaResponseType.getMensagemRetorno());
			 
			 /*LIMPA OS CAMPOS APÓS SALVAR O REGISTRO*/
			 pessoaEntity =  new PessoaEntity();
			 
		} catch (RemoteException e) {
			
			mensagem("Erro ao tentar chamar o serviço!");
		}
		 		 
	 }
	 
	 public void mensagem(String mensagem) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	 }
	 
}
