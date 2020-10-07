
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class TransportaVetor {

    public static void main(String[] args) throws IOException {
        
        String vetorA[] = new String[15];
        String vetorB[] = new String[vetorA.length];
        int tam = vetorA.length-1;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        for(int i=0;i<vetorA.length;i++){
            System.out.printf("Digite o valor da posição %d: ", i+1);
            vetorA[i] = entrada.readLine();
        }
        
        for(int i=0;i<vetorA.length;i++){
            vetorB[tam] = vetorA[i];
            tam--;
        }
        
        System.out.print("Vetor A: ");
        for(int i=0;i<vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.print("\nVetor B: ");
        for(int i=0;i<vetorA.length;i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("\n");
        
        
    }
    
}
