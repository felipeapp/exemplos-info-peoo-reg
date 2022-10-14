package terminal;

import entidades.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new Conta();

		conta.titular = "Felipe";
		conta.alterarTipo(1);

		if (conta.depositar(50))
			System.out.println("Depositado com sucesso!");
		else
			System.out.println("Falha no depósito!");

		System.out.println("Titular: " + conta.titular);
		System.out.println("Saldo: " + conta.consultarSaldo());
		System.out.println("Tipo: " + conta.lerTipo());
	}

}
