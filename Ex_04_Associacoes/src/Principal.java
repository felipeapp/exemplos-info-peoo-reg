public class Principal {

	public static void main(String[] args) {

		DiretorGeral marilac = new DiretorGeral("Marilac");
		Campus sga = new Campus("São Gonçalo do Amarante");

		marilac.setCampus(sga);
		sga.setDiretor(marilac);

		System.out.println("O diretor do campus " + sga.getEndereco() + " é " + marilac.getNome());
	}

}
