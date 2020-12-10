public class Lista {

	Celula primeiro;
	Celula ultimo;

	public Lista() {
		Celula sentinela = new Celula();
		primeiro = ultimo = sentinela;
	}

	public boolean listaVazia() {
		boolean res;

		if (primeiro == ultimo)
			res = true;
		else
			res = false;

		return res;
	}

	public void inserir(Contato novo) {
		Celula aux = new Celula(novo);
		ultimo.proximo = aux;
		ultimo = aux;
	}

	public Contato pesquisar(String nome) {
		Celula aux = primeiro.proximo;
		Contato pesquisado = null;

		while (aux != null && pesquisado == null)
			if (aux.item.getNome().equals(nome))
				pesquisado = aux.item;
			else
				aux = aux.proximo;

		return pesquisado;
	}

}
