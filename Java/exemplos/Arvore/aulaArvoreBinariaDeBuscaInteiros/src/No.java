public class No {

	Inteiro item;
	No esquerda;
	No direita;

	public No(Inteiro item) {
		this.item = item;
		esquerda = direita = null;
	}

	public No() {
		item = new Inteiro(0);
		esquerda = direita = null;
	}

}
