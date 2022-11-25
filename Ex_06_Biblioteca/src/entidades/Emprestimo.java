package entidades;

import java.time.LocalDate;

public class Emprestimo {

	private LocalDate dataEmprestimo;
	private LocalDate dataPrevista;
	private LocalDate dataEntrega;
	private int situacao;

	private Usuario usuario;
	private Exemplar exemplar;

	public Emprestimo() {
	}

	public Emprestimo(LocalDate dataEmprestimo, LocalDate dataPrevista, LocalDate dataEntrega, int situacao,
			Usuario usuario, Exemplar exemplar) {
		this.dataEmprestimo = dataEmprestimo;
		this.dataPrevista = dataPrevista;
		this.dataEntrega = dataEntrega;
		this.situacao = situacao;
		this.usuario = usuario;
		this.exemplar = exemplar;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(LocalDate dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Exemplar getExemplar() {
		return exemplar;
	}

	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}

	public String toString() {
		return "Emprestimo [dataEmprestimo=" + dataEmprestimo + ", dataPrevista=" + dataPrevista + ", dataEntrega="
				+ dataEntrega + ", situacao=" + situacao + ", usuario=" + usuario + ", exemplar=" + exemplar + "]";
	}

}
