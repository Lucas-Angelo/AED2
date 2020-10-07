/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
import java.io.*;

public class DivisaoPelaDiagonalPrincipal {

    public static void main(String[] args) throws IOException {
        
        int matriz[][] = new int[4][4];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0;i<4;i++){
            System.out.printf("Linha: %d.\n", i+1);
            for(int j=0;j<4;j++){
                System.out.printf("Coluna %d, digite o valor: ", j+1);
                matriz[i][j] = Integer.parseInt(entrada.readLine());
            }
        }
        
        System.out.println("\nMatriz original: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        int diagPrinc[] = new int[4];
        int cont=0;
        
        for(int i=0; i<4; i++){
            for(int j=0;j<4;j++){
                if(i==j){
                    diagPrinc[cont] = matriz[i][j];
                    cont++;
                }
            }
        }
        System.out.print("Diagonal Principal: ");
        for(int i=0;i<4;i++){
            System.out.print(diagPrinc[i] + " ");
        }
        
        int matrizRes[][] = new int[4][4];
        
        for(int i=0; i<4; i++){
            for(int j=0;j<4;j++){
                matrizRes[i][j] = matriz[i][j]/diagPrinc[i];
            }
        }
        
        System.out.println("\n\nMatriz resultante: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrizRes[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
