public class Pilha {

	private Celula fundo;
	private Celula topo;

	public Pilha() {
		Celula sentinela = new Celula();

		fundo = topo = sentinela;
	}

	public void empilhar(Inteiro elemento) {
		Celula novaCelula = new Celula();

		novaCelula.proximo = topo;
		topo = novaCelula;
	}

	public Inteiro desempilhar() {
		Celula aux;
		Inteiro i = null;
		if (!pilhaVazia()) {
			aux = topo;
			topo = topo.proximo;

			aux.proximo = null;
			i = aux.item;
		}
		return i;
	}

	public boolean pilhaVazia() {
		boolean res = false;

		if (fundo == topo)
			res = true;

		return res;
	}

	public void imprimir() {
		Celula aux;

		aux = this.topo;
		while (aux.proximo != null) {

			System.out.println(aux.item.getDado() + " ");

			aux = aux.proximo;
		}
	}

}
