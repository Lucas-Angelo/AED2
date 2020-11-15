import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

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
