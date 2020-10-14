import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 */

/**
 * @author Lucas �ngelo O. M. Rocha github.com/Lucas-Angelo
 */
public class App {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//  Cliente cli;
//  FilaCliente filaLanchonete;
//
//  filaLanchonete = new FilaCliente();
//  cli = new Cliente("Eveline", LocalDateTime.now());
//  filaLanchonete.enfileirar(cli);
//  Thread.sleep(1000);
//  cli = new Cliente("João", LocalDateTime.now());
//  filaLanchonete.enfileirar(cli);
//  Thread.sleep(1000);
//  cli = new Cliente("Ana", LocalDateTime.now());
//  filaLanchonete.enfileirar(cli);
//  Thread.sleep(1000);
//
//  cli = filaLanchonete.desenfileirar();
//  System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Eveline
//  cli = filaLanchonete.desenfileirar();
//  System.out.println("O cliente " + cli.getNome() + " foi atendido."); // João
//  cli = filaLanchonete.desenfileirar();
//  System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Ana
//
//  cli = new Cliente("Joaquim", LocalDateTime.now());
//  filaLanchonete.enfileirar(cli);
//  cli = filaLanchonete.desenfileirar();
//  System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Joaquim
//
//  cli = new Cliente("Lucas", LocalDateTime.now().minusMinutes(15));
//  filaLanchonete.enfileirar(cli);
//  Thread.sleep(1000);
//  cli = new Cliente("Luiz", LocalDateTime.now());
//  filaLanchonete.enfileirar(cli);
//  Thread.sleep(1000);
//  cli = new Cliente("Gui", LocalDateTime.now());
//  filaLanchonete.enfileirar(cli);
//
//  String nomeExiste = "Lucas";
//  if (filaLanchonete.verificarExistencia(nomeExiste)) {
//   System.out.println("\nO nome " + nomeExiste + " existe!");
//  } else {
//   System.out.println("\nO nome " + nomeExiste + " n�o existe!");
//  }
//
//  filaLanchonete.imprimir();
//  System.out.println("\nN�mero de cliente a mais de 15min: " + filaLanchonete.obterNumClientesEsperando());
//
//  FilaCliente fila2 = filaLanchonete.dividir();
//
//  System.out.println("\nFila original: ");
//  filaLanchonete.imprimir(); // Eveline Ana
//  System.out.println("\nFila nova: ");
//  if (fila2 != null) {
//   fila2.imprimir(); // Jo�o
//  }

		Cliente cli;
		FilaCliente filaLanchonete;
		filaLanchonete = new FilaCliente();
		cli = new Cliente("Eveline", LocalDateTime.now().minusMinutes(15));
		filaLanchonete.enfileirar(cli);
		Thread.sleep(1000);
		cli = new Cliente("Jo�o", LocalDateTime.now());
		filaLanchonete.enfileirar(cli);
		Thread.sleep(1000);
		cli = new Cliente("Ana", LocalDateTime.now());
		filaLanchonete.enfileirar(cli);
		Thread.sleep(1000);

		if (filaLanchonete.verificarExistencia("Eveline")) {
			System.out.println("O cliente Eveline foi localizado na fila."); // Essa mensagem deve ser exibida.
		} else {
			System.out.println("O cliente Eveline n�o foi localizado na fila.");
		}

		System.out.println("Existem: " + filaLanchonete.obterNumClientesEsperando()
				+ " clientes esperando a pelo menos 15 minutos na fila.");

		FilaCliente fila2 = filaLanchonete.dividir();
		System.out.println("Os clientes presentes na fila original s�o, nessa ordem:");
		filaLanchonete.imprimir(); // Eveline Ana
		System.out.println("\nOs clientes presentes na nova fila s�o, nessa ordem:");
		if (fila2 != null) {
			fila2.imprimir(); // Jo�o
		}
	}

}

class Cliente {

	private String nome; // nome do cliente.
	private LocalDateTime horarioChegada; // data e hora de chegada do cliente.

	// Construtor que inicializa os atributos nome e horarioChegada com os valores
	// passados através dos parâmetros nomeCliente e chegada desse método,
	// respectivamente.
	public Cliente(String nomeCliente, LocalDateTime chegada) {
		nome = nomeCliente;
		setHorarioChegada(chegada);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(LocalDateTime horarioChegada) {
		this.horarioChegada = horarioChegada;
	}
}

class CelulaCliente {

	Cliente item;
	CelulaCliente proximo;

	public CelulaCliente(Cliente cli) {

		item = cli;
		proximo = null;
	}
}

class FilaCliente {

	private CelulaCliente frente; // referência ao cliente que está na frente da fila. Esse cliente é utilizado
	// apenas para controle.
	private CelulaCliente tras; // referência ao cliente que está na última posição da fila.

	// Construtor que cria uma fila vazia inicializando o cliente da frente da fila
	// e os atributos de controle da fila (frente e tras).
	public FilaCliente() {
		Cliente cli;
		CelulaCliente celula;
		LocalDateTime horaChegada;

		horaChegada = LocalDateTime.now();
		cli = new Cliente(" ", horaChegada);
		celula = new CelulaCliente(cli);
		frente = celula;
		tras = celula;
	}

	public FilaCliente clone() {

		FilaCliente filaClonada = new FilaCliente();

		filaClonada.frente = this.frente;
		filaClonada.tras = this.tras;

		return filaClonada;
	}

	// Verifica se a fila está vazia. Em caso afirmativo, retorna true e em caso
	// negativo retorna false.
	public Boolean filaVazia() {
		// Se a fila apresentar apenas o elemento de controle, ela está vazia.
		if (frente == tras) {
			return true;
		} else {
			return false;
		}
	}

	// Insere o item da fila cli, passado como parâmetro para esse método, no
	// final da fila.
	public void enfileirar(Cliente cli) {
		// inserção do novo cliente no final da fila.
		tras.proximo = new CelulaCliente(cli);

		// atualização do atributo de controle tras.
		tras = tras.proximo;
		tras.item = cli;
	}

	// Retira o cliente que ocupa a primeira posição da fila. Se a fila estiver
	// vazia, esse método deve retornar null; caso contrário, esse método deve
	// retornar o cliente retirado da fila.
	public Cliente desenfileirar() {

		CelulaCliente aux;
		Cliente cli;

		if (!(filaVazia())) {
			// aux aponta para o cliente da fila que será retornado/desenfileirado, ou
			// seja, o primeiro cliente da fila.
			aux = frente.proximo;

			// atualização do primeiro cliente da fila.
			frente.proximo = aux.proximo;

			cli = aux.item;
			aux.proximo = null;

			if (aux == tras)
				tras = frente;

			return (cli);
		}
		return null;
	}

	public Boolean verificarExistencia(String nomeCliente) {
		Boolean res = false;

		CelulaCliente aux;

		aux = frente.proximo;
		while (aux != null && res != true) {

			if ((aux.item.getNome().equals(nomeCliente)))
				res = true;

			aux = aux.proximo;
		}

		return res;

	}

	public void imprimir() {
		CelulaCliente aux;

		aux = frente.proximo;
		while (aux != null) {

			System.out.print(aux.item.getNome() + " ");

			aux = aux.proximo;
		}
	}

	public int obterNumClientesEsperando() {
		int cont = 0;
		CelulaCliente aux;

		aux = frente.proximo;
		while (aux != null) {

			LocalDateTime d1 = aux.item.getHorarioChegada();
			LocalDateTime d2 = LocalDateTime.now();

			long minutes = ChronoUnit.MINUTES.between(d1, d2);

			if (minutes >= 15)
				cont++;

			aux = aux.proximo;
		}

		return cont;
	}

	public FilaCliente dividir() {
		FilaCliente par = new FilaCliente();
		Cliente cli;

		CelulaCliente aux;
		int numClientes = 0;

		aux = frente.proximo;
		while (aux != null) {
			numClientes++;
			aux = aux.proximo;
		}

		aux = frente.proximo;
		int cont = 1;
		if (filaVazia() || numClientes <= 1) {
			return null;
		} else {
			while (aux != null) {

				if (cont % 2 == 0) {
					cli = new Cliente(aux.item.getNome(), aux.item.getHorarioChegada());
					par.enfileirar(cli);
				}

				cont++;
				aux = aux.proximo;
			}
		}

		for (int i = 1; i <= numClientes; i++) {
			if (i % 2 == 0)
				desenfileirar();
			else
				enfileirar(desenfileirar());
		}

		return par;
	}

}
