public class ABB {

	private No raiz;

	public ABB() {
		raiz = null;
	}

	public boolean arvoreVazia() {

		boolean resp;

		if (raiz == null)
			resp = true;
		else
			resp = false;

		return resp;
	}

	public Inteiro pesquisar(int chave) {
		return pesquisar(chave, raiz);
	}

	private Inteiro pesquisar(int chave, No raizArvore) {

		Inteiro pesquisado;

		if (raizArvore == null)
			pesquisado = null;
		else {
			if (raizArvore.item.getDado() == chave)
				pesquisado = raizArvore.item;
			else if (raizArvore.item.getDado() > chave)
				pesquisado = pesquisar(chave, raizArvore.esquerda);
			else
				pesquisado = pesquisar(chave, raizArvore.direita);
		}

		return pesquisado;
	}

	public void inserir(Inteiro novo) throws Exception {
		raiz = inserir(novo, raiz);
	}

	private No inserir(Inteiro novo, No raizArvore) throws Exception {

		if (raizArvore == null)
			raizArvore = new No(novo);
		else if (raizArvore.item.getDado() > novo.getDado())
			raizArvore.esquerda = inserir(novo, raizArvore.esquerda);
		else if (raizArvore.item.getDado() < novo.getDado())
			raizArvore.direita = inserir(novo, raizArvore.direita);
		else
			throw new Exception("Erro ao tentar inserir na árvore: chave repetida!");

		return raizArvore;
	}

	public void imprimirEmOrdem() {
		imprimirEmOrdem(raiz);
	}

	private void imprimirEmOrdem(No raizArvore) { // Caso queira imprirmir decrescente só trocar o .esquerda

		if (raizArvore != null) { // Verificar nao o no de agora nao esta nulo
			imprimirEmOrdem(raizArvore.esquerda);
			System.out.println(raizArvore.item.getDado());
			imprimirEmOrdem(raizArvore.direita);
		}

	}
}