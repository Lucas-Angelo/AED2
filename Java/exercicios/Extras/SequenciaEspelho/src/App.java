import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Lucas Ângelo O. M. Rocha github.com/Lucas-Angelo
 */
public class App {

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
