package sistema.controller;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import sistema.entity.PessoaEntity;
import cicero.ednilson.com.br.ConsultarPessoasResponseType;
import cicero.ednilson.com.br.ExcluirPessoaRequestType;
import cicero.ednilson.com.br.PessoaType;
import cicero.ednilson.com.br.Pessoa_pttProxy;


@ManagedBean
@RequestScoped
public class ConsultarPessoaController {

	/*CLASSE QUE REPRESENTA O NOSSO WEB SERVICE*/
	Pessoa_pttProxy pessoa_pttProxy =  new Pessoa_pttProxy();
	
	private List<PessoaEntity> pessoas;

	@PostConstruct
	public void init(){
		
		carregaPessoasCadastradas();		
	}

	public List<PessoaEntity> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<PessoaEntity> pessoas) {
		this.pessoas = pessoas;
	}
	private void carregaPessoasCadastradas(){
		
		this.pessoas =  new ArrayList<PessoaEntity>();
		
		try {
			
			/*CONSULTAR AS PESSOAS CADASTRAS*/
			ConsultarPessoasResponseType  pessoasType = pessoa_pttProxy.consultarPessoas(null);
			
			for (PessoaType pessoa : pessoasType.getListaPessoas()) 				
				pessoas.add(new PessoaEntity(pessoa.getCodigo(), pessoa.getNome(), pessoa.getTipoPessoa(), pessoa.getDataCadasto()));
			
			
			
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		
	}
	
	public void excluirPessoa(PessoaEntity pessoa) {
		
		ExcluirPessoaRequestType request =  new ExcluirPessoaRequestType();
	
		try {
			
			request.setCodigo(pessoa.getCodigoPessoa());
			
			/*CHAMANDO A OPERAÇÃO EXCLUIR PESSOA*/
			pessoa_pttProxy.excluirPessoa(request);
			
			
			this.carregaPessoasCadastradas();
			
			mensagem("Registro Excluido com sucesso!");
			
		} catch (RemoteException e) {
			
			mensagem("Erro ao tentar excluir a pessoa!");
		}
	}
	
	public void editarPessoa(PessoaEntity pessoa){
		
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		
		try {
		
			externalContext.redirect("editarPessoa.xhtml?codigoPessoa=" + pessoa.getCodigoPessoa().toString());
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}
	public void mensagem(String mensagem) {
		
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
}
