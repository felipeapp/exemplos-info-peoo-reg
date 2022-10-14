public class Conta {

	private String titular;
	private double saldo;
	private int tipo;

	public Conta() {
		System.out.println("Dentro do construtor padrão!");
		titular = "Anônimo";
		saldo = 0;
		tipo = 1;
	}

	public Conta(String titular, int tipo) {
		System.out.println("Dentro do construtor com parâmetros!");
		this.titular = titular;
		this.tipo = tipo;
		this.saldo = 0;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean depositar(double valor) {
		boolean sucesso = false;

		if (valor > 0) {
			saldo += valor;
			sucesso = true;
		}

		return sucesso;
	}

	public boolean sacar(double valor) {
		boolean sucesso = false;

		if (valor <= saldo) {
			saldo -= valor;
			sucesso = true;
		}

		return sucesso;
	}

	public String toString() {
		return titular + ", " + saldo + ", " + tipo;
	}

}
