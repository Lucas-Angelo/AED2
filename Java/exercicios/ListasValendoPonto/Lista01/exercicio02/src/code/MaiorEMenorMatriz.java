/**
 * 
 */
package code;

import java.io.*;

/**
 * @author Lucas �ngelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class MaiorEMenorMatriz {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
        int matriz[][] = new int[3][4];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0;i<3;i++){
            System.out.printf("Linha %d\n", i+1);
            for(int j=0;j<4;j++){
                do{
                	System.out.printf("Coluna %d. Digite o valor: ", j+1);
                    matriz[i][j] = Integer.parseInt(entrada.readLine());
                    if(matriz[i][j] <= 0){
                        System.out.println("Digite um n�mero positivo n�o nulo!");
                    }
                } while (matriz[i][j] <= 0);
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        int linhaMaior=0, colunaMaior=0;
        int linhaMenor=0, colunaMenor=0;
        
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                
                if(matriz[i][j]>=maior){
                    linhaMaior = i+1;
                    colunaMaior = j+1;
                    maior = matriz[i][j];
                }
                
                if(matriz[i][j]<=menor){
                    linhaMenor = i+1;
                    colunaMenor = j+1;
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.printf("\nO maior elemento da matriz �: %d.\nSua posi��o �: [%d,%d]\n", maior, linhaMaior, colunaMaior);
        System.out.printf("\nO menor elemento da matriz �: %d.\nSua posi��o �: [%d,%d]\n", menor, linhaMenor, colunaMenor);
        
        

	}

}
