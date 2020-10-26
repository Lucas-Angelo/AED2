public class Pilha {

	private Celula fundo;
	private Celula topo;

	public Pilha() { // Construtor para iniciar a pilha

		Celula sentinela = new Celula();
		fundo = topo = sentinela;

	}

	public boolean pilhaVazia() {
		boolean res;

		if (fundo == topo)
			res = true;
		else
			res = false;

		return res;
	}

	public void empilhar(Inteiro valor) {
		Celula nova = new Celula(); // Cria a nova celula

		nova.proximo = topo; // A nova celula tem que apontar para o elemento de baixo, que por enquanto é o
								// topo
		nova.item = valor; // Nova celula recebe seu valor

		topo = nova; // Topo agora volta a ser o mais alto, que é a nova celula adicionada
	}

	public Inteiro desempilhar() throws Exception {
		Inteiro retirado = null;

		if (!pilhaVazia()) {
			retirado = topo.item; // Salva o elemento do topo que será retornado

			topo = topo.proximo; // Topo agora passa a ser o debaixo
		} else {
			new Exception("Erro ao retirar um item da pilha: a pilha esta vazia");
		}

		return retirado;
	}

	public void imprimirPilha() {
		Celula aux = new Celula();

		aux = topo;

		while (aux != fundo) {

			System.out.print(aux.item.getNumero());

			aux = aux.proximo;
		}
		System.out.println("");

	}

}
