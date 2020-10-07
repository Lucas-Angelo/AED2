/**
 * 
 */
package com.methods;

/**
 * @author Lucas �ngelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class Merge {

	/**
	* Algoritmo de ordena��o Mergesort.
	* @param int esq: in�cio do array a ser ordenado
	* @param int dir: fim do array a ser ordenado
	*/
	
	public static int[] sort(int[] array, int esq, int dir) {
		return method(array, esq, dir);
	}
	
	private static int[] method(int[] array, int esq, int dir) {
		if (esq < dir) {
	        	int meio = (esq + dir) / 2;
	        	method(array, esq, meio);
	        	method(array, meio + 1, dir);
	         	intercalar(array, esq, meio, dir);
	      	}
		return array;
	}

	/**
	* Algoritmo que intercala os elementos localizados entre as posi��es esq e dir
	* @param int esq: in�cio do array a ser ordenado
	* @param int meio: posi��o do meio do array a ser ordenado
	* @param int dir: fim do array a ser ordenado
	*/ 
	private static void intercalar(int[] array, int esq, int meio, int dir) {
		int n1, n2, i, j, k;
	
		//Definir tamanho dos dois subarrays
		n1 = meio - esq + 1;
		n2 = dir - meio;
	
		int[] a1 = new int[n1];
		int[] a2 = new int[n2];
	
		//Inicializar primeiro subarray
		for (i = 0; i < n1; i++) {
			a1[i] = array[esq + i];
		}
	
		//Inicializar segundo subarray
		for (j = 0; j < n2; j++) {
				a2[j] = array[meio + j + 1];
		}
	
		//Intercala��o propriamente dita
		for (i = j = 0, k = esq; (i < n1 && j < n2); k++) {
				if (a1[i] <= a2[j])
					array[k] = a1[i++];
				else
					array[k] = a2[j++];
		}
			
		if (i == n1)
			for (; k <= dir; k++) {
				array[k] = a2[j++];
			}
		else
			for (; k <= dir; k++) {
				array[k] = a1[i++];
			}
	}
	
}
