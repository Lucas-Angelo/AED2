package code;
/**
 * 
 */

/**
 * @author Lucas Ângelo O. M. Rocha
 * github.com/Lucas-Angelo
 */

public class TesteArquivo extends ArquivoTextoEscrita {

	/**
	 * @param args
	 */
	
	public class Testeando extends ArquivoTextoLeitura{};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "texto.txt";
		
		ArquivoTextoEscrita escrita = null;
		
		escrita.abrirArquivo(str);
		escrita.fecharArquivo();
	}

}
