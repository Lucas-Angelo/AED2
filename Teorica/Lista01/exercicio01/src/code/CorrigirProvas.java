/**
 * 
 */
package code;

import java.io.*;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class CorrigirProvas {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
        int notas = 8; // padrão: 8
        int alunos = 10; // padrão: 10
        
        int vetorGabarito[] = new int[notas]; // Onde ira ficar armazenada as respostas corretas para comparar
        int vetorNumAluno[] = new int[alunos]; // Armazena o numero de cada aluno
        int vetorResAluno[][] = new int[alunos][notas]; // Respostas marcadas por cada aluno
        int vetorNotasAluno[] = new int[alunos]; // Quantidade de questoes acertadas de cada aluno
        float porcAprovacao; // Numero de alunos aprovados sobre total de alunos
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        /* Preencher o gabarito */
        System.out.println("Preencha o gabarito:");
        for(int i=0;i<notas;i++){
            System.out.printf("Questão %d, digite o número da resposta: ", i+1);
            vetorGabarito[i] = Integer.parseInt(entrada.readLine());
        }
        
        /* Preencher as respostas dos alunos */
        for(int i=0; i<alunos; i++){
        	System.out.printf("\nO numero do aluno: ");
        	vetorNumAluno[i] = Integer.parseInt(entrada.readLine());
            for(int j=0; j<notas; j++){
                System.out.printf("Digite a resposta marcada %d: ", j+1);
                vetorResAluno[i][j] = Integer.parseInt(entrada.readLine());
            }
        }
        
        /* Encontrar quantas questoes cada aluno acertou, de acordo com o gabarito e suas respostas */
        int acertos=0;
        for(int i=0;i<alunos;i++){
            for(int j=0;j<notas;j++){
                if(vetorResAluno[i][j] == vetorGabarito[j]){ // Verifica se a nota do aluno em cada questao, eh igual a do gabarito
                    ++acertos;
                }
            }
            vetorNotasAluno[i]=acertos;
            acertos=0;

        }
        
        /* Calcular o porcentagem de provacao */
        int aprovados=0;
        for(int i=0;i<alunos;i++) {
        	if(vetorNotasAluno[i]>=5) {
        		aprovados++;
        	}
        }
        porcAprovacao = (float) (((aprovados*1.0)/(alunos*1.0))*100.0);
        
        System.out.println();
        
        /* Printa o resultados */
        for(int i=0;i<alunos;i++) {
        	System.out.printf("Aluno numero %d, obteve nota: %d/%d\n", vetorNumAluno[i], vetorNotasAluno[i], notas);
        }
        
        System.out.println();
        
        System.out.printf("A porcentagem de aprovacao foi de: %.2f%%\n", porcAprovacao);

	}

}
