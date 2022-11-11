import java.util.HashMap;

public class ExHashMap {

	public static void main(String[] args) {

		// Criando um map com chaves string e valores inteiros
		HashMap<String, Integer> notas = new HashMap<String, Integer>();
		System.out.println(notas);

		// Adicionando elementos
		notas.put("Felipe", 95);
		notas.put("João", 50);
		notas.put("Ana", 85);
		notas.put("Stênia", 100);
		System.out.println(notas);

		// Pegando um valor a partir da chave
		System.out.println(notas.get("Stênia"));
		System.out.println(notas.get("Maria"));

		// O put atualiza o valor caso ele já exista
		notas.put("Stênia", 50);
		System.out.println(notas);

		// Remover uma chave/valor
		notas.remove("Stênia");
		System.out.println(notas);

		// Verifica se o map está vazio
		System.out.println(notas.isEmpty());

		// Retorna a quantidade de elementos do map
		System.out.println(notas.size());

		// Vericar se uma chave ou se um valor existe
		System.out.println(notas.containsKey("João"));
		System.out.println(notas.containsValue(95));

		// Recupera as coleções de chaves e valores, respectivamente
		System.out.println(notas.keySet());
		System.out.println(notas.values());

		// Usando o for
		for (String chave : notas.keySet()) {
			System.out.println("Chave " + chave + " = " + notas.get(chave));
		}

		// Remover todos os elementos
		notas.clear();
		System.out.println(notas);

	}

}
