import java.util.HashSet;

public class ExHashSet {

	public static void main(String[] args) {

		// Criando um HashSet
		HashSet<String> nomes = new HashSet<String>();
		System.out.println(nomes);

		// Adiciona elementos no conjunto
		nomes.add("Felipe");
		nomes.add("Stênia");
		nomes.add("João");
		nomes.add("Carlos");
		nomes.add("Felipe");
		System.out.println(nomes);

		// Verifica se o elemento existe
		System.out.println(nomes.contains("João"));
		System.out.println(nomes.contains("Ana"));

		// Quantidade de elementos do conjunto
		System.out.println(nomes.size());

		// Remove um elemento do conjunto
		nomes.remove("Felipe");
		System.out.println(nomes);

		// Usando for com um conjunto
		for (String elemento : nomes) {
			System.out.println(elemento);
		}

		// Remove todos os elementos do conjunto
		nomes.clear();
		System.out.println(nomes);

	}

}
