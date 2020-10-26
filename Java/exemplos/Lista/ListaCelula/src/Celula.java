public class Celula {

	Inteiro item;
	Celula proximo;

	public Celula(Inteiro elemento) {
		this.item = elemento;
		proximo = null;
	}

	public Celula() {
		item = new Inteiro(0);
		proximo = null;
	}

}
