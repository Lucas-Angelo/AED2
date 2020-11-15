public class Fila {

	private Celula frente;
	private Celula tras;

	public Fila() {
		Celula sentinela = new Celula();
		frente = tras = sentinela;
	}

	public boolean filaVazia() {
		boolean resp;

		if (frente == tras)
			resp = true;
		else
			resp = false;

		return resp;
	}

	public void enfileirar(Inteiro novo) {
		Celula novaCelula = new Celula(novo);

		tras.proximo = novaCelula;
		tras = novaCelula;
	}

	public int somarElementos() {
		int somatorio = 0;

		Celula aux = frente.proximo;
		while (aux != null) {
			somatorio += aux.item.getValor();
			aux = aux.proximo;
		}

		return somatorio;
	}

	public int obterMaiorElemento() {

		Celula aux = frente.proximo;
		int maior = aux.item.getValor();

		while (aux != null) {

			if (aux.item.getValor() > maior)
				maior = aux.item.getValor();

			aux = aux.proximo;
		}

		return maior;
	}

//	public Inteiro desenfileirar() {
//		Celula aux = frente.proximo;
//
//		frente.proximo = aux.proximo;
//		aux.proximo = null;
//		if (aux == tras)
//			tras = frente;
//
//		return (aux.item);
//	}
//
//	public void imprimir() {
//
//		Celula aux;
//
//		aux = frente.proximo;
//		while (aux != null) {
//
//			System.out.println(aux.item.getValor());
//			aux = aux.proximo;
//		}
//	}

}
