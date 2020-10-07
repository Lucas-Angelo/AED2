/**
 * 
 */
package com.code;
import com.methods.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class Menu {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[] {10, 20, 25, 63, 96, 57};
		
		System.out.println("Menu de opcoes:");
		System.out.println("1 - Para Selection");
		System.out.println("2 - Para Bubble");
		System.out.println("3 - Para Insertion");
		System.out.println("4 - Para Shell");
		System.out.println("5 - Para Merge");
		System.out.println("6 - Para Heap");
		System.out.println("7 - Para Quick");
		int opcao = Integer.parseInt(in.readLine());
		
		switch(opcao) {
			case 1:
				array = Selection.sort(array, array.length);
				System.out.println("Ordem quadratica: O(n²)");
				System.out.print("Ordenado: ");
				for(int i=0;i<array.length;i++) {
					System.out.printf(array[i]+" ");
				}
				break;
			case 2:
				array = Bubble.sort(array, array.length);
				for(int i=0;i<array.length;i++) {
					System.out.printf(array[i]+" ");
				}
				break;
			case 3:
				array = Insertion.sort(array, array.length);
				for(int i=0;i<array.length;i++) {
					System.out.printf(array[i]+" ");
				}
				break;
			case 4:
				array = Shell.sort(array, array.length);
				for(int i=0;i<array.length;i++) {
					System.out.printf(array[i]+" ");
				}
				break;
			case 5:
				array = Merge.sort(array, 0, array.length-1);
				for(int i=0;i<array.length;i++) {
					System.out.printf(array[i]+" ");
				}
				break;
			case 6:
				array = Heap.sort(array, array.length);
				for(int i=0;i<array.length;i++) {
					System.out.printf(array[i]+" ");
				}
				break;
			case 7:
				array = Quick.sort(array, array.length);
				for(int i=0;i<array.length;i++) {
					System.out.printf(array[i]+" ");
				}
				break;
			default:
				System.out.println("Opcao nao encontrada");
		}
		
	}

}
