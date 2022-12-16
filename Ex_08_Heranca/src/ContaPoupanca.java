public class ContaPoupanca extends Conta {

	private double taxaRendimento;

	public ContaPoupanca(String titular, double taxaRendimento) {
		super(titular);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public String toString() {
		return super.toString() + "Taxa de Rendimento: " + taxaRendimento;
	}

}
