import java.sql.Array;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Contratos{
	private Pessoa[] testemunhas;
	private String tipoDoContrato;
	private String dataRegistro;
	private int numeroRegistro;
	private String dataEmissao;
	private String nomeDoTabeliao;
	private String nomeCartorio;
	static int id_contrato = 0;
	
	public Contratos(int numeroRegistro, String dataEmissao, String nomeDoTabeliao, String nomeCartorio, String tipoDoContrato) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.dataEmissao = dataEmissao;
		this.nomeDoTabeliao = nomeDoTabeliao;
		this.nomeCartorio = nomeCartorio;
		this.setTipoDoContrato(tipoDoContrato);
		this.id_contrato ++;
	}
	

	
	public Pessoa[] getTestemunhas() {
		return testemunhas;
	}
	public void setTestemunhas(Pessoa[] testemunhas) {
		this.testemunhas = testemunhas;
	}
	public String getObjetoContrato() {
		return getTipoDoContrato();
	}
	public void setObjetoContrato(String tipoDoContrato) {
		this.setTipoDoContrato(tipoDoContrato);
	}
	public String getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public int getContador() {
		return id_contrato;
	}



	public String getTipoDoContrato() {
		return tipoDoContrato;
	}



	public void setTipoDoContrato(String tipoDoContrato) {
		this.tipoDoContrato = tipoDoContrato;
	}
	

}
