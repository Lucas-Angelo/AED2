public class Celula {
	
	Inteiro item;
	Celula proximo;
	
	public Celula(Inteiro i) {
		item = i;
		proximo = null;
	}
	
	public Celula() {
		item = new Inteiro(0);
		proximo = null;
	}
}
