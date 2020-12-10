public class Aplicacao {

	public static void main(String[] args) {

		Trie arvoreTrie = new Trie();

		String cadeia[] = new String[9];
		cadeia[0] = "ABACAXI";
		cadeia[1] = "BALA";
		cadeia[2] = "BOLO";
		cadeia[3] = "ABACATE";
		cadeia[4] = "GALO";
		cadeia[5] = "PATA";
		cadeia[6] = "PATO";
		cadeia[7] = "GATO";
		cadeia[8] = "GATOS";

		for (int i = 0; i < cadeia.length; i++)
			try {
				arvoreTrie.inserir(cadeia[i]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		for (int i = 0; i < cadeia.length; i++)
			try {
				System.out.println("Pesquisar(" + cadeia[i] + "):" + arvoreTrie.pesquisar(cadeia[i]));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 

		String s = "ABACA";
		try {
			System.out.println("Pesquisar(" + s + "):" + arvoreTrie.pesquisar(s)); // false
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		s = "ABACAXIS";
		try {
			System.out.println("Pesquisar(" + s + "):" + arvoreTrie.pesquisar(s)); // false
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		s = "PATOS";
		try {
			System.out.println("Pesquisar(" + s + "):" + arvoreTrie.pesquisar(s)); // false
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
