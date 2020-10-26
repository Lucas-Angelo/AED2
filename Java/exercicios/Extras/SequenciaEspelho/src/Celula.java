public class Celula {

	Inteiro item;
	Celula proximo;

	public Celula() { // Criador da Celula Sentinela
		this.item = new Inteiro(); // Usando o construtor sem par�metro do Inteiro, da� o item da sentinela vai
									// valer 0
		this.proximo = null; // N�o existe ainda um elemento pr�ximo pra apontar
	}

	public Celula(String elemento) {
		this.item = new Inteiro(elemento);
		this.proximo = null;
	}

}
