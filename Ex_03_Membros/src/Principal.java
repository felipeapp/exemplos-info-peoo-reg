public class Principal {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta("Maria", 2);

		conta1.setTitular("Felipe");
		conta1.setTipo(1);

		if (conta1.depositar(200))
			System.out.println("Depósito de 200!");

		if (conta1.sacar(50))
			System.out.println("Saque de 50!");

		System.out.println();
		System.out.println("Titular: " + conta1.getTitular());
		System.out.println("Saldo: " + conta1.getSaldo());
		System.out.println("Tipo: " + conta1.getTipo());
		System.out.println();
		System.out.println("Titular: " + conta2.getTitular());
		System.out.println("Saldo: " + conta2.getSaldo());
		System.out.println("Tipo: " + conta2.getTipo());
		System.out.println();
		System.out.println("Titular: " + conta3.getTitular());
		System.out.println("Saldo: " + conta3.getSaldo());
		System.out.println("Tipo: " + conta3.getTipo());

		System.out.println();
		// Usando o método toString definido na classe Conta
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);

	}

}
