public class ContaCorrente extends Conta {

	private double taxaManutencao;

	public ContaCorrente(String titular, double taxaManutencao) {
		super(titular);
		this.taxaManutencao = taxaManutencao;
	}

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public String toString() {
		return super.toString() + "Taxa de Manutenção: " + taxaManutencao;
	}

}
