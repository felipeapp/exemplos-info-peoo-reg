import java.util.LinkedList;

public class ExLinkedList {

	/*
	 * LinkedList tem praticamente as mesmas operações de ArrayList com adição de:
	 * addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getFirst()
	 * 
	 * De forma geral, ArrayList será mais eficiente para realizar buscas com acesso
	 * direto a partir dos índices, enquanto o LinkedList é capaz de fornecer
	 * operações específicas como inserção ou remoção na primeira posição de forma
	 * muito mais eficiente.
	 */

	public static void main(String[] args) {

		// Criando um LinkedList para o elemento String
		LinkedList<String> nomes = new LinkedList<String>();

		// Adiciona no final da lista
		nomes.add("Felipe");
		nomes.add("Vine");
		nomes.add("Stênia");
		System.out.println(nomes);

		// Adicionar na primeira e na última posição, respectivamente
		nomes.addFirst("Carlos");
		nomes.addLast("João");
		System.out.println(nomes);

		// Elemento de um índice específico: menos eficiente que o ArrayList
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(2));

		// Primeiro e último elemento da lista
		System.out.println(nomes.getFirst());
		System.out.println(nomes.getLast());

		// Atualizar um índice específico: menos eficiente que o ArrayList
		nomes.set(2, "Joel");
		System.out.println(nomes);

		// Remove o primeiro e último elemento da lista, respectivamente
		nomes.removeFirst();
		nomes.removeLast();
		System.out.println(nomes);

	}

}
