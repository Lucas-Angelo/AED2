public class App {

	public static void main(String[] args) {
		
		Fila minhaFila = new Fila(11);
		minhaFila.enfileirar(1);
		minhaFila.enfileirar(2);
		minhaFila.enfileirar(3);
		minhaFila.enfileirar(4);
		minhaFila.enfileirar(5);
		minhaFila.enfileirar(6);
		minhaFila.enfileirar(7);
		minhaFila.enfileirar(8);
		minhaFila.enfileirar(9);
		minhaFila.enfileirar(10);
		minhaFila.enfileirar(11);
		System.out.println(minhaFila.desenfileirar());
		System.out.println(minhaFila.desenfileirar());
		minhaFila.enfileirar(11);

	}

}
