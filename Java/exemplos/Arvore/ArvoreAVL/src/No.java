public class No {

	Inteiro item;
	No esquerda;
	No direita;
	private int altura;

	public No(Inteiro item) {
		this.item = item;
		this.esquerda = this.direita = null;
		this.altura = 0;
	}

	public No() {
		item = new Inteiro(0);
		esquerda = direita = null;
		this.altura = 0;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura() {
		int alturaEsquerda;
		int alturaDireita;

		if (esquerda != null)
			alturaEsquerda = esquerda.getAltura();
		else
			alturaEsquerda = -1;

		if (direita != null)
			alturaDireita = direita.getAltura();
		else
			alturaDireita = -1;

		if (alturaEsquerda >= alturaDireita)
			this.altura = alturaEsquerda + 1;
		else
			this.altura = alturaDireita + 1;
	}

	public int getFatorBalanceamento() {
		int alturaEsquerda;
		int alturaDireita;

		if (esquerda != null)
			alturaEsquerda = esquerda.getAltura();
		else
			alturaEsquerda = -1;

		if (direita != null)
			alturaDireita = direita.getAltura();
		else
			alturaDireita = -1;

		return (alturaEsquerda - alturaDireita); // O balanceamento e a diferenca entre a altura da esq e dir
	}

}
