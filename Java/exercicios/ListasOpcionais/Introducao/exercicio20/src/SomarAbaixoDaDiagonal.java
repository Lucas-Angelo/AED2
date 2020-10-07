/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
import java.io.*;

public class SomarAbaixoDaDiagonal {

    public static void main(String[] args) throws IOException {
        
        final int TAM = 2;
        float matriz[][] = new float[TAM][TAM];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0;i<TAM;i++){
            System.out.printf("Linha %d.\n", i+1);
            for(int j=0;j<TAM;j++){
                System.out.printf("Coluna %d, digite um valor: ", j+1);
                matriz[i][j] = Float.parseFloat(entrada.readLine());
            }
        }
        
        float totalDiag = 0;
        
        System.out.println("Matriz: ");
        for(int i=0;i<TAM;i++){
            for(int j=0;j<TAM;j++){
                System.out.print(matriz[i][j] + " ");
                if(i==j){
                    totalDiag += matriz[i][j];
                }
            }
            System.out.println(" ");
        }
        
        System.out.printf("\nA soma dos elementos abaixo da diagonal é: %.2f.\n", somarElementos(matriz, totalDiag));
        
        
    }
    
    private static float somarElementos(float matriz[][], float totalDiag){
        final int TAM = 2;
        int i, j;
        float somaAcima=0, total=0;
        for(i=0;i<TAM;i++){
            for(j=0;j<TAM;j++){
                total += matriz[i][j];
            }
        }
        for(i=0;i<TAM;i++){
            for(j=i+1;j<TAM;j++){
                somaAcima += matriz[i][j];
            }
        }
        return total-(somaAcima+totalDiag);
    }
    
}
