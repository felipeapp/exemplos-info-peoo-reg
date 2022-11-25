package entidades;

import java.util.ArrayList;
import java.util.Collections;

public class Usuario {
	private String nome;
	private int cpf;
	private String telefone;
	private String matricula;

	private ArrayList<Emprestimo> emprestimos;

	public Usuario() {
		emprestimos = new ArrayList<>();
	}

	public Usuario(String nome, int cpf, String telefone, String matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.matricula = matricula;
		this.emprestimos = new ArrayList<>();
	}

	public Usuario(String nome, int cpf, String telefone, String matricula, ArrayList<Emprestimo> emprestimos) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.matricula = matricula;
		this.emprestimos = emprestimos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Emprestimo> getEmprestimos() {
//		return emprestimos;
		return (ArrayList<Emprestimo>) Collections.unmodifiableList(emprestimos);
	}

	public void addEmprestimo(Emprestimo emprestimo) {
		this.emprestimos.add(emprestimo);
	}

	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", matricula=" + matricula;
	}

}
