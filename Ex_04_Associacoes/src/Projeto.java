import java.util.Date;

public class Projeto {

	private String titulo;
	private Date dataInicio;
	private Pesquisador[] pesquisadores;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Pesquisador[] getPesquisadores() {
		return pesquisadores;
	}

	public void setPesquisadores(Pesquisador[] pesquisadores) {
		this.pesquisadores = pesquisadores;
	}

}
