
public class TestaPilha {

	public static void main(String[] args) {
		
		PilhaCaractere minhaPilha = new PilhaCaractere();
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
        
	}

}
