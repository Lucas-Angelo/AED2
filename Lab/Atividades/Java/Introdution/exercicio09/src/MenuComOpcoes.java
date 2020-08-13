import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas Ângelo github.com/Lucas-Angelo
 */
public class MenuComOpcoes {

    public static void main(String[] args) throws IOException {
        
        int opcao;
        
        opcao = menu();
        
        switch (opcao) {
            case 1:
                System.out.printf("A média aritmética é: %.2f\n", mediaAritmetica());
                break;
            case 2:
                System.out.printf("A média ponderada é: %.2f\n", mediaPonderada());
                break;
            case 3:
                medias();
                break;
            default:
                System.out.println("Saindo...");
                break;
        }
        
    }
    
    public static int menu() throws IOException{
        
        int op;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("Menu de opções");
        System.out.println("1. Média Arimética");
        System.out.println("2. Média Ponderada");
        System.out.println("3. Média Aritmética e Ponderada");
        System.out.println("4. Sair");
        System.out.print("Digite a opção desejada: ");
        do{
            op = Integer.parseInt(entrada.readLine());
            if(op!=1 && op!=2 && op!=3 && op!=4){
                System.out.println("Digite uma opção válida!");
            }
        } while (op!=1 && op!=2 && op!=3 && op!=4);
        
        return op;
    }
    
    public static double mediaAritmetica() throws IOException{
        double somatorio=0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        for(int i=0;i<3;i++){
            System.out.print("Digite um número: ");
            somatorio += Double.parseDouble(entrada.readLine());
        }
        
        return somatorio/3;
    }
    
        public static double mediaPonderada() throws IOException{
        double somatorio=0, num, peso;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        int contador=0;
        for(int i=0;i<3;i++){
            System.out.print("Digite um número: ");
            num = Double.parseDouble(entrada.readLine());
            System.out.print("Digite o peso: ");
            peso = Double.parseDouble(entrada.readLine());
            somatorio += num*peso;
            contador+=peso;
        }
        
        return somatorio/(contador*1.0);
    }
        
    public static void medias() throws IOException{
        double numeros[] = new double[3];
        double pesos[] = new double[3];
        double mediaAritmetica=0, mediaPonderada=0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        for(int i=0;i<3;i++){
            System.out.print("Digite um número: ");
            numeros[i] = Double.parseDouble(entrada.readLine());
            System.out.print("Digite o peso: ");
            pesos[i] = Double.parseDouble(entrada.readLine());
        }
        
        for(int i=0;i<3;i++){
            mediaAritmetica += numeros[i];
        }
        
        int somaPesos=0;
        for(int i=0;i<3;i++){
            mediaPonderada += numeros[i] * pesos[i];
            somaPesos+=pesos[i];
        }
        
        System.out.printf("\nA média aritmética é: %.2f", mediaAritmetica/3);
        System.out.printf("\nA média ponderada é: %.2f\n", mediaPonderada/somaPesos);
    }
    
}
