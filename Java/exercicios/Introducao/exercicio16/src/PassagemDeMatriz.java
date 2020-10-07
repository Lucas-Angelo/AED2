/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
import java.io.*;

public class PassagemDeMatriz {
    
    protected static void exibeVetor(int vetor[]){
        
        int verif=0;
        
        for(int i=0;i<4;i++){
            if(vetor[i]>10)
                verif++;
        }
        
        if(verif==0){
            System.out.println("Nenhuma posição do vetor acima de 10.");
        }
        else{
            System.out.print("Valores e posições com elementos acima do valor 10:\n");
            for(int i=0;i<4;i++){
                if(vetor[i]>10)
                    System.out.printf("Valor %d, posição: %d\n", vetor[i], i+1);
            }
        }
        
    }
    
    protected static void preencheVetor(int matriz[][]){
        
        int vetor[] = new int[4];
        
        int somatorio=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                somatorio+=matriz[i][j];
            }
            vetor[i]=somatorio;
            somatorio=0;
        }
        
        exibeVetor(vetor);
        
    }
    
    protected static void preencheMatriz() throws IOException {
        
        final int LINHAS=4; // 4
        final int COLUNAS=5; // 5
        
        int matriz[][] = new int[LINHAS][COLUNAS];
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        for(int i=0;i<LINHAS;i++){
            System.out.printf("Preenchendo linha %d\n", i+1);
            for(int j=0;j<COLUNAS;j++){
                do{
                    System.out.printf("Coluna %d, digite o valor: ", j+1);
                    matriz[i][j] = Integer.parseInt(entrada.readLine());
                    if(matriz[i][j] <= 0){
                        System.out.println("Digite apenas valores positivos não nulos!");
                    }
                } while (matriz[i][j] <= 0);
            }
        }
        
        for(int i=0;i<LINHAS;i++){
            for(int j=0;j<COLUNAS;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        preencheVetor(matriz);
        
    }

    public static void main(String[] args) throws IOException {
        
        preencheMatriz();
        
    }
    
}
