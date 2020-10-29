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
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		Pilha minhaPilha[] = new Pilha[100];
//		Caractere aux;
//
//		int abre = 0, fecha = 0;
//
//		String str = new String();
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int numPilha = 0;
//		do {
//			str = in.readLine();
//
//			if (!str.equals("FIM")) {
//
//				minhaPilha[numPilha] = new Pilha();
//
//				for (int i = 0; i < str.trim().length(); i++) {
//
//					aux = new Caractere(str.charAt(i));
//					minhaPilha[numPilha].empilhar(aux);
//
//				}
//
//				numPilha++;
//			}
//
//		} while (!str.equals("FIM"));
//
//		for (int i = 0; i < numPilha; i++) {
//			abre += minhaPilha[i].verificarQuantidade('(');
//			fecha += minhaPilha[i].verificarQuantidade(')');
//
//			if (abre == fecha && abre >= 0 && fecha >= 0)
//				System.out.println("correto");
//			else
//				System.out.println("incorreto");
//
//			abre = 0;
//			fecha = 0;
//		}
//
//	}

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
