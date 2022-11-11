import java.util.ArrayList;
import java.util.Collections;

public class ExArrayList {

	public static void main(String[] args) {

		// Criando um ArrayList para elementos String
		ArrayList<String> nomes = new ArrayList<String>();
		System.out.println(nomes);

		// Adiciona no final da lista
		nomes.add("Felipe");
		nomes.add("Vine");
		nomes.add("Stênia");
		System.out.println(nomes);

		// Adicionar em uma posição específica causando deslocamento
		nomes.add(1, "João");
		System.out.println(nomes);

		// Pegando o elemento de um índice específico
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(2));

		// Atualizar o elemento de um índice específico
		nomes.set(2, "Joel");
		System.out.println(nomes);

		// Remover elementos
		nomes.remove(1); // Remover a partir do índice
		nomes.remove("Joel"); // Remover a partir do valor do elemento
		System.out.println(nomes);

		// Quantidade de elementos na lista
		System.out.println(nomes.size());

		// Informa se a lista está vazia
		System.out.println(nomes.isEmpty());

		// Verifica se a lista contem um elemento
		System.out.println(nomes.contains("Felipe"));
		System.out.println(nomes.contains("Carlos"));

		// Mais uma inserção
		nomes.add("Felipe");
		System.out.println(nomes);

		// Obter índice de elementos
		System.out.println(nomes.indexOf("Felipe")); // Primeira ocorrência
		System.out.println(nomes.lastIndexOf("Felipe")); // Última ocorrência

		// Conta quantas vezes o elemento aparece
		System.out.println(Collections.frequency(nomes, "Felipe"));
		System.out.println(Collections.frequency(nomes, "Stênia"));

		// Ordenação ascendente da lista
		Collections.sort(nomes);
		System.out.println(nomes);

		// Ordenação descendente
		Collections.sort(nomes, Collections.reverseOrder());
		System.out.println(nomes);

		// Inverte a sequência de elementos da lista
		Collections.reverse(nomes);
		System.out.println(nomes);

		// Elementos de maior e menor valor da lista
		System.out.println(Collections.max(nomes));
		System.out.println(Collections.min(nomes));

		// Remove todos os elementos da lista
		nomes.clear();
		System.out.println(nomes.isEmpty());
		System.out.println(nomes);

	}

}
