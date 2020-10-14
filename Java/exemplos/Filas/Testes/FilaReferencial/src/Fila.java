public class Fila {
	
	private Celula frente;
	private Celula tras;
	
	public Fila() {
		Celula sentinela;
		
		sentinela = new Celula();
		frente = sentinela;
		tras = sentinela;
	}
	
	public boolean filaVazia () {
		
		boolean resp;
		
		if(frente == tras)
			resp = true;
		else
			resp = false;
		
		return resp;
	}
	
	public void enfileirar(Inteiro novo) {
		
		Celula novaCelula;
		
		novaCelula = new Celula(novo);
		tras.proximo = novaCelula;
		tras = novaCelula; // ou: tras = tras.proximo;
		
	}
	
	public Inteiro desenfileirar() {
	
		Celula aux;
		
		aux = frente.proximo;
		frente.proximo = aux.proximo;
		aux.proximo = null;
		if(aux==tras)
			tras = frente;
		return (aux.item);
	}
	
	public void imprimir() {
		
		Celula aux;
		
		aux = frente.proximo;
		while (aux != null) {
		
			aux.item.imprimir();
			aux = aux.proximo;
		}
	}
	
}
