import java.io.*;

public class OperacoesFila {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String qtd = new String();

		do {
			qtd = in.readLine();

			if (!qtd.equals("FIM")) {
				Fila fila = new Fila();

				for (int i = 0; i < Integer.parseInt(qtd); i++) {
					Inteiro enfileirado = new Inteiro(Integer.parseInt(in.readLine()));
					fila.enfileirar(enfileirado);
				}

				System.out.println(fila.somarElementos() + " " + fila.obterMaiorElemento());

			}

		} while (!qtd.equals("FIM"));

	}

}

class Inteiro {

	private int valor;

	public Inteiro() {
		this.valor = 0;
	}

	public Inteiro(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}

class Celula {

	Inteiro item;
	Celula proximo;

	public Celula(Inteiro item) {
		this.item = item;
		this.proximo = null;
	}

	public Celula() {
		this.item = new Inteiro(0);
		this.proximo = null;
	}
}

class Fila {

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
