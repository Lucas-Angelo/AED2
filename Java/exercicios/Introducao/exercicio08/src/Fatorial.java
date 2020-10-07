
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class Fatorial {

    public static void main(String[] args) throws IOException {
        
        int N;
        BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.print("Digite o número que deseja o fatorial: ");
        N = Integer.parseInt(entrada.readLine());
        
        System.out.printf("\nO fatorial de %d é: %d\n", N, recursividade(N));
    }
    
    public static int recursividade(int num){
        if(num==0)
            return 1;
        return num * recursividade(num-1);
    }
    
}
