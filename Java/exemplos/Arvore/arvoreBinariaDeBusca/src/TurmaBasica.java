
public class TurmaBasica {

	public static void main(String[] args) {
		Aluno alunoNovo;
        ABBAlunos turma = new ABBAlunos();

        if (turma.arvoreVazia())
            System.out.println("A turma está vazia."); /// Essa mensagem deve ser exibida.
        else
            System.out.println("A turma possui alunos matriculados.");

        alunoNovo = new Aluno (5, "Amanda", 85.00);
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

        alunoNovo = new Aluno(6, "Ivo", 75.00);
        turma.inserir(alunoNovo); /// Deve ser exibida a mensagem: "O aluno Ivo, cuja matrícula é 6, já foi inserido anteriormente na árvore."

        turma.remover(23); /// Deve ser exibida a mensagem: "O aluno, cuja matrícula é 23, não foi encontrado."

        turma.remover(5);
        
        turma.remover(3);
        
        turma.remover(4);
        
        turma.remover(8);
        
        turma.remover(6);
        
        turma.remover(9);
        
        turma.remover(9); /// Deve ser exibida a mensagem: "O aluno, cuja matrícula é 9, não foi encontrado."
        
        turma.remover(2);
        
	}
}
