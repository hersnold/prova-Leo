
public class PrestacaoDeServicos extends Contratos {
	public PrestacaoDeServicos(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio, String tipoDoContrato) {
		super(numeroRegistro, dataEmissao, tabeliao, nomeCartorio, tipoDoContrato);
		this.setTipoDoContrato("Prestação de serviços");
	}

}
