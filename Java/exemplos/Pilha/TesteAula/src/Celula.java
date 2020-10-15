public class Celula {

	Inteiro item;
	Celula proximo;

	public Celula() {
		Inteiro item = new Inteiro(0);
		proximo = null;
	}

	public Celula(Inteiro item) {
		this.item = item;
		proximo = null;
	}

}
