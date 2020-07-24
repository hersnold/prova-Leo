
public class Trabalho extends Contratos {
	public Trabalho(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio, String tipoDoContrato) {
		super(numeroRegistro, dataEmissao, tabeliao, nomeCartorio, tipoDoContrato);
		this.setTipoDoContrato("Trabalho");
	}
}
