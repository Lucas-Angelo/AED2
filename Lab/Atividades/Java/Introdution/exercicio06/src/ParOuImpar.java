
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class ParOuImpar {

    public static void main(String[] args) throws IOException {
        
        int nums=0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.printf("Digite um número: ");
        nums += Integer.parseInt(entrada.readLine());
        System.out.printf("Digite outro número: ");
        nums += Integer.parseInt(entrada.readLine());
        
        if(nums%2==0){
            System.out.println("A soma é PAR");
        }
        else {
            System.out.println("A soma é ÍMPAR");
        }
    }
    
}
