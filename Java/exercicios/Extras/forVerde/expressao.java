import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class expressao {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PolishNotation pn = new PolishNotation();
		String str = new String();

		do {
			str = in.readLine();
			if (!str.equals("FIM")) {
				pn = new PolishNotation();
				String polonesa = pn.transformar(str);
				System.out.println(polonesa);
			}
		} while (!str.equals("FIM"));

	}

}

class PolishNotation {

	public PilhaCaractere stack = new PilhaCaractere();
	public String naoConvertida;
	public String convertida = "";

	public String converter() {
		for (int j = 0; j < naoConvertida.length(); j++) {
			char caractereAtual = naoConvertida.charAt(j);
			switch (caractereAtual) {
			case '+':
			case '-':
				prioridade(caractereAtual, 1);
				break;
			case '*':
			case '/':
				prioridade(caractereAtual, 2);
				break;
			case '(':
				stack.empilhar(new Caractere(caractereAtual));
				break;
			case ')':
				pegarIncremento(caractereAtual);
				break;
			default:
				convertida = convertida + caractereAtual;
				break;
			}
		}
		while (!stack.pilhaVazia()) {
			convertida = convertida + stack.desempilhar().getLetra();
		}
		return convertida;
	}

	public void prioridade(char operador, int dever1) {
		while (!stack.pilhaVazia()) {
			char operadorTopo = stack.desempilhar().getLetra();
			if (operadorTopo == '(') {
				stack.empilhar(new Caractere(operadorTopo));
				break;
			} else {
				int dever2;
				if (operadorTopo == '+' || operadorTopo == '-')
					dever2 = 1;
				else
					dever2 = 2;
				if (dever2 < dever1) {
					stack.empilhar(new Caractere(operadorTopo));
					break;
				} else
					convertida = convertida + operadorTopo;
			}
		}
		stack.empilhar(new Caractere(operador));
	}

	public void pegarIncremento(char ch) {
		int verificador = 0;
		while (!stack.pilhaVazia() && verificador == 0) {
			char atual = stack.desempilhar().getLetra();
			if (atual == '(')
				verificador = 1;
			else
				convertida = convertida + atual;
		}
	}

	public String transformar(String expressao) {

		String equacao;
		naoConvertida = expressao.replaceAll("\\s", "");
		equacao = converter();
		String saida = "";

		for (int i = 0; i < equacao.length(); i++) {
			saida += equacao.charAt(i) + " ";
		}

		return saida;

	}

}

class Caractere {

	private char letra;

	Caractere() {
		letra = ' ';
	}

	Caractere(char l) {
		letra = l;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char l) {
		letra = l;
	}
}


class CelulaCaractere {

	Caractere item; // corresponde ao item armazenado na célula da pilha.
	CelulaCaractere proximo; // referência à próxima célula de uma pilha.

	CelulaCaractere() {
		item = new Caractere();
		proximo = null;
	}

	// Construtor que inicializa o item com o valor passado através do parâmetro l
	// desse método; e o atributo que indica a próxima célula da pilha com null.
	CelulaCaractere(char l) {
		item = new Caractere(l);
		proximo = null;
	}
}

class PilhaCaractere {

	private CelulaCaractere fundo; // referência à célula que está no fundo da pilha. Essa célula é utilizada
									// apenas para controle.
	private CelulaCaractere topo; // referência à célula que está no topo da pilha.

	// Construtor que cria uma pilha "vazia" inicializando a célula do fundo da
	// pilha e os atributos de controle da pilha (fundo e topo).
	PilhaCaractere() {

		CelulaCaractere aux = new CelulaCaractere();

		fundo = aux;
		topo = aux;
	}

	// Insere o item, passado como parâmetro para esse método, no topo da pilha.
	public void empilhar(Caractere l) {
		// inserção da nova célula no topo da pilha.
		CelulaCaractere aux = new CelulaCaractere();
		aux.proximo = topo;
		aux.item = l;

		// atualização do atributo de controle topo.
		topo = aux;
	}

	// Retira o item que está no topo da pilha. Se a pilha estiver vazia, esse
	// método deve retornar null; caso contrário, esse método deve retornar o item
	// retirado da pilha.
	public Caractere desempilhar() {
		// se a pilha estiver vazia, esse método deve retornar null.
		Caractere aux = null;

		if (!pilhaVazia()) {
			// aux aponta para o item da pilha que será retornado/desempilhado, ou seja, o
			// item do topo.
			aux = topo.item;

			// atualização do atributo de controle topo.
			topo = topo.proximo;

		}
		return (aux);
	}

	// Verifica se a pilha está vazia. Em caso afirmativo, retorna true e em caso
	// negativo retorna false.
	public Boolean pilhaVazia() {
		// se a pilha apresentar apenas a célula sentinela, ela está vazia.
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