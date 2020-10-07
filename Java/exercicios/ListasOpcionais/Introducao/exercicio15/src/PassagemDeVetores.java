/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */

import java.io.*;
        
public class PassagemDeVetores {
    
    protected static void exibeVetor(int vet[]){
        
        final int TAM = 10;
        
        System.out.print("Vetor final: ");
        for(int i=0;i<TAM;i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println(" ");
    }
    
    protected static int multiplicaVetores(int vet1[], int vet2[]) {
        
        final int TAM = 10;
        
        int vet3[] = new int[TAM];
        
        for(int i=0;i<TAM;i++){
            vet3[i] = vet1[i] * vet2[i];
        }
        
        exibeVetor(vet3);       
        
        
        return 0;
    }
    
    protected static void preencheVetores() throws IOException{
        
        final int TAM = 10;
        
        int vet1[] = new int[TAM];
        int vet2[] = new int[TAM];
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Preencha o vetor 1:");
        for(int i=0;i<TAM;i++){
            System.out.printf("Digite o valor da posição %d: ", i+1);
            vet1[i] = Integer.parseInt(entrada.readLine());
        }
        
        System.out.println("Preencha o vetor 2:");
        for(int i=0;i<TAM;i++){
            System.out.printf("Digite o valor da posição %d: ", i+1);
            vet2[i] = Integer.parseInt(entrada.readLine());
        }
        
        multiplicaVetores(vet1, vet2);
        
    }
    
    public static void main(String[] args) throws IOException {
        
        preencheVetores();
        
    }
    
}
