public class Agenda {

	No raiz;

	public Agenda() {
		raiz = null;
	}

	public void inserir(Contato novo) {
		this.raiz = inserir(novo, this.raiz);
	}

	private No inserir(Contato novo, No raizArvore) {
		char letra = novo.getNome().charAt(0);

		if (raizArvore == null) {
			raizArvore = new No(letra);
			raizArvore.listaContatos.inserir(novo);
		} else if (raizArvore.inicial == letra)
			raizArvore.listaContatos.inserir(novo);
		else if (raizArvore.inicial > letra)
			raizArvore.esquerda = inserir(novo, raizArvore.esquerda);
		else if (raizArvore.inicial < letra)
			raizArvore.direita = inserir(novo, raizArvore.direita);

		return raizArvore;
	}

	public Contato pesquisar(String nome) {
		return pesquisar(nome, raiz);
	}

	private Contato pesquisar(String nome, No raizArvore) {
		Contato pesquisado;
		char letra = nome.charAt(0);

		if (raizArvore == null)
			pesquisado = null;
		else if (raizArvore.inicial == letra)
			pesquisado = raizArvore.listaContatos.pesquisar(nome);
		else if (letra < raizArvore.inicial)
			pesquisado = pesquisar(nome, raizArvore.esquerda);
		else
			pesquisado = pesquisar(nome, raizArvore.direita);

		return pesquisado;
	}
}
