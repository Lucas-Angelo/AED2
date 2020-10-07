/**
 * 
 */
package com.methods;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class Insertion {

	/**
	 * @param args
	 */
	public static int[] sort(int[] array, int n) {
		return method(array, n);
	}
	
	private static int[] method(int[] array, int n) {
		for (int i = 1; i < n; i++) {
			int tmp = array[i];
	         	int j = i - 1;

	         	while ((j >= 0) && (array[j] > tmp)) {
	            		array[j + 1] = array[j];
	            		j--;
	         	}
	         	array[j + 1] = tmp;
	      	}
		return array;
	}

}
