public class Lista {

	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;

	public Lista() {
		Celula sentinela = new Celula();
		primeiro = ultimo = sentinela;
		tamanho = 0;
	}

	public void inserir(Inteiro novoItem, int posicao) throws Exception {

		Celula aux;
		Celula nova;

		if (posicao >= 0 && posicao <= tamanho) {

			aux = primeiro.proximo;
			for (int qtd = 0; qtd < posicao; qtd++)
				aux = aux.proximo;

			nova = new Celula(novoItem);

			if (posicao != tamanho) {
				nova.proximo = aux;
				nova.anterior = aux.anterior;
				aux.anterior = nova;
				nova.anterior.proximo = nova;
			} else {
				nova.anterior = ultimo;
				ultimo.proximo = nova;
				ultimo = ultimo.proximo;
			}

			tamanho++;

		} else {
			throw new Exception("Erro ao tentar inserir na lista: posicao invalida");
		}

	}

	public Inteiro remover(int posicao) throws Exception {

		Celula aux;
		Inteiro elemento;

		if (!listaVazia()) {

			if (posicao >= 0 && posicao < tamanho) {
				aux = primeiro.proximo;

				for (int qtd = 0; qtd < posicao; qtd++)
					aux = aux.proximo;

				aux.anterior.proximo = aux.proximo;

				tamanho--;

				if (posicao == tamanho)
					ultimo = aux.anterior;
				else
					aux.proximo.anterior = aux.anterior;

				aux.anterior = null;
				aux.proximo = null;

				elemento = aux.item;

			} else {
				throw new Exception("Erro ao tentar retirar elemento da lista: posicao insvalida");
			}

		} else {
			throw new Exception("Erro ao tentar retirar elemento da lista: a lista esta vazia");
		}

		return elemento;

	}

	public boolean listaVazia() {
		boolean res;

		if (primeiro == ultimo) { // ou: if(tamanho==0)
			res = true;
		} else {
			res = false;
		}

		return res;
	}

	public void imprimir() {
		Celula aux;
		int posicao = 0;

		aux = primeiro.proximo;
		while (aux != null) {
			System.out.println("[" + posicao + "]: " + aux.item.getDado());

			aux = aux.proximo;
			posicao++;
		}
	}

}
