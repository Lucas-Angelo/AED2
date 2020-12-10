public class No {

	char inicial;
	No esquerda;
	No direita;
	Lista listaContatos;

	public No(char letra) {
		this.inicial = letra;
		this.esquerda = direita = null;
		this.listaContatos = new Lista();
	}
}
