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

public class LerEEscrever  {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Informe um endereco de um arquivo: ");
		String endereco = in.readLine();
		
		Escrever(endereco);
		
		System.out.println("Texto escrito: ");
		Ler(endereco);
		
	}
	
	private static void Escrever(String endereco) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita();
		
		escrita.abrirArquivo(endereco);
		
		System.out.print("Digite um texto: ");
		String str = in.readLine();
		
		escrita.escrever(str);
		
		escrita.fecharArquivo();
	}
	
	private static void Ler(String arq) throws IOException {
		ArquivoTextoLeitura leitura = new ArquivoTextoLeitura();
		
		leitura.abrirArquivo(arq);
		
		System.out.println(leitura.ler());
		
		leitura.fecharArquivo();
	}

}
