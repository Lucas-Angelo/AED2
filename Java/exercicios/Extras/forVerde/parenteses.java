import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Lucas Ângelo O. M. Rocha github.com/Lucas-Angelo
 */
public class parenteses {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Pilha minhaPilha[] = new Pilha[100];
		Caractere aux;

		String str = new String();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numPilha = 0;
		do {
			str = in.readLine();

			if (!str.equals("FIM")) {

				minhaPilha[numPilha] = new Pilha();

				for (int i = 0; i < str.trim().length(); i++) {

					if (str.charAt(i) == '(') { // Nao pode colocar um abrir no final
						aux = new Caractere(str.charAt(i));
						minhaPilha[numPilha].empilhar(aux);
					}

					if (str.charAt(i) == ')') {
						Caractere temp;
						temp = minhaPilha[numPilha].desempilhar();

						if (temp != null) {
							if (temp.getAlphaNumerico() == ')') {
								aux = new Caractere(str.charAt(i));
								minhaPilha[numPilha].empilhar(aux);
							}
						} else {
							minhaPilha[numPilha].desempilhar();
						}
					}

				}

				numPilha++;
			}

		} while (!str.equals("FIM"));

		for (int i = 0; i < numPilha; i++) {

			if (minhaPilha[i].getFilaTamanho() == 0)
				System.out.println("correto");
			else
				System.out.println("incorreto");

		}

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
	private int tamanho;

	Pilha() {

		Celula aux = new Celula();

		fundo = aux;
		topo = aux;
		tamanho = 0;
	}

	public void empilhar(Caractere alphaNumerico) {

		Celula aux = new Celula();
		aux.proximo = topo;
		aux.item = alphaNumerico;

		topo = aux;

		tamanho++;
	}

	public Caractere desempilhar() {
		Caractere aux = null;

		if (!pilhaVazia()) {
			aux = topo.item;

			topo = topo.proximo;

		}
		tamanho--;
		return (aux);
	}

	public Boolean pilhaVazia() {
		if (fundo == topo)
			return (true);
		else
			return (false);
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

	public int getFilaTamanho() {
		return this.tamanho;
	}

}