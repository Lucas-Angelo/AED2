
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class VetoresProvasEAlunos {

    public static void main(String[] args) throws IOException {
        
        int notas = 2; // padrão: 8
        int alunos = 2; // padrão: 10
        
        int vetorGabarito[] = new int[notas];
        float PercAcertosAlunos[] = new float [alunos];
        int vetorResAluno[][] = new int[alunos][notas];
        float numAprovados = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Preencha o gabarito:");
        for(int i=0;i<notas;i++){
            System.out.printf("Questão %d, digite o número da resposta: ", i+1);
            vetorGabarito[i] = Integer.parseInt(entrada.readLine());
        }
        
        for(int i=0; i<alunos; i++){
            System.out.printf("Aluno %d:\n", i+1);
            for(int j=0; j<notas; j++){
                System.out.printf("Digite a resposta marcada %d: ", j+1);
                vetorResAluno[i][j] = Integer.parseInt(entrada.readLine());
            }
        }
        
        float acertos=0;
        for(int i=0;i<alunos;i++){
            for(int j=0;j<notas;j++){
                if(vetorResAluno[i][j] == vetorGabarito[j]){
                    ++acertos;
                }
            }
            PercAcertosAlunos[i] = (float) ((acertos/(notas*1.0)) * 100);
            acertos=0;
            if(PercAcertosAlunos[i] >= 62.5)
                ++numAprovados;
        }
        
        for(int i=0;i<alunos;i++){
            System.out.printf("\nO percentual de acertos do aluno %d é: %.2f%%", i+1, PercAcertosAlunos[i]);
        }
        
        System.out.printf("\n\nO percentual de aprovação da turma é: %.2f%%\n", (numAprovados/alunos)*100);
        
    }
    
}
