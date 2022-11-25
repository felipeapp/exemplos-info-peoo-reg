package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Livro {

	private String titulo;
	private String autor;
	private LocalDate ano;
	private int edicao;
	private String editora;
	private String isbn;

	private ArrayList<Exemplar> exemplares;

	public Livro() {
		this.exemplares = new ArrayList<>();
	}

	public Livro(String titulo, String autor, LocalDate ano, int edicao, String editora, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.edicao = edicao;
		this.editora = editora;
		this.isbn = isbn;
		this.exemplares = new ArrayList<>();
	}

	public Livro(String titulo, String autor, LocalDate ano, int edicao, String editora, String isbn,
			ArrayList<Exemplar> exemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.edicao = edicao;
		this.editora = editora;
		this.isbn = isbn;
		this.exemplares = exemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getAno() {
		return ano;
	}

	public void setAno(LocalDate ano) {
		this.ano = ano;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public ArrayList<Exemplar> getExemplares() {
		return (ArrayList<Exemplar>) Collections.unmodifiableList(exemplares);
	}

	public void addExemplar(Exemplar exemplar) {
		this.exemplares.add(exemplar);
	}

	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", edicao=" + edicao + ", editora="
				+ editora + ", isbn=" + isbn + "]";
	}

}
