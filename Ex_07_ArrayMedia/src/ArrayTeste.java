public class ArrayTeste {

	public static void main(String[] args) {

		ArrayMedia lista = new ArrayMedia();

		lista.adicionar(6);
		lista.adicionar(2);
		lista.adicionar(5);
		lista.adicionar(10);
		lista.adicionar(9);
		lista.adicionar(7);

		lista.mostrar();
		System.out.println("Média = " + lista.mediaAritmetica());

	}

}
