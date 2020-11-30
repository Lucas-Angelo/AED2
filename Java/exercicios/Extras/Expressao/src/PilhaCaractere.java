public class PilhaCaractere {

	private CelulaCaractere fundo; // refer�ncia � c�lula que est� no fundo da pilha. Essa c�lula � utilizada
									// apenas para controle.
	private CelulaCaractere topo; // refer�ncia � c�lula que est� no topo da pilha.

	// Construtor que cria uma pilha "vazia" inicializando a c�lula do fundo da
	// pilha e os atributos de controle da pilha (fundo e topo).
	PilhaCaractere() {

		CelulaCaractere aux = new CelulaCaractere();

		fundo = aux;
		topo = aux;
	}

	// Insere o item, passado como par�metro para esse m�todo, no topo da pilha.
	public void empilhar(Caractere l) {
		// inser��o da nova c�lula no topo da pilha.
		CelulaCaractere aux = new CelulaCaractere();
		aux.proximo = topo;
		aux.item = l;

		// atualiza��o do atributo de controle topo.
		topo = aux;
	}

	// Retira o item que est� no topo da pilha. Se a pilha estiver vazia, esse
	// m�todo deve retornar null; caso contr�rio, esse m�todo deve retornar o item
	// retirado da pilha.
	public Caractere desempilhar() {
		// se a pilha estiver vazia, esse m�todo deve retornar null.
		Caractere aux = null;

		if (!pilhaVazia()) {
			// aux aponta para o item da pilha que ser� retornado/desempilhado, ou seja, o
			// item do topo.
			aux = topo.item;

			// atualiza��o do atributo de controle topo.
			topo = topo.proximo;

		}
		return (aux);
	}

	// Verifica se a pilha est� vazia. Em caso afirmativo, retorna true e em caso
	// negativo retorna false.
	public Boolean pilhaVazia() {
		// se a pilha apresentar apenas a c�lula sentinela, ela est� vazia.
		if (fundo == topo)
			return (true);
		else
			return (false);
	}

	public void imprimir() {
		CelulaCaractere aux = topo;

		while (aux != null) {

			System.out.print(aux.item.getLetra() + " ");

			aux = aux.proximo;
		}
	}
}