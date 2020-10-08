import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */
public class App {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String str = new String();
		
		String str1 = new String();
		String str2 = new String();
		
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));

		do {
			str = in.readLine();
			
			if(!(str.equals("FIM"))) {
				
				str1 = dividir(str, 0); // Pegar primeira parte da string 
				str2 = dividir(str, 1); // Pegar parte apos o espaco
				
				str = combinador(str1, str2);
				System.out.println(str);
				
			}
			
		} while (!(str.equals("FIM")));
		
	}

	
	private static String combinador (String str1, String str2) {
		String str = new String("");
		
		if(str1.length()>str2.length()) {
			for(int i=0; i<str1.length();i++) {
				str += str1.charAt(i);
				if(i<str2.length())
					str += str2.charAt(i);
			}
		}
		else {
			for(int i=0; i<str2.length();i++) {
				if(i<str1.length())
					str += str1.charAt(i);
				str += str2.charAt(i);
			}
		}
		
		return str;
	}
	
	private static String dividir (String str, int parte) { // Fiz de duas formas, uma esta comentada
		String metade = new String("");
		String array[]= str.split(" ", 2);
		
		//int space = 0;
		
		if(parte==0) {
			
			metade = array[0];
			
			/*for(int i=0; str.charAt(i)!=' '; i++) {
				metade += str.charAt(i);
			}*/
			
		}
		else {
			
			metade = array[1];
			
			/*for(int i=0; str.charAt(i)!=' '; i++) {
				space = i;
			}
			
			for(int i=space+2; i<str.length(); i++) {
				metade += str.charAt(i);
			}*/
			
		}
		
		return metade;
	}
	
}