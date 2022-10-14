package entidades;

public class Conta {
	public String titular;
	private double saldo;
	protected int tipo;

	public boolean depositar(double valor) {
		boolean sucesso = false;

		if (valor > 0) {
			saldo += valor;
			sucesso = true;
		}

		return sucesso;
	}

	public double consultarSaldo() {
		return saldo;
	}

	public int lerTipo() {
		return tipo;
	}

	public void alterarTipo(int novoTipo) {
		tipo = novoTipo;
	}
}
