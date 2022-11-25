package entidades;

import java.util.ArrayList;
import java.util.Collections;

public class Exemplar {

	private int codigo;
	private boolean ativa;
	private boolean emprestada;

	private Livro livro;
	private ArrayList<Emprestimo> emprestimos;

	public Exemplar() {
		ativa = true;
		emprestada = false;
		this.emprestimos = new ArrayList<>();
	}

	public Exemplar(int codigo, boolean ativa, boolean emprestada, Livro livro) {
		this.codigo = codigo;
		this.ativa = ativa;
		this.emprestada = emprestada;
		this.livro = livro;
		this.emprestimos = new ArrayList<>();
	}

	public Exemplar(int codigo, boolean ativa, boolean emprestada, Livro livro, ArrayList<Emprestimo> emprestimos) {
		this.codigo = codigo;
		this.ativa = ativa;
		this.emprestada = emprestada;
		this.livro = livro;
		this.emprestimos = emprestimos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public boolean isEmprestada() {
		return emprestada;
	}

	public void setEmprestada(boolean emprestada) {
		this.emprestada = emprestada;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public ArrayList<Emprestimo> getEmprestimos() {
		return (ArrayList<Emprestimo>) Collections.unmodifiableList(emprestimos);
	}

	public void addEmprestimo(Emprestimo emprestimo) {
		this.emprestimos.add(emprestimo);
	}

	public String toString() {
		return "Exemplar [codigo=" + codigo + ", ativa=" + ativa + ", emprestada=" + emprestada + ", livro=" + livro
				+ "]";
	}

}
