/**
 * 
 */
package com.methods;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class Shell {

	/**
	 * @param args
	 */
	public static int[] sort(int[] array, int n) {
		return method(array, n);
	}
	
	private static int[] method(int[] array, int n) {
		int h = 1;

		do { 
			h = (h * 3) + 1; 
		} while (h < n);

		do {
	        	h /= 3;
	         	for(int inicio = 0; inicio < h; inicio++) {
	            		insercao(array, n, inicio, h);
	         	}
	      	} while (h != 1);
		
		return array;
	}
	
	private static void insercao(int[] array, int n, int inicio, int h){

		for (int i = (h + inicio); i < n; i+=h) {
	        	int tmp = array[i];
	         	int j = i - h;
	         	while ((j >= 0) && (array[j] > tmp)) {
	            		array[j + h] = array[j];
	            		j-=h;
	         	}
	         	array[j + h] = tmp;
	      	}
	}

}
