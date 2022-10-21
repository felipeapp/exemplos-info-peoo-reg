public class Campus {

	private String endereco;
	private DiretorGeral diretor;

	public Campus(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public DiretorGeral getDiretor() {
		return diretor;
	}

	public void setDiretor(DiretorGeral diretor) {
		this.diretor = diretor;
	}

}
