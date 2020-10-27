class Celula {

	Caractere item; // corresponde ao item armazenado na célula da pilha.
	Celula proximo; // referência à próxima célula de uma pilha.

	Celula() {
		item = new Caractere();
		proximo = null;
	}

	// Construtor que inicializa o item com o valor passado através do parâmetro l
	// desse método; e o atributo que indica a próxima célula da pilha com null.
	Celula(char alphaNumerico) {
		item = new Caractere(alphaNumerico);
		proximo = null;
	}

}