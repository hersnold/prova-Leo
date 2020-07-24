import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Certidao{
	private Pessoa[] objetoPessoa;
	private Pessoa[] declarantes;
	protected String tipoDaCertidao;
	private int numeroRegistro;
	private String dataEmissao;
	private String nomeTabeliao;
	private String nomeCartorio;
	static int id_certidao = 0;
	
	

	public Certidao(int numeroRegistro, String dataEmissao, String nomeTabeliao, String nomeCartorio) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.dataEmissao = dataEmissao;
		this.nomeTabeliao = nomeTabeliao;
		this.nomeCartorio = nomeCartorio;
		this.id_certidao ++;
	}
	

	public Pessoa[] getPessoaObjetos() {
		return objetoPessoa;
	}
	public void setPessoaObjetos(Pessoa[] pessoaObjetos) {
		this.objetoPessoa = pessoaObjetos;
	}
	public Pessoa[] getDeclarantes() {
		return declarantes;
	}
	public void setDeclarantes(Pessoa[] declarantes) {
				this.declarantes = declarantes;
	}
	
	public int getId() {
		return id_certidao;
	}
	
	public String getTipo() {
		return tipoDaCertidao;
	}
	public Certidao() {
		this.id_certidao++;
	}
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getTabeliao() {
		return nomeTabeliao;
	}
	public void setTabeliao(String nomeTabeliao) {
		this.nomeTabeliao = nomeTabeliao;
	}
	public String getNomeCartorio() {
		return nomeCartorio;
	} 
	public void setNomeCartorio(String nomeCartorio) {
		this.nomeCartorio = nomeCartorio;
	}
	
}


