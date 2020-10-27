public class ListaContaCorrente {

	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;

	public ListaContaCorrente() {
		Celula sentinela = new Celula();
		primeiro = ultimo = sentinela;
		tamanho = 0;
	}

	public void inserirFinal(ContaCorrente contaCorrente) throws Exception {

		Celula aux, anterior;
		Celula nova;
		int qtd;

		aux = primeiro.proximo;
		anterior = primeiro;

		for (qtd = 0; qtd < tamanho; qtd++) {
			aux = aux.proximo;
			anterior = anterior.proximo;
		}

		nova = new Celula(contaCorrente);
		anterior.proximo = nova;
		nova.proximo = aux;

		// if (posicao == tamanho)
		// if (anterior == ultimo)
		if (aux == null) {
			ultimo = ultimo.proximo;
			// ultimo = nova;
		}
		tamanho++;

	}

	public ContaCorrente remover(int posicao) throws Exception {

		Celula aux, anterior;
		int qtd;
		ContaCorrente retirado = null;

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

		aux = primeiro.proximo;
		while (aux != null) {
			System.out.printf("Titular: %s, Agência: %d, Número da conta-corrente: %d, Saldo atual: %.2f\n",
					aux.item.getTitularNome(), aux.item.getAgencia(), aux.item.getNumConta(), aux.item.getSaldo());

			aux = aux.proximo;
		}
	}

	public void concaternar(ListaContaCorrente lista2) {

		ListaContaCorrente nova = new ListaContaCorrente();
		Celula auxNova;

		nova.primeiro = primeiro;
		nova.ultimo = ultimo;
		nova.ultimo.proximo = lista2.primeiro.proximo;
		nova.ultimo = lista2.ultimo;

		int cont = 0;
		auxNova = nova.primeiro.proximo;
		while (auxNova != null) {

			cont++;

			auxNova = auxNova.proximo;
		}

		nova.tamanho = cont;

		primeiro = nova.primeiro;
		tamanho = cont;

	}

	public void depositar(int numContaCorrente, double credito) {

		Celula aux;
		boolean concluido = false;

		aux = primeiro.proximo;
		while (aux != null && concluido != true) {

			if (aux.item.getNumConta() == numContaCorrente) {

				double novoSaldo = aux.item.getSaldo() + credito;
				aux.item.setSaldo(novoSaldo);

				concluido = true;
			}

			aux = aux.proximo;
		}

	}

	public int obterNumContasCorrentes() {
		return this.tamanho;
	}

	public ListaContaCorrente copiar() {
		ListaContaCorrente copia = new ListaContaCorrente();

		copia.primeiro = primeiro;
		copia.ultimo = ultimo;

		return copia;
	}

	public void eliminarContasCorrentesPosicoesPares() {

		Celula aux, anterior = null, proximo;

		int cont = 1;
		aux = primeiro.proximo;
		while (aux != null) {

			proximo = aux.proximo;

			if (cont % 2 == 0) {
				aux.item = null;
				aux.proximo = proximo;
				anterior.proximo = proximo;
			}

			anterior = aux;
			aux = aux.proximo;
			cont++;
		}

	}

}
