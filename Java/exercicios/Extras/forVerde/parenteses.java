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

		int abre = 0, fecha = 0;

		String str = new String();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numPilha = 0;
		do {
			str = in.readLine();

			if (!str.equals("FIM")) {

				minhaPilha[numPilha] = new Pilha();

				for (int i = 0; i < str.trim().length(); i++) {

					aux = new Caractere(str.charAt(i));
					minhaPilha[numPilha].empilhar(aux);

				}

//				if (str.charAt(0) == ')')
//					abre += 2;
//				if ((str.charAt(str.length() - 1)) == '(')
//					abre += 4;

				numPilha++;
			}

		} while (!str.equals("FIM"));

		for (int i = 0; i < numPilha; i++) {
			abre += minhaPilha[i].verificarQuantidade('(');
			fecha += minhaPilha[i].verificarQuantidade(')');

			if (abre == fecha && abre >= 0 && fecha >= 0)
				System.out.println("correto");
			else
				System.out.println("incorreto");

			abre = 0;
			fecha = 0;
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

	public int verificarQuantidade(char caractere) {
		int res = 0;
		Celula aux;

		aux = topo;

		while (aux.proximo != fundo.proximo) {

			if (aux.proximo == fundo) {
				if (aux.item.getAlphaNumerico() == ')') // Nao se pode comecar uma equacao fechando
					res += -1000;
			} else if (aux == topo) {
				if (aux.item.getAlphaNumerico() == '(') // Nem se pode finalizar uma equacao abrindo
					res += -1000;
			}

			if (aux.item.getAlphaNumerico() == caractere)
				res++;

			aux = aux.proximo;
		}

		return res;
	}


}