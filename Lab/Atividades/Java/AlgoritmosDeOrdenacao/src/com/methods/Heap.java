/**
 * 
 */
package com.methods;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class Heap {

	/**
	 * @param args
	 */
	public static int[] sort(int[] array, int n) {
		return method(array, n);
	}
	
	private static int[] method(int[] array, int n) {

		// Criando outro vetor, com todos os elementos do vetor anterior reposicionados (uma posição a frente)
		// de forma a ignorar a posição zero	    
	      	int[] tmp = new int[n + 1];
	      	for(int i = 0; i < n; i++) {
	        	tmp[i+1] = array[i];
	      	}
	      	array = tmp;

	      	//Contrução do heap
	      	for(int tamHeap = 2; tamHeap <= n; tamHeap++) {
	        	constroi(array, tamHeap);
	      	}

	      	//Ordenação propriamente dita
	      	int tamHeap = n;
	      	while(tamHeap > 1) {
	        	troca(array, 1, tamHeap--);
	         	reconstroi(array, tamHeap);
	      	}

	      	//Alterar o vetor para voltar à posição zero
	      	tmp = array;
	      	array = new int[n];
	      	for(int i = 0; i < n; i++) {
	        	array[i] = tmp[i+1];
	      	}
	      	
	      	return array;
	}

	private static void constroi(int[] array, int tamHeap) {

		for(int i = tamHeap; i > 1 && array[i] > array[i/2]; i /= 2) {
	        	troca(array, i, i/2);
	      	}
	}

	private static void reconstroi(int[] array, int tamHeap) {

		int i = 1;
	      	
		while(i <= (tamHeap/2)) {
	        	int filho = getMaiorFilho(array, i, tamHeap);
	        	if(array[i] < array[filho]) {
	            		troca(array, i, filho);
	            		i = filho;
	         	} else {
	            		i = tamHeap;
	         	}
	      	}
	}

	private static int getMaiorFilho(int[] array, int i, int tamHeap) {

		int filho;

		if (2*i == tamHeap || array[2*i] > array[2*i+1]) {
	        	filho = 2*i;
	      	} else {
	        	filho = 2*i + 1;
	      	}
	      	return filho;
	}
	
    private static void troca(int[] array, int i, int j) {
        int aux;

        aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }


}
