/**
 * 
 */
package code;

import java.io.*;

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class CriptografaFrase {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
        String frase;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Digite uma frase: ");
        frase = entrada.readLine();
        
        
        System.out.printf("Frase invertida: ");
        
        /*StringBuilder invertida = new StringBuilder(frase);
        System.out.println(invertida.reverse().toString());*/
        
        String invertida = "";
        for(int i = (frase.length() -1); i>=0; i--){
            invertida += frase.charAt(i);
        }
        System.out.println(invertida);
		
	}

}
