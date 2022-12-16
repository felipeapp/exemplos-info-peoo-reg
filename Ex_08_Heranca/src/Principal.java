public class Principal {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente("Felipe", 4.99);
		ContaPoupanca cp = new ContaPoupanca("Maria", 0.05);

		System.out.println(cc.deposito(100));
		System.out.println(cp.deposito(50));
		System.out.println(cc.saque(75));
		System.out.println(cp.saque(80));

		System.out.println("-----");
		System.out.println(cc);
		System.out.println("-----");
		System.out.println(cp);
		System.out.println("-----");

	}

}
