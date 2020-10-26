import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Lucas Ângelo O. M. Rocha github.com/Lucas-Angelo
 */
public class SequenciaEspelho {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Pilha pilhaEspelho[] = new Pilha[100];
		Inteiro aux;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();

		int numInicio, numFim, numAux;
		int i = 0;

		do {
			str = in.readLine();

			pilhaEspelho[i] = new Pilha();

			if (!str.equals("FIM")) {

				String dividida[] = str.split(" ", 2);

				numInicio = Integer.parseInt(dividida[0].toString());
				numFim = Integer.parseInt(dividida[1].toString());
				numAux = numInicio;

				for (int z = numInicio; z <= numFim; z++) {

					String invertido = new String("");
					for (int y = 0; y < (Integer.toString(numAux)).length(); y++) {
						invertido += Integer.toString(numAux).charAt((Integer.toString(numAux)).length() - 1 - y);
					}

					aux = new Inteiro(invertido);
					pilhaEspelho[i].empilhar(aux);

					numAux++;
				}

				numAux = numFim;

				for (int z = numInicio; z <= numFim; z++) {
					aux = new Inteiro(Integer.toString(numAux));
					pilhaEspelho[i].empilhar(aux);

					numAux--;
				}

				i++;
			}

		} while (!str.equals("FIM"));

		for (int z = 0; z < i; z++)
			pilhaEspelho[z].imprimirPilha();

	}

}

class Inteiro {

	private String numero;

	public Inteiro() {
		this.numero = "0";
	}

	public Inteiro(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}

class Celula {

	Inteiro item;
	Celula proximo;

	public Celula() { // Criador da Celula Sentinela
		this.item = new Inteiro(); // Usando o construtor sem parâmetro do Inteiro, daí o item da sentinela vai
									// valer 0
		this.proximo = null; // Nâo existe ainda um elemento próximo pra apontar
	}

	public Celula(String elemento) {
		this.item = new Inteiro(elemento);
		this.proximo = null;
	}

}

class Pilha {

	private Celula fundo;
	private Celula topo;

	public Pilha() { // Construtor para iniciar a pilha

		Celula sentinela = new Celula();
		fundo = topo = sentinela;

	}

	public boolean pilhaVazia() {
		boolean res;

		if (fundo == topo)
			res = true;
		else
			res = false;

		return res;
	}

	public void empilhar(Inteiro valor) {
		Celula nova = new Celula(); // Cria a nova celula

		nova.proximo = topo; // A nova celula tem que apontar para o elemento de baixo, que por enquanto é o
								// topo
		nova.item = valor; // Nova celula recebe seu valor

		topo = nova; // Topo agora volta a ser o mais alto, que é a nova celula adicionada
	}

	public Inteiro desempilhar() throws Exception {
		Inteiro retirado = null;

		if (!pilhaVazia()) {
			retirado = topo.item; // Salva o elemento do topo que será retornado

			topo = topo.proximo; // Topo agora passa a ser o debaixo
		} else {
			new Exception("Erro ao retirar um item da pilha: a pilha esta vazia");
		}

		return retirado;
	}

	public void imprimirPilha() {
		Celula aux = new Celula();

		aux = topo;

		while (aux != fundo) {

			System.out.print(aux.item.getNumero());

			aux = aux.proximo;
		}
		System.out.println("");

	}

}
