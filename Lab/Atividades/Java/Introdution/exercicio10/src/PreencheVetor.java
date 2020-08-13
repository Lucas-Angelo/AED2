
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class PreencheVetor {

    public static void main(String[] args) throws IOException {
        
        int vetorInt[] = new int[6];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0;i<vetorInt.length;i++){
            System.out.print("Digite um número: ");
            vetorInt[i] = Integer.parseInt(entrada.readLine());
        }
        
        int somatorio=0;
        System.out.print("Os números pares digitados foram: ");
        for(int i=0;i<vetorInt.length;i++){
            if(vetorInt[i]%2==0){
                System.out.printf("%d ", vetorInt[i]);
                somatorio+=vetorInt[i];
            }
        }
        System.out.printf("\nA soma dos números pares é: %d\n", somatorio);
        
        int quant=0;
        System.out.print("Os números ímpares digitados foram: ");
        for(int i=0;i<vetorInt.length;i++){
            if(vetorInt[i]%2!=0){
                System.out.printf("%d ", vetorInt[i]);
                quant++;
            }
        }
        System.out.printf("\nA quantidade de números ímpares é: %d\n", quant);
        
    }
    
}
