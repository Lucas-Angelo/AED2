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

public class TesteArquivo  {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Menu de opções:");
		System.out.print("1 - Para escrever\n2 - Para ler\n");
		System.out.print("Digite a opção desejada: ");
		int opcao = Integer.parseInt(in.readLine());
		switch (opcao) {
			case 1:
				Escrever();
				break;
			case 2:
				Ler();
				break;
			default:
				System.out.println("FIM");
		}
		
	}
	
	private static void Escrever() throws IOException {
		String arq = "C:\\Users\\lcs20\\Documents\\Materias\\2º Período\\AED-II\\Lab\\Atividades\\Java\\Arquivo\\TesteArquivo\\src\\code\\texto.txt";
		
		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita();
		
		try {
			escrita.abrirArquivo(arq);
		}
		catch (Exception excecao) {
			System.out.println("Erro: " + excecao);
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String str = in.readLine();
		
		escrita.escrever(str);
		
		escrita.fecharArquivo();
	}
	
	private static void Ler() throws IOException {
		String arq = "C:\\Users\\lcs20\\Documents\\Materias\\2º Período\\AED-II\\Lab\\Atividades\\Java\\Arquivo\\TesteArquivo\\src\\code\\texto.txt";
		
		ArquivoTextoLeitura leitura = new ArquivoTextoLeitura();
		
		leitura.abrirArquivo(arq);
		
		System.out.println(leitura.ler());
		
		leitura.fecharArquivo();
	}

}
