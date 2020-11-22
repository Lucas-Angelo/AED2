
public class TurmaBasica {

	public static void main(String[] args) {
		Aluno alunoNovo, alunoPesquisado;
		ABBAlunos turma = new ABBAlunos();

		alunoNovo = new Aluno(5, "Amanda", 85.00);
		turma.inserir(alunoNovo);
		alunoNovo = new Aluno(8, "Uriel", 87.00);
		turma.inserir(alunoNovo);
		alunoNovo = new Aluno(6, "Ivo", 75.00);
		turma.inserir(alunoNovo);
		alunoNovo = new Aluno(3, "Olivia", 90.00);
		turma.inserir(alunoNovo);
		alunoNovo = new Aluno(2, "Julia", 88.00);
		turma.inserir(alunoNovo);
		alunoNovo = new Aluno(9, "Elaine", 85.00);
		turma.inserir(alunoNovo);
		alunoNovo = new Aluno(4, "Sônia", 82.00);
		turma.inserir(alunoNovo);

		System.out.println("Alunos matriculados na turma, ordenados em ordem crescente de número de matrícula");
		turma.imprimirEmOrdem(); /// 2 - 3 - 4 - 5 - 6 - 8 - 9

		System.out.println("\n\nResultado da pesquisa pelo aluno de número de matrícula 3:");
		alunoPesquisado = turma.buscar(3);

		if (alunoPesquisado != null) {
			alunoPesquisado.imprimir(); /// Olivia - 3 - 90.0
		}

		System.out.println("\nNúmero de alunos matriculados na turma: " + turma.numAlunos()); /// 7

		if ((alunoPesquisado = turma.menorNumeroMatricula()) != null) {
			System.out.println("\nDados do aluno que possui o menor número de matrícula da turma.");
			alunoPesquisado.imprimir(); /// Julia - 2 - 88.0
		}

		turma.remover(5);
		turma.remover(3);
		turma.remover(4);

		System.out.println("\nAlunos matriculados na turma, ordenados em ordem crescente de número de matrícula");
		turma.imprimirEmOrdem(); /// 2 - 6 - 8 - 9

		System.out.println("\n\nNúmero de alunos matriculados na turma: " + turma.numAlunos()); /// 4
		System.out.print("\nResultado da pesquisa pelo aluno de número de matrícula 3:");
		alunoPesquisado = turma.buscar(3);

		if (alunoPesquisado != null) {
			alunoPesquisado.imprimir(); /// O aluno, cuja matrícula é 3, não foi encontrado na árvore.
		}

		turma.remover(9);
		turma.remover(6);
		turma.remover(2);
		turma.remover(8);

		if ((alunoPesquisado = turma.menorNumeroMatricula()) != null) {
			System.out.println("Dados do aluno que possui o menor número de matrícula da turma.");
			alunoPesquisado.imprimir(); /// Nenhum aluno foi encontrado. A árvore está vazia.
		}

	}
}
