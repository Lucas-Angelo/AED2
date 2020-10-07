/**
 * 
 */
package com.methods;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class Quick {

	/**
	 * @param args
	 * @return 
	 */
	
	public static int[] sort(int[] array, int n) {
		return method(array, 0, n - 1);
	}

	/**
	* Algoritmo de ordenação Quicksort.
	* @param int esq: início da partição a ser ordenada
	* @param int dir: fim da partição a ser ordenada
	 * @return 
	*/
	private static int[] method(int[] array, int esq, int dir) {
				
		int part;
		if (esq < dir){
			part = particao(array, esq, dir);
			method(array, esq, part - 1);
			method(array, part + 1, dir);
		}
		return array;
	}
					
	private static int particao(int[] array, int inicio, int fim) {
			
		int pivot = array[fim];
		int part = inicio - 1;
		for (int i = inicio; i < fim; i++) {
			if (array[i] < pivot) {
				part++;
				swap(array, part, i);
			}
		}
		part++;
		swap(array, part, fim);
		return (part);
	}
		
	private static void swap(int[] array, int i, int j) {
		      
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}


}
