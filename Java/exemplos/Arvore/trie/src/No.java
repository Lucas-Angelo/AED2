public class No {

	char elemento;
	private int tamanho = 26;
	No[] proximo;
	boolean folha;
		   
	public No (){
		this(' ');
	}

	public No (char elemento){
		this.elemento = elemento;
		proximo = new No[tamanho];
		for (int i = 0; i < tamanho; i++) 
			proximo[i] = null;
		folha = false;
	}

	public int funcaoHash (char x){
		return (int) (x - 'A');
	}	
}
