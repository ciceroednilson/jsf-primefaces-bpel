package sistema.entity;

import java.math.BigInteger;
import java.util.Calendar;

public class PessoaEntity {

	private BigInteger codigoPessoa;	
    private String 		nome;
    private String 		tipoPessoa;
    private Calendar 	dataCadasto;
    
    public PessoaEntity(){
    	
    }    
	public PessoaEntity(BigInteger codigoPessoa, String nome,String tipoPessoa, Calendar dataCadasto) {
		super();
		this.codigoPessoa = codigoPessoa;
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.dataCadasto = dataCadasto;
	}
	public BigInteger getCodigoPessoa() {
		return codigoPessoa;
	}
	public void setCodigoPessoa(BigInteger codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public Calendar getDataCadasto() {
		return dataCadasto;
	}
	public void setDataCadasto(Calendar dataCadasto) {
		this.dataCadasto = dataCadasto;
	}
    
}
