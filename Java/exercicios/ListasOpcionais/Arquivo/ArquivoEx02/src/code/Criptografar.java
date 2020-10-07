package code;

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

public class Criptografar  {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Menu de opcoes:");
		System.out.println("1 - Para criptografar");
		System.out.println("2 - Para descriptografar");
		System.out.print("Digite a sua opcao: ");
		int opcao = Integer.parseInt(in.readLine());
		
		switch(opcao) {
			case 1:
				System.out.print("Digite o endereco do arquivo que deseja criptografar: ");
				String enderecoOriginal = in.readLine();
				
				String textoOriginal = Ler(enderecoOriginal);
				String textoCriptografado = Criptografar(textoOriginal);
				
				Escrever(textoCriptografado, opcao);
				System.out.println("O texto foi criptografado");
				break;
			case 2:
				System.out.print("Digite o endereco do arquivo que deseja descriptografar: ");
				String enderecoCriptografado = in.readLine();
				
				String textoParaDescriptografar = Ler(enderecoCriptografado);
				String descritografado = Descriptografar(textoParaDescriptografar);
				
				Escrever(descritografado, opcao);
				System.out.println("O texto foi descriptografado");
				break;
			default:
				System.out.println("Finalizando...");
				
		}
		
		
	}
	
	private static String Ler(String arq) {
		ArquivoTextoLeitura leitura = new ArquivoTextoLeitura();
		
		leitura.abrirArquivo(arq);
		
		String str = leitura.ler();
		
		leitura.fecharArquivo();
		
		return str;
	}
	
	private static String Criptografar(String str) {
		String criptografada = new String("");
		
		for(int i=0; i<str.length(); i++) {
			criptografada += (char) (str.charAt(i)+3);
		}
		
		return criptografada;
	}
	
	private static String Descriptografar(String str) {
		String descriptografado = new String("");
		
		for(int i=0; i<str.length(); i++) {
			descriptografado += (char) (str.charAt(i)-3);
		}
		
		return descriptografado;
	}
	
	private static void Escrever(String str, int opcao) throws IOException {
		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita();
		
		if(opcao==1)
			escrita.abrirArquivo("criptografado.txt");
		else
			escrita.abrirArquivo("descriptografado.txt");
		
		escrita.escrever(str);
		
		escrita.fecharArquivo();
	}
	

}
