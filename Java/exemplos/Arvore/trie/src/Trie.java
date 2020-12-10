public class Trie {

	private No raiz;

	public Trie() {
		raiz = new No();
	}

	public void inserir(String s) throws Exception {
		inserir(s, raiz, 0);
		System.out.println();
	}

	private void inserir(String s, No no, int i) throws Exception {

		int posicaoProximoCaractere = no.funcaoHash(s.charAt(i));

		// System.out.print("\nEM NO(" + no.elemento + ") (" + i + ")");

		if (no.proximo[posicaoProximoCaractere] == null) {

			// System.out.print("--> criando filho(" + s.charAt(i) + ")");

			no.proximo[posicaoProximoCaractere] = new No(s.charAt(i));

			if (i == s.length() - 1) {

				// System.out.print("(folha)");

				no.proximo[posicaoProximoCaractere].folha = true;

			} else {
				inserir(s, no.proximo[posicaoProximoCaractere], i + 1);
			}

		} else if ((no.proximo[posicaoProximoCaractere].folha == false) && (i < s.length() - 1)) {
			inserir(s, no.proximo[posicaoProximoCaractere], i + 1);

		} else {
			throw new Exception("Erro ao inserir! String " + s
					+ " apresenta como prefixo uma string ja inserida na arvore trie ou e prefixo de uma cadeia ja inserida na arvore trie!");
		}
	}

	public boolean pesquisar(String s) throws Exception {
		return pesquisar(s, raiz, 0);
	}

	public boolean pesquisar(String s, No no, int i) throws Exception {

		int posicaoProximoCaractere = no.funcaoHash(s.charAt(i));
		boolean resp = false;

		if (no.proximo[posicaoProximoCaractere] == null)
			resp = false;
		else if (i == s.length() - 1) {
			if (no.proximo[posicaoProximoCaractere].folha == true)
				resp = true;
			else
				resp = false;
		} else if (i < s.length() - 1)
			resp = pesquisar(s, no.proximo[posicaoProximoCaractere], i + 1);

		return resp;
	}
}
