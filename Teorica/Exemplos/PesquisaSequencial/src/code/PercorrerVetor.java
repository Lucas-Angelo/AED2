/**
 * 
 */
package code;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class PercorrerVetor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vet = new int [10];
		int pesquisa;
		boolean encontrou = false;
		int i;
		
		for(i=0;i<10;i++)
			vet[i] = i*2;
		
		pesquisa = 8;
		
		for(i=0; ((i<10) && !encontrou); i++) 
			if(vet[i] == pesquisa)
				encontrou = true;
		
		if(encontrou)
			System.out.println("Elemento encontrado");
		else
			System.out.println("Elemento não encontrado");
	}

}
