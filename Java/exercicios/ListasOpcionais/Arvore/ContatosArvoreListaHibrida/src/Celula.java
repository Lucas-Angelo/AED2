public class Celula {

	Contato item;
	Celula proximo;

	public Celula(Contato conta) {
		this.item = conta;
		this.proximo = null;
	}

	public Celula() {
		this.item = new Contato();
		this.proximo = null;
	}

}
