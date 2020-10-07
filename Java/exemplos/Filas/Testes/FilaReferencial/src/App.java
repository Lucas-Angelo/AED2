public class App {

	public static void main(String[] args) {

		Fila minhaFila = new Fila();
		Inteiro elemento = new Inteiro(19);
		
		elemento = new Inteiro(19);
		minhaFila.enfileirar(elemento);
		
		elemento = new Inteiro(11);
		minhaFila.enfileirar(elemento);
		
		elemento = minhaFila.desenfileirar();
		System.out.println(elemento.getValor());
	}

}
