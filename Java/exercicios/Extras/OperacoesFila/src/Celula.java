public class Celula {

	Inteiro item;
	Celula proximo;

	public Celula(Inteiro item) {
		this.item = item;
		this.proximo = null;
	}

	public Celula() {
		this.item = new Inteiro(0);
		this.proximo = null;
	}
}
