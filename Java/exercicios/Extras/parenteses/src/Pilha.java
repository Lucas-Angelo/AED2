class Pilha {

	private Celula fundo;
	private Celula topo;

	Pilha() {

		Celula aux = new Celula();

		fundo = aux;
		topo = aux;
	}

	public void empilhar(Caractere alphaNumerico) {

		Celula aux = new Celula();
		aux.proximo = topo;
		aux.item = alphaNumerico;

		topo = aux;
	}

	public Caractere desempilhar() {
		Caractere aux = null;

		if (!pilhaVazia()) {
			aux = topo.item;

			topo = topo.proximo;

		}
		return (aux);
	}

	public Boolean pilhaVazia() {
		if (fundo == topo)
			return (true);
		else
			return (false);
	}

	public int verificarQuantidade(char caractere) {
		int res = 0;
		Celula aux;

		aux = topo;

		while (aux.proximo != fundo.proximo) {

			if (aux.proximo == fundo) {
				if (aux.item.getAlphaNumerico() == ')') // Nao se pode comecar uma equacao fechando
					res += -1000;
			} else if (aux == topo) {
				if (aux.item.getAlphaNumerico() == '(') // Nem se pode finalizar uma equacao abrindo
					res += -1000;
			}

			if (aux.item.getAlphaNumerico() == caractere)
				res++;

			aux = aux.proximo;
		}

		return res;
	}

	public void concatenar(Pilha pilha) {

		Celula aux;
		Pilha pilhaAux = new Pilha();

		aux = pilha.topo;
		while (aux.proximo != null) {

			pilhaAux.empilhar(aux.item);

			aux = aux.proximo;
		}

		aux = pilhaAux.topo;
		while (aux.proximo != null) {

			empilhar(pilhaAux.desempilhar());

			aux = aux.proximo;
		}

		aux = topo;
		while (aux.proximo != null) {

			aux = aux.proximo;
		}

		aux = pilhaAux.topo;
		while (aux.proximo != null) {

			pilhaAux.desempilhar();

			aux = aux.proximo;
		}

	}

	public Pilha copiar() {
		Pilha pilhaNova = new Pilha();

		pilhaNova.concatenar(this);

		return pilhaNova;
	}

	public void imprimir() {
		Pilha invertida = new Pilha();
		Celula aux;

		aux = topo;
		while (aux.proximo != null) {

			invertida.empilhar(aux.item);

			aux = aux.proximo;
		}

		aux = invertida.topo;
		while (aux.proximo != null) {

			System.out.print(aux.item.getAlphaNumerico() + "");

			aux = aux.proximo;
		}
		System.out.println("");

	}

}