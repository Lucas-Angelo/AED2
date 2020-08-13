
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class MenuOpcoes {

    public static void main(String[] args) throws IOException {
        
        int opcao;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("Menu de opções");
        System.out.println("1. Soma de dois números");
        System.out.println("2. Raiz quadrada de um número");
        System.out.print("Digite o número da opção desejada: ");
        opcao = Integer.parseInt(entrada.readLine());
        
        if(opcao != 1 && opcao != 2){
            System.out.println("Digite uma opção válida!");
        }
        else {
            if(opcao == 1){
                double num1, num2;
                System.out.print("Digite um número: ");
                num1 = Double.parseDouble(entrada.readLine());
                System.out.print("Digite outro número: ");
                num2 = Double.parseDouble(entrada.readLine());
                System.out.printf("\nA soma é: %.2f\n", num1+num2);
            }
            else{
                System.out.print("Digite um número: ");
                double num = Double.parseDouble(entrada.readLine());
                
                System.out.printf("\nA raiz quadrada é: %.2f\n", Math.sqrt(num));
                
            }
        }
        
    }
    
}
