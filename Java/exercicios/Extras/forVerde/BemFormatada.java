import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Lucas Ângelo O. M. Rocha github.com/Lucas-Angelo
 */
public class BemFormatada {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str = new String();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		do {
			str = in.readLine();

			if (!str.equals("FIM")) {

				if (validar(str)) {
					System.out.println("Correto");
				} else {
					System.out.println("Incorreto");
				}

			}

		} while (!str.equals("FIM"));

	}

	public static boolean validar(String str) {
		Pilha pilhaEntrada = new Pilha();
		boolean res = true;

		for (int i = 0; i < str.length() && res == true; i++) {

			char atual = str.charAt(i);

			if (atual == '[' || atual == '(') {

				pilhaEntrada.empilhar(new Caractere(atual));

			} else if (atual == ']' || atual == ')') {

				if (pilhaEntrada.pilhaVazia()) { // Se ta fechando ou abrindo, e a pilha esta vazia, errado.
					res = false;
				}

				char topo = pilhaEntrada.getTopo();
				if (atual == ')' && topo == '(' || atual == ']' && topo == '[') { // Vai desempilhar se encontrar o que
																					// fecha
					pilhaEntrada.desempilhar();
				}

			}

		}

		// pilhaEntrada.imprimir();

		if (pilhaEntrada.pilhaVazia() && res) { // Se a pilha esta vazia, e nao foi feita nenhuma acao errada, true
			res = true;
		} else {
			res = false;
		}

		return res;

	}

}

class Caractere {

	private char alphaNumerico;

	public Caractere() {
		this.alphaNumerico = '0';
	}

	public Caractere(char alphaNumerico) {
		this.alphaNumerico = alphaNumerico;
	}

	public char getAlphaNumerico() {
		return this.alphaNumerico;
	}

	public void setAlphaNumerico(char alphaNumerico) {
		this.alphaNumerico = alphaNumerico;
	}

}

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

class Pilha {

	private Celula fundo;
	private Celula topo;

	Pilha() {

		Celula aux = new Celula();

		fundo = aux;
		topo = aux;
	}

	public void empilhar(Caractere alphaNumerico) {

		Celula aux = new Celula();
		aux.proximo = topo;
		aux.item = alphaNumerico;

		topo = aux;

	}

	public Caractere desempilhar() {
		Caractere aux = null;

		if (!pilhaVazia()) {
			aux = topo.item;

			topo = topo.proximo;

		}

		return (aux);
	}

	public Boolean pilhaVazia() {
		if (fundo == topo)
			return (true);
		else
			return (false);
	}

	public char getTopo() {
		return topo.item.getAlphaNumerico();
	}

	public void imprimir() {
		Pilha invertida = new Pilha();
		Celula aux;

		aux = topo;
		while (aux.proximo != null) {

			invertida.empilhar(aux.item);

			aux = aux.proximo;
		}

		aux = invertida.topo;
		while (aux.proximo != null) {

			System.out.print(aux.item.getAlphaNumerico() + "");

			aux = aux.proximo;
		}
		System.out.println("");

	}

}