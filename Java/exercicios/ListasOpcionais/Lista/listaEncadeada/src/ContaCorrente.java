public class ContaCorrente {

	private String titularNome;
	private int agencia;
	private int numConta;
	private double saldo;

	public ContaCorrente() {
		this.titularNome = new String("");
		this.agencia = 0;
		this.numConta = 0;
		this.saldo = 0.0;
	}

	public ContaCorrente(String titularNome, int agencia, int numConta, double saldo) {
		this.titularNome = new String(titularNome);
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	// Sets
	public void setTitularNome(String titularNome) {
		this.titularNome = titularNome;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Gets
	public String getTitularNome() {
		return this.titularNome;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
