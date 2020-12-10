
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agenda minhaAgenda = new Agenda();
		Contato novo;
		Contato pesquisado;

		novo = new Contato("Teodoro", 231313241, "teodoro@email.com", "PucMG Praça da Liberdade");
		minhaAgenda.inserir(novo);

		pesquisado = minhaAgenda.pesquisar("Teodoro");

		if (pesquisado != null)
			pesquisado.imprimir();
		else
			System.out.println("\nNão existe esse contato;");

		pesquisado = minhaAgenda.pesquisar("Lucas");

		if (pesquisado != null)
			pesquisado.imprimir();
		else
			System.out.println("\nNão existe esse contato;");

	}

}
