public class Fila {

	private int filaInt[];
	private int frente;
	private int tras;
	
	public Fila(int tamanho) {
		
		filaInt = new int[tamanho];
		frente = 0;
		tras = 0;
		
	}
	
	public Fila() {
		
		filaInt = new int[50];
		frente = 0;
		tras = 0;
		
	}
	
	public void enfileirar(int novo) {
		
		if( !filaCheia() ) {
			filaInt[tras % filaInt.length] = novo;
			tras++;
		}
		
	}
	
	public int desenfileirar() {
		
		int retirado = -1;
		
		if ( !filaVazia() ) {
			
			retirado = filaInt[frente%filaInt.length];
			frente++;
			
		}
		
		return frente;
		
	}
	
	public boolean filaVazia () {
		
		if(frente == tras)
			return true;
		else
			return false;
		
	}
	
	public boolean filaCheia () {
		
		if ( ((tras+1)%filaInt.length) ==  (frente%filaInt.length) )
			return true;
		else
			return false;
		
	}
	
}
