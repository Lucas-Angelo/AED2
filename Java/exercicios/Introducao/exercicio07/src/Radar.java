
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class Radar {

    public static void main(String[] args) throws IOException {
        
        double vetorVelocidades[] = new double[5];
        int quantAcima60=0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        for(int i=0;i<vetorVelocidades.length;i++){
            System.out.printf("Veículo %d. Digite a velocidade: ", i+1);
            vetorVelocidades[i] = Double.parseDouble(entrada.readLine());
            if(vetorVelocidades[i]>60){
                quantAcima60++;
            }
        }
        
        System.out.println("O número de veículos acima de 60Km/h é " + quantAcima60);
        System.out.println("Total arrecadado com multas: " + quantAcima60 * 150);
        
    }
    
}
