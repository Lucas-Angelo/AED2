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

		Lista minhaLista = new Lista(20);
		Inteiro elemento;

		elemento = new Inteiro(20);
		minhaLista.inserir(elemento, 0); // 20
		elemento = new Inteiro(10);
		minhaLista.inserir(elemento, 1); // 10 20
		elemento = new Inteiro(15);
		minhaLista.inserir(elemento, 2); // 10 15 20
		elemento = new Inteiro(10);
		minhaLista.inserir(elemento, 3); // 10 10 15 20

		minhaLista.quest();

		minhaLista.imprimir(); // 10 15 20
	}

}
