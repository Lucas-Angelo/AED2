
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class MediaAritmetica {

    public static void main(String[] args) throws IOException {
        
        float notas=0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        for(int i=0;i<3;i++){
            double nota;
            System.out.printf("Digite a nota %d: ", i+1);
            nota = Float.parseFloat(entrada.readLine());
            if(nota>=0 && nota<=10){
                notas += nota;
            }
            else{
                System.out.println("Digite uma nota entre 0 a 10!");
                i--;
            }
        }
        
        System.out.printf("\nA média aritmética das notas e: %.2f\n", notas/3);
        
        
    }
    
}
