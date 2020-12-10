public class Contato {

	private String nome;
	private int telefone;
	private String email;
	private String endereco;

	public Contato(String nome, int telefone, String email, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public Contato() {
		nome = "";
		telefone = 0;
		email = "";
		endereco = "";
	}

	public String getNome() {
		return this.nome;
	}

	public int getTelefone() {
		return this.telefone;
	}

	public String getEmail() {
		return this.email;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void imprimir() {
		System.out.println("Dados do contato:");
		System.out.println("Nome:" + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("E-mail: " + this.email);
		System.out.println("Endereço: " + this.endereco);
	}

}
