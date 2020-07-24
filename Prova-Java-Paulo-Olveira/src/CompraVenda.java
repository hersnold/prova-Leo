
public class CompraVenda extends Contratos {
	public CompraVenda(int numeroRegistro, String dataEmissao, String tabeliao, String nomeCartorio, String tipoDoContrato) {
		super(numeroRegistro, dataEmissao, tabeliao, nomeCartorio, tipoDoContrato);
		this.setTipoDoContrato("Compra e venda");
	}
}
