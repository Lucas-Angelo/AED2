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

		PilhaCaractere minhaPilha = new PilhaCaractere();
		PilhaCaractere pilha2 = new PilhaCaractere();
		Caractere aux;
		aux = new Caractere('A');
		minhaPilha.empilhar(aux);
		aux = new Caractere('E');
		minhaPilha.empilhar(aux);
		aux = new Caractere('D');
		minhaPilha.empilhar(aux);
		aux = new Caractere('s');
		minhaPilha.empilhar(aux);
		aux = new Caractere('I');
		minhaPilha.empilhar(aux);
		aux = new Caractere('I');
		minhaPilha.empilhar(aux);

		minhaPilha.desempilhar();
		minhaPilha.desempilhar();
		aux = new Caractere(' ');
		pilha2.empilhar(aux);
		aux = new Caractere('I');
		pilha2.empilhar(aux);
		aux = new Caractere('I');
		pilha2.empilhar(aux);

		minhaPilha.concatenar(pilha2);
		minhaPilha.imprimir(); // AEDs II
		pilha2 = minhaPilha.copiar();
		pilha2.desempilhar();
		pilha2.desempilhar();
		pilha2.desempilhar();
		pilha2.desempilhar();
		pilha2.imprimir(); // AED

		if (minhaPilha.verificarExistencia('A')) {
			System.out.println("A letra 'A' foi localizada na pilha."); // essa mensagem deve ser exibida.
		} else {
			System.out.println("A letra 'A' n�o foi localizada na pilha");
		}
		if (minhaPilha.verificarExistencia('c')) {
			System.out.println("A letra 'c' foi localizada na pilha.");
		} else {
			System.out.println("A letra 'c' n�o foi localizada na pilha"); // essa mensagem deve ser exibida.
		}

		LetraChar caract;
		FilaCaractere filaLanchonete;
		filaLanchonete = new FilaCaractere();
		caract = new LetraChar('E');
		filaLanchonete.enfileirar(caract);
		Thread.sleep(1000);
		caract = new LetraChar('J');
		filaLanchonete.enfileirar(caract);
		Thread.sleep(1000);
		caract = new LetraChar('A');
		filaLanchonete.enfileirar(caract);
		Thread.sleep(1000);

		PilhaCaractere pilhaDaFila = new PilhaCaractere();
		pilhaDaFila = filaLanchonete.cloneFilaParaPilhaInvertida(filaLanchonete);

		pilhaDaFila.imprimir();
	}

}

class Caractere {

	private char letra;

	public Caractere() {
		letra = ' ';
	}

	public Caractere(char letra) {
		this.letra = letra;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
}

class CelulaCaractere {

	Caractere item; // corresponde ao item armazenado na célula da pilha.
	CelulaCaractere proximo; // referência à próxima célula de uma pilha.

	CelulaCaractere() {
		item = new Caractere();
		proximo = null;
	}

	// Construtor que inicializa o item com o valor passado através do parâmetro l
	// desse método; e o atributo que indica a próxima célula da pilha com null.
	CelulaCaractere(char l) {
		item = new Caractere(l);
		proximo = null;
	}
}

class PilhaCaractere {

	protected CelulaCaractere fundo; // referência à célula que está no fundo da pilha. Essa célula é utilizada
	// apenas para controle.
	protected CelulaCaractere topo; // referência à célula que está no topo da pilha.

	// Construtor que cria uma pilha "vazia" inicializando a célula do fundo da
	// pilha e os atributos de controle da pilha (fundo e topo).
	PilhaCaractere() {

		CelulaCaractere aux = new CelulaCaractere();

		fundo = aux;
		topo = aux;
	}

	// Insere o item, passado como parâmetro para esse método, no topo da pilha.
	public void empilhar(Caractere l) {
		// inserção da nova célula no topo da pilha.
		CelulaCaractere aux = new CelulaCaractere();
		aux.proximo = topo;
		aux.item = l;

		// atualização do atributo de controle topo.
		topo = aux;
	}

	// Retira o item que está no topo da pilha. Se a pilha estiver vazia, esse
	// método deve retornar null; caso contrário, esse método deve retornar o
	// item retirado da pilha.
	public Caractere desempilhar() {
		// se a pilha estiver vazia, esse método deve retornar null.
		Caractere aux = null;

		if (!pilhaVazia()) {
			// aux aponta para o item da pilha que será retornado/desempilhado, ou seja, o
			// item do topo.
			aux = topo.item;

			// atualização do atributo de controle topo.
			topo = topo.proximo;

		}
		return (aux);
	}

	// Verifica se a pilha está vazia. Em caso afirmativo, retorna true e em caso
	// negativo retorna false.
	public Boolean pilhaVazia() {
		// se a pilha apresentar apenas a célula sentinela, ela está vazia.
		if (fundo == topo)
			return (true);
		else
			return (false);
	}

	public Boolean verificarExistencia(char caractere) {
		Boolean res = false;
		CelulaCaractere aux;

		aux = topo;

		while (aux.proximo != null) {

			if (aux.item.getLetra() == caractere)
				res = true;

			aux = aux.proximo;
		}

		return res;
	}

	public void concatenar(PilhaCaractere pilha) {

		CelulaCaractere aux;
		PilhaCaractere pilhaAux = new PilhaCaractere();

		aux = pilha.topo;
		while (aux.proximo != null) {

			pilhaAux.empilhar(aux.item);

			aux = aux.proximo;
		}

		aux = pilhaAux.topo;
		while (aux.proximo != null) {

			empilhar(pilhaAux.desempilhar());

			aux = aux.proximo;
		}

		aux = topo;
		while (aux.proximo != null) {

			aux = aux.proximo;
		}

		aux = pilhaAux.topo;
		while (aux.proximo != null) {

			pilhaAux.desempilhar();

			aux = aux.proximo;
		}

	}

	public PilhaCaractere copiar() {
		PilhaCaractere pilhaNova = new PilhaCaractere();

		pilhaNova.concatenar(this);

		return pilhaNova;
	}

	public void imprimir() {
		PilhaCaractere invertida = new PilhaCaractere();
		CelulaCaractere aux;

		aux = topo;
		while (aux.proximo != null) {

			invertida.empilhar(aux.item);

			aux = aux.proximo;
		}

		aux = invertida.topo;
		while (aux.proximo != null) {

			System.out.print(aux.item.getLetra() + " ");

			aux = aux.proximo;
		}
		System.out.println("");

	}

}

/* FILA ABAIXO */

class LetraChar {

	private char letra;

	public LetraChar(char letra) {
		this.letra = letra;
	}

	public char getNome() {
		return this.letra;
	}

	public void setNome(char nome) {
		this.letra = nome;
	}

}

class CelulaFila {

	LetraChar item;
	CelulaFila proximo;

	public CelulaFila(LetraChar caract) {

		item = caract;
		proximo = null;
	}
}

class FilaCaractere extends PilhaCaractere {

	private CelulaFila frente; // referência ao caractente que está na frente da fila. Esse caractente é
								// utilizado
	// apenas para controle.
	private CelulaFila tras; // referência ao caractente que está na última posição da fila.

	// Construtor que cria uma fila vazia inicializando o caractente da frente da
	// fila
	// e os atributos de controle da fila (frente e tras).
	public FilaCaractere() {
		LetraChar caract;
		CelulaFila celula;

		caract = new LetraChar(' ');
		celula = new CelulaFila(caract);
		frente = celula;
		tras = celula;
	}

	public FilaCaractere clone() {

		FilaCaractere filaClonada = new FilaCaractere();

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

	// Insere o item da fila caract, passado como parâmetro para esse método, no
	// final da fila.
	public void enfileirar(LetraChar caract) {
		// inserção do novo caractente no final da fila.
		tras.proximo = new CelulaFila(caract);

		// atualização do atributo de controle tras.
		tras = tras.proximo;
		tras.item = caract;
	}

	// Retira o caractente que ocupa a primeira posição da fila. Se a fila estiver
	// vazia, esse método deve retornar null; caso contrário, esse método deve
	// retornar o caractente retirado da fila.
	public LetraChar desenfileirar() {

		CelulaFila aux;
		LetraChar caract;

		if (!(filaVazia())) {
			// aux aponta para o caractente da fila que será retornado/desenfileirado, ou
			// seja, o primeiro caractente da fila.
			aux = frente.proximo;

			// atualização do primeiro caractente da fila.
			frente.proximo = aux.proximo;

			caract = aux.item;
			aux.proximo = null;

			if (aux == tras)
				tras = frente;

			return (caract);
		}
		return null;
	}

	public void imprimir() {
		CelulaFila aux;

		aux = frente.proximo;
		while (aux != null) {

			System.out.print(aux.item.getNome() + " ");

			aux = aux.proximo;
		}
	}

	public PilhaCaractere cloneFilaParaPilhaInvertida(FilaCaractere fila) {
		PilhaCaractere pilha = new PilhaCaractere();

		CelulaFila auxFila;

		auxFila = frente.proximo;
		while (auxFila != null) {
			pilha.empilhar(new Caractere(auxFila.item.getNome()));

			auxFila = auxFila.proximo;
		}

		PilhaCaractere invertida = new PilhaCaractere();
		CelulaCaractere aux;

		aux = pilha.topo;
		while (aux.proximo != null) {

			invertida.empilhar(aux.item);

			aux = aux.proximo;
		}

		aux = invertida.topo;
		while (aux.proximo != null) {
			aux = aux.proximo;
		}

		return invertida;

	}

}
