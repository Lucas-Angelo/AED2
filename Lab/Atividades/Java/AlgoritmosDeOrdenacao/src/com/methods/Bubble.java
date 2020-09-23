/**
 * 
 */
package com.methods;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class Bubble {

	/**
	 * @param args
	 */
	public static int[] sort(int[] array, int n) {
		return method(array, n);
	}
	
	private static int[] method(int[] array, int n) {
		for (int i = (n - 1); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
	               			
					int temp = array[j];
	      				array[j] = array[j+1];
	      				array[j+1] = temp;
				}
			}
		}
		return array;
	}

}
