public class HashEmAberto {

	private int M;
	private Inteiro[] tabela;

	public HashEmAberto(int tamanho) {
		this.M = tamanho;
		this.tabela = new Inteiro[tamanho];

		for (int i = 0; i < tamanho; i++)
			this.tabela[i] = null;
	}

	// h(x) = (x%79 + k * (x%31)) % 79
	public int funcaoHash(int x, int k) {
		return ((x % M) + k) % M;
	}

	public Inteiro pesquisar(int chave) {
		int k = 0;
		int posicao;
		Inteiro pesquisado = null;

		while (k < this.M) {
			posicao = funcaoHash(chave, k);

			if (tabela[posicao] == null) {
				pesquisado = null;
				k = M;
			} else if (tabela[posicao].getDado() == chave) {
				pesquisado = tabela[posicao];
				k = M;
			}

			k++;
		}

		return pesquisado;

	}

	public void inserir(int chave) {
		int k = 0;
		int posicao;

		while (k < this.M) {
			posicao = funcaoHash(chave, k);

			if (tabela[posicao] == null) {
				tabela[posicao] = new Inteiro(chave);
				k = M;
			} else if (tabela[posicao].getDado() == chave) {
				System.out.println("Chave ja inserida");
				k = M;
			}

			k++;
		}

	}
}
