import java.io.BufferedReader;
import java.io.IOException;
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
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Pilha minhaPilha[] = new Pilha[100];
		Caractere aux;
//		aux = new Caractere('a');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere('+');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere('(');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere('b');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere('*');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere('c');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere(')');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere('-');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere('2');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere('-');
//		minhaPilha.empilhar(aux);
//		aux = new Caractere('a');
//		minhaPilha.empilhar(aux);

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
				System.out.println("\ncorreto");
			else
				System.out.println("\nincorreto");

			System.out.printf("%d | %d \n", abre, fecha);
			abre = 0;
			fecha = 0;
		}

	}

}
