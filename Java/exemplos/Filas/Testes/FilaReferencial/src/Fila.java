public class Fila {
	
	private Celula frente;
	private Celula tras;
	
	public Fila() {
		Celula sentinela;
		
		sentinela = new Celula();
		frente = sentinela;
		tras = sentinela;
	}
}
