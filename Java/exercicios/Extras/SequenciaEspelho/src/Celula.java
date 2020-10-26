public class Celula {

	Inteiro item;
	Celula proximo;

	public Celula() { // Criador da Celula Sentinela
		this.item = new Inteiro(); // Usando o construtor sem parâmetro do Inteiro, daí o item da sentinela vai
									// valer 0
		this.proximo = null; // Nâo existe ainda um elemento próximo pra apontar
	}

	public Celula(String elemento) {
		this.item = new Inteiro(elemento);
		this.proximo = null;
	}

}
