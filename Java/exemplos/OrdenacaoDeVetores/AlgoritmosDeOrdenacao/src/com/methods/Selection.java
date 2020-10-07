/**
 * 
 */
package com.methods;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class Selection {

	/**
	 * @param args
	 */
	public static int[] sort(int[] array, int n) {
		return method(array, n);
	}
	
	private static int[] method(int[] array, int n) {
		int comparacoes=0, trocas=0;
		for (int i = 0; i < (n - 1); i++) {
	        	int menor = i;
	         	for (int j = (i + 1); j < n; j++) {
	            		if (array[menor] > array[j]) {
	               			menor = j;
	               			trocas++; //Desconsidera
	            		}
	            	comparacoes++; //Desconsidera
	         	}
	      		int temp = array[i];
	      		array[i] = array[menor];
	      		array[menor] = temp;
	      	}
		System.out.printf("Trocas: %d\nComparacoes: %d\n", trocas, comparacoes);
		return array;
	}

}
