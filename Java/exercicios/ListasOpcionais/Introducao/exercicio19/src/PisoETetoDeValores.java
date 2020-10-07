/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
import java.io.*;

public class PisoETetoDeValores {

    public static void main(String[] args) throws IOException {
        
        float num;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Digite um número: ");
        num = Float.parseFloat(entrada.readLine());
        
        System.out.printf("O teto é: %.2f.\n", calcularTeto(num));
        System.out.printf("O piso é: %.2f.\n", calcularPiso(num));
        
    }

    private static float calcularTeto(float num) {
        return (float) Math.ceil(num);
    }

    private static float calcularPiso(float num) {
        return (float) Math.floor(num);
    }
    
}
