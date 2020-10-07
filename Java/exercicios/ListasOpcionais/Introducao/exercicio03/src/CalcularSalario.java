
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class CalcularSalario {

    public static void main(String[] args) throws IOException {
        
        double salario;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        System.out.print("Digite seu salário: ");
        salario = Float.parseFloat(entrada.readLine());
        
        if(salario < 0){
            System.out.println("Salário inválido!");
        }
        else{
            if(salario <= 1200.00){
                System.out.printf("\nO seu novo salário é: R$%.2f\n", salario*1.10);
            }
            else{
                System.out.printf("\nO seu novo salário é: R$%.2f\n", salario*1.05);
            }
        }
        
    }
    
}
