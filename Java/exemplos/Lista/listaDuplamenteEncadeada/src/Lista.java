public class Lista {

	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;

	public Lista() {
		Celula sentinela = new Celula();
		primeiro = ultimo = sentinela;
		tamanho = 0;
	}

	public void inserir(Inteiro elemento, int posicao) throws Exception {

		Celula aux, anterior;
		Celula nova;
		int qtd;

		if (posicao <= tamanho) {
			aux = primeiro.proximo;
			anterior = primeiro;

			for (qtd = 0; qtd < posicao; qtd++) {
				aux = aux.proximo;
				anterior = anterior.proximo;
			}

			nova = new Celula(elemento);
			anterior.proximo = nova;
			nova.proximo = aux;

			// if (posicao == tamanho)
			// if (anterior == ultimo)
			if (aux == null) {
				ultimo = ultimo.proximo;
				// ultimo = nova;
			}
			tamanho++;

		} else {
			new Exception("Erro ao tentar inserir na lista: posição inválida.");
		}

	}

	public Inteiro remover(int posicao) throws Exception {

		Celula aux, anterior;
		int qtd;
		Inteiro retirado = null;

		if (!listaVazia()) {

			if (posicao < tamanho) {

				aux = primeiro.proximo;
				anterior = primeiro;

				for (qtd = 0; qtd < posicao; qtd++) {
					aux = aux.proximo;
					anterior = anterior.proximo;
				}

				anterior.proximo = aux.proximo;
				tamanho--;

				if (posicao == tamanho) {
					ultimo = anterior;
				}

				aux.proximo = null;

				retirado = aux.item;

			} else {
				new Exception("Erro ao tentar remover da lista: posição inválida!");
			}

		} else {
			new Exception("Erro ao tentar remover da lista: lista vazia!");
		}

		return retirado;

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
