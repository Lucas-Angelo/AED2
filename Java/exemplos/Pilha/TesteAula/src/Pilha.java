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
		Celula aux = topo;
		Inteiro i = null;
		if (!pilhaVazia()) {
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

}
