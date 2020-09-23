/**
 * 
 */
package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class PercorreVetorComRecursividade {

	public static int cont=0;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[] vetor = { 1, 8, 34, 67, 9, 6, 78, 12, 56, 41, 90 };
		Arrays.sort(vetor);
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("O vetor: %s", Arrays.toString(vetor)); // Printar o vetor
		
		System.out.printf("\nDigite o número que deseja verificar a posição dele no vetor: ");
		int procurado = Integer.parseInt(entrada.readLine());
		
		int posicao = detectarPosicaoPorBuscaBinaria(vetor, 0, vetor.length-1, procurado);
		
		if(posicao != -1)
			System.out.printf("\nExiste no vetor.\nA posição é: %d", detectarPosicaoPorBuscaBinaria(vetor, 0, vetor.length-1, procurado)); // Achar a posição
		else
			System.out.println("\nNão existe no vetor.");
	}

	private static int detectarPosicaoPorBuscaBinaria(int[] vetor, int menor, int maior, int procurado) {
		int meio = (maior + menor) / 2;
		int numDoMeio = vetor[meio];

		if (menor > maior) // Chegou a fim e não achou
			return -1;
		else if(numDoMeio == procurado) {  // Achou
			return meio;
			cont++;
		}
		else if (numDoMeio < procurado)
			return detectarPosicaoPorBuscaBinaria(vetor, meio+1, maior, procurado); // Caso esteja acima
		else
			return detectarPosicaoPorBuscaBinaria(vetor, menor, meio-1, procurado); // Caso esteja abaixo
	}

}
