public class Celula {

	ContaCorrente item;
	Celula proximo;

	public Celula(ContaCorrente conta) {
		this.item = conta;
		this.proximo = null;
	}

	public Celula() {
		this.item = new ContaCorrente();
		this.proximo = null;
	}

}
