
public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ABB minhaArvore = new ABB();
		Inteiro elemento;

		elemento = new Inteiro(12);
		minhaArvore.inserir(elemento);
		elemento = new Inteiro(16);
		minhaArvore.inserir(elemento);
		elemento = new Inteiro(15);
		minhaArvore.inserir(elemento);
		elemento = new Inteiro(8);
		minhaArvore.inserir(elemento);
		elemento = new Inteiro(4);
		minhaArvore.inserir(elemento);
		elemento = new Inteiro(20);
		minhaArvore.inserir(elemento);

		minhaArvore.imprimirEmOrdem(); // 4 - 8 - 12 - 15 - 16 - 20

		if (minhaArvore.pesquisar(15) != null)
			System.out.println("A chave 15 foi encontrada na árvore."); // Essa mensagem deve ser exibida
		else
			System.out.println("A chave 15 não foi encontrada na árvore.");

		if (minhaArvore.pesquisar(7) != null)
			System.out.println("A chave 7 foi encontrada na árvore.");
		else
			System.out.println("A chave 7 não foi encontrada na árvore."); // Essa mensagem deve ser exibida
	}

}
