public class Celula {

	Inteiro item;
	Celula anterior;
	Celula proximo;

	public Celula(Inteiro elemento) {
		this.item = elemento;
		proximo = anterior = null;
	}

	public Celula() {
		item = new Inteiro(0);
		proximo = anterior = null;
	}

}
