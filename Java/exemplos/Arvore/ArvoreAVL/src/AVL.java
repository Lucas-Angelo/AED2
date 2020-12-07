public class AVL {

	private No raiz;

	public AVL() {
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

		return balancear(raizArvore); // Insere normalmente dai retorna a versao balanceada caso precise
	}

	private No balancear(No raizArvore) {
		int fatorBalanceamento;
		int fatorBalanceamentoFilho;

		fatorBalanceamento = raizArvore.getFatorBalanceamento();

		if (fatorBalanceamento >= 2) { // Desbalanceado a esquerda

			fatorBalanceamentoFilho = raizArvore.esquerda.getFatorBalanceamento();

			// Caso que necessita de rotacao simples para a direita, filho esta
			// desbalanceado para o mesmo lado que o pai, dai atualiza a raiz da subarvore
			if ((fatorBalanceamentoFilho) == 0 || (fatorBalanceamentoFilho == 1))
				raizArvore = rotacionarDireita(raizArvore);
			// Caso em que o filho esta desbalanceado para direita e o pai para esquerda,
			// dai precisa de rotacao dupla
			else if (fatorBalanceamentoFilho == -1) {
				raizArvore.esquerda = rotacionarEsquerda(raizArvore.esquerda); // Primeiro rotacionar o filho a esquerda
				raizArvore = rotacionarDireita(raizArvore); // Agora rotaciona o pai
			}
		} else if (fatorBalanceamento <= -2) { // Desbalanceado para a direita

			fatorBalanceamentoFilho = raizArvore.direita.getFatorBalanceamento();

			// Rotacao simples a esquerda
			if ((fatorBalanceamentoFilho == -1) || (fatorBalanceamentoFilho == 0)) {
				raizArvore = rotacionarEsquerda(raizArvore);
			}
			// Dai nesse caso precisa de rotacao dupla
			else if (fatorBalanceamentoFilho == 1) {
				raizArvore.direita = rotacionarDireita(raizArvore.direita); // Rotaciona filho
				raizArvore = rotacionarEsquerda(raizArvore); // Rotaciona o pai
			}

		} else
			raizArvore.setAltura();

		return raizArvore;
	}

	private No rotacionarEsquerda(No p) {

		No z;
		No filhoDireitaEsquerda; // Triangulo vermelho, o auxiliar

		z = p.direita;
		filhoDireitaEsquerda = z.esquerda;

		// p torna-se o filho a esquerda de z
		z.esquerda = p;

		// p antigo filho a esquerda de z torna-se o novo filho a direita de p
		p.direita = filhoDireitaEsquerda;

		// Quando faz essas rotacoes as alturas podem ter sido alteradas

		p.setAltura();
		z.setAltura();

		return z;
	}

	private No rotacionarDireita(No p) {

		No u;
		No filhoEsquerdaDireita; // Triangulo vermelho, usado com auxiliar para nao perder

		u = p.esquerda;
		filhoEsquerdaDireita = u.direita;

		// p torna-se o filho a direita de u
		u.direita = p;

		// o antigo filho a direita de u torna-se o novo filho a esquerda de p
		p.esquerda = filhoEsquerdaDireita;

		p.setAltura();
		u.setAltura();

		return u;
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