
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class Soma {

    public static void main(String[] args) throws IOException {
        
        int num1, num2, soma; // Declaras as variávies inteiras para o cálculo
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); // Criar o objeto com funções do BufferedReader
        String str; // String para receber as entradas
        
        System.out.print("Digite um número: ");
        str = entrada.readLine();
        num1 = Integer.parseInt(str); // Converte o número digitado(que está em string), para inteiro e salva
        
        System.out.print("Digite outro número: ");
        str = entrada.readLine();
        num2 = Integer.parseInt(str); // Converte o número digitado(que está em string), para inteiro e salva

        soma = num1+ num2; // Soma
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
    }
    
}
