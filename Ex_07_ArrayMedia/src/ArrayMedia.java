import java.util.ArrayList;

/*
Fazer uma classe ArrayMedia com as seguintes características:

Atributos
- Um ArrayList de valores inteiros

Métodos:
- adicionar um valor na lista
- mostrar os valores da lista
- calcular a média aritmética dos valores da lista

Fazer a classe ArrayTeste que:
- Instancia um objeto da classe ArrayMedia
- Adiciona alguns valores nela
- Mostra os valores adicionados
- Calcula e mostra a média
*/
public class ArrayMedia {

	private ArrayList<Integer> valores;

	public ArrayMedia() {
		valores = new ArrayList<>();
	}

	public void adicionar(int valor) {
		valores.add(valor);
	}

	public void mostrar() {
		System.out.println(valores);
	}

	public double mediaAritmetica() {
		int soma = 0;

		for (int valor : valores)
			soma += valor;

		return (double) soma / valores.size();
	}

}
