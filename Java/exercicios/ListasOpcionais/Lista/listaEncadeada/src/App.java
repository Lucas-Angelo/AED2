/**
 * 
 */

/**
 * @author Lucas Ângelo O. M. Rocha github.com/Lucas-Angelo
 */
public class App {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ContaCorrente cc;
		ListaContaCorrente banco, banco2, bancoCopia;

		banco = new ListaContaCorrente();
		banco2 = new ListaContaCorrente();

		cc = new ContaCorrente("Eveline", 36, 707, 500.00);
		banco.inserirFinal(cc);
		cc = new ContaCorrente("João", 45, 801, 500.00);
		banco.inserirFinal(cc);
		cc = new ContaCorrente("José", 71, 917, 900.00);
		banco.inserirFinal(cc);

		cc = new ContaCorrente("Lucas", 36, 708, 500.00);
		banco2.inserirFinal(cc);
		cc = new ContaCorrente("Luis", 45, 802, 500.00);
		banco2.inserirFinal(cc);
		cc = new ContaCorrente("Jorel", 71, 996, 900.00);
		banco2.inserirFinal(cc);

		banco.concaternar(banco2);

		banco.depositar(708, 24.0);

		System.out.println("Contas-correntes presentes no banco:");
		banco.imprimir();

		System.out.println(banco.obterNumContasCorrentes());

		bancoCopia = banco2.copiar();
		System.out.println("\nBanco novo:");
		bancoCopia.imprimir();

		banco.eliminarContasCorrentesPosicoesPares();
		System.out.println("\nBanco novo:");
		banco.imprimir();
	}

}
