package exercicio01;

import java.util.Scanner;
/* import java.io.*; */

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class MyName {
    public static void main(String[] args) {
        
        /*BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); */
        Scanner entrada = new Scanner(System.in); // Cria variável com funções de escaner, igual do BufferedReader
        String str; // Declara a variável str do tipo string
        
        System.out.print("Digite seu nome: "); // Imprime na tela
        str = entrada.nextLine(); // Lê uma minha string
        /* str= entrada.readLine(); */
        System.out.println("Bem-vindo " + str + "!"); // Imprime na tela
        
    }
}
