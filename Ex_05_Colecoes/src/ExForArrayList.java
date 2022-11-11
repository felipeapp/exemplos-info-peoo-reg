import java.util.LinkedList;

public class ExForArrayList {

	public static void main(String[] args) {
		// Estes exemplos se aplicam a ArrayList e a LinkedList
//		ArrayList<String> nomes = new ArrayList<String>();
		LinkedList<String> nomes = new LinkedList<String>();
		nomes.add("Felipe");
		nomes.add("Vine");
		nomes.add("Stênia");
		nomes.add("Carlos");
		nomes.add("Lívia");
		nomes.add("Aline");
		nomes.add("João");

		// Forma 1 do for para coleções
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Posição " + i + " = " + nomes.get(i));
		}

		System.out.println("---------------");

		// Forma 2 (foreach) para coleções
		for (String elemento : nomes) {
			System.out.println(elemento);
		}

	}

}
