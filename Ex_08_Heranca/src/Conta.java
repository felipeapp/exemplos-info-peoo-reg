import java.time.LocalDate;

public abstract class Conta {

	private String titular;
	private double saldo;
	private LocalDate dataAbertura;

	public Conta(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.dataAbertura = LocalDate.now();
	}

	public boolean saque(double valor) {
		boolean sucesso = saldo >= valor;

		if (sucesso)
			saldo -= valor;

		return sucesso;
	}

	public boolean deposito(double valor) {
		saldo += valor;
		return true;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String toString() {
		return "Titular: " + titular + "\nSaldo: " + saldo + "\nData de Abertura: " + dataAbertura + "\n";
	}

}
