
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class MediaDiagonalPrincipalMatriz {

    public static void main(String[] args) throws IOException {
        
        int matriz[][] = new int[3][3];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0;i<3;i++){
            System.out.printf("Linha %d\n", i+1);
            for(int j=0;j<3;j++){
                System.out.printf("Digite o valor da coluna %d: ", j+1);
                do{
                    matriz[i][j] = Integer.parseInt(entrada.readLine());
                    if(matriz[i][j] <= 0){
                        System.out.println("Digite apenas número positivos não nulos!");
                    }
                } while (matriz[i][j] <= 0);
            }
        }
        
        float somatorio=0, contador=0;
        System.out.println("Matriz: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j] + " ");
                if(i==j){
                    somatorio+=matriz[i][j];
                    ++contador;
                }
            }
            System.out.println(" ");
        }
        
        System.out.printf("\nA média dos elementos da diagonal principal é: %.1f\n", somatorio/contador);
        
    }
    
}
