package entidades;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Usuario usuario1 = new Usuario();

		System.out.print("Digite o nome do usuário: ");
		usuario1.setNome(leitor.nextLine());

		System.out.print("Digite o telefone do usuário: ");
		usuario1.setTelefone(leitor.nextLine());

		System.out.print("Digite a matrícula do usuário: ");
		usuario1.setMatricula(leitor.nextLine());

		System.out.print("Digite o CPF do usuário: ");
		usuario1.setCpf(leitor.nextInt());

		leitor.close();

		Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "JK Rowling", LocalDate.of(1997, 1, 1), 1,
				"Editora Programadora", "123456");
		Exemplar exemplar1 = new Exemplar(100, true, true, livro1);
		livro1.addExemplar(exemplar1);

		Emprestimo emprestimo1 = new Emprestimo(LocalDate.of(2022, 11, 25), LocalDate.parse("2022-12-10"),
				LocalDate.of(2022, 12, 5), 0, usuario1, exemplar1);
		usuario1.addEmprestimo(emprestimo1);

		System.out.println(emprestimo1);
	}

}
