public class Lista {

	private Inteiro[] listaVetor;

	private int primeiro;
	private int ultimo;

	private int tamanho; // Não é necessário guardar o tamanho da lista, poderia ser um
							// listaVetor.legth()

	public Lista(int tamanho) {
		listaVetor = new Inteiro[tamanho]; // Alocar memória e criar lista

		this.tamanho = tamanho; // Criar lista já com um tamanho exato
		primeiro = ultimo = 0; // Pois a lista ainda está vazia
	}

	public Lista() {

	}

	public boolean listaCheia() {
		boolean resp;

		if (ultimo == tamanho)
			resp = true;
		else
			resp = false;

		return resp;
	}

	public boolean listaVazia() {
		boolean resp;

		if (primeiro == ultimo)
			resp = true;
		else
			resp = false;

		return resp;
	}

	public void inserir(Inteiro novo, int posicao) throws Exception {

		if ((posicao >= primeiro) && (posicao <= ultimo)) {

			if (!listaCheia()) {

				for (int j = ultimo; j > posicao; j--) {
					listaVetor[j] = listaVetor[j - 1]; // Chegando todos uma posição para frente
				}

				listaVetor[posicao] = novo;
				ultimo++;

			} else {
				new Exception("Erro ao tentar inserir na lista: a lista está cheia");
			}

		} else {
			new Exception("Erro ao tentar inserir na lista: posição inválida! Lista ficaria com buracos");
		}
	}

	public Inteiro remover(int posicao) throws Exception {

		Inteiro retirado = null;

		if ((posicao >= primeiro) && (posicao <= ultimo)) {

			if (!listaVazia()) {

				retirado = listaVetor[posicao];
				ultimo--;
				for (int j = posicao; j < ultimo; j++) {
					listaVetor[j] = listaVetor[j + 1];
				}

			} else {
				new Exception("Erro ao tentar remover na lista: a lista está vazia");
			}

		} else {
			new Exception("Erro ao tentar remover na lista: posição inválida! Lista não possui valor nessa posição");
		}

		return retirado;
	}

	public void imprimir() {

		if (!listaVazia()) {

			for (int aux = primeiro; aux < ultimo; aux++) {
				System.out.println("[" + aux + "]: " + listaVetor[aux].getDado());
			}

		}

	}

	public void quest() throws Exception {
		int i;

		for (i = 1; i < 4; i++) {
			inserir(remover(i), 4 - i);
		}
	}

}
