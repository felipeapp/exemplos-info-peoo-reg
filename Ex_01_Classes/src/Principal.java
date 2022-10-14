public class Principal {

	public static void main(String[] args) {

		Professor prof1 = new Professor();
		prof1.nome = "Felipe Alves";
		prof1.matricula = 654321;
		prof1.disciplina = "Programação Orientada à Objetos";
		prof1.titulacao = "Doutor";

		Professor prof2 = new Professor();
		prof2.nome = "Lucas Mariano";
		prof2.matricula = 123456;
		prof2.disciplina = "Fundamentos de Algoritmos";
		prof2.titulacao = "Mestre";

		System.out.println("Professor 1");
		System.out.println("Nome: " + prof1.nome);
		System.out.println("Matrícula: " + prof1.matricula);
		System.out.println("Disciplina: " + prof1.disciplina);
		System.out.println("Titulação: " + prof1.titulacao);
		System.out.println("----------------------");
		System.out.println("Professor 2");
		System.out.println("Nome: " + prof2.nome);
		System.out.println("Matrícula: " + prof2.matricula);
		System.out.println("Disciplina: " + prof2.disciplina);
		System.out.println("Titulação: " + prof2.titulacao);

	}

}
