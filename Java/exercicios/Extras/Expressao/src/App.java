import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

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