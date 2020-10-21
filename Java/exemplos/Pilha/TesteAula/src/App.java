/**
 * 
 */

/**
 * @author Lucas Ângelo O. M. Rocha github.com/Lucas-Angelo
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pilha minhaPilha;
		Inteiro elemento;
		minhaPilha = new Pilha();

		elemento = new Inteiro(15);
		minhaPilha.empilhar(elemento);

		elemento = new Inteiro(10);
		minhaPilha.empilhar(elemento);

		// System.out.println(minhaPilha.desempilhar());

		elemento = new Inteiro(20);
		minhaPilha.empilhar(elemento);

		// minhaPilha.imprimir();
	}

}
