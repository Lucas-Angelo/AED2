import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TratarExce {
    public static void metodo1(String s) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        int i = Integer.parseInt(s);
        System.out.println("A variavel i vale: " + i);
    }
    public static void metodo2(String s) throws NumberFormatException {
        int i = Integer.parseInt(s);
        System.out.println("A variavel i vale: " + i);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String s = entrada.readLine();
        try {
            metodo1(s);
        } catch (NumberFormatException e) {
            System.out.println("Erro!!");
        }

        System.out.println("------------->>>>>>>>>> <<<<<<<<<---------------");

        try {
            metodo2(s);
        } catch (NumberFormatException e) {
            System.out.println("Erro!!");
        }

        System.out.println("------------->>>>>>>>>> <<<<<<<<<---------------");

    }
}
