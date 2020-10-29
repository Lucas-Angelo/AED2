class Pilha {

	private Celula fundo;
	private Celula topo;
	private int tamanho;

	Pilha() {

		Celula aux = new Celula();

		fundo = aux;
		topo = aux;
		tamanho = 0;
	}

	public void empilhar(Caractere alphaNumerico) {

		Celula aux = new Celula();
		aux.proximo = topo;
		aux.item = alphaNumerico;

		topo = aux;

		tamanho++;
	}

	public Caractere desempilhar() {
		Caractere aux = null;

		if (!pilhaVazia()) {
			aux = topo.item;

			topo = topo.proximo;

		}
		tamanho--;
		return (aux);
	}

	public Boolean pilhaVazia() {
		if (fundo == topo)
			return (true);
		else
			return (false);
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

	public int getFilaTamanho() {
		return this.tamanho;
	}

}