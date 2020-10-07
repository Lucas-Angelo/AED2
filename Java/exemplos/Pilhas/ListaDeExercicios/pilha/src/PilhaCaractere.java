public class PilhaCaractere {

	private CelulaCaractere fundo; // referência à célula que está no fundo da pilha. Essa célula é utilizada apenas para controle.
    private CelulaCaractere topo;  // referência à célula que está no topo da pilha.

    // Construtor que cria uma pilha "vazia" inicializando a célula do fundo da pilha e os atributos de controle da pilha (fundo e topo).
    PilhaCaractere() {
    	
        CelulaCaractere aux = new CelulaCaractere();

        fundo = aux;
        topo = aux;
    }

    // Insere o item, passado como parâmetro para esse método, no topo da pilha.
    public void empilhar(Caractere l)
    {
    	// inserção da nova célula no topo da pilha.
        CelulaCaractere aux = new CelulaCaractere();
    	aux.proximo = topo;
    	aux.item = l;
    	
        // atualização do atributo de controle topo.
        topo = aux;
    }

    // Retira o item que está no topo da pilha. Se a pilha estiver vazia, esse método deve retornar null; caso contrário, esse método deve retornar o item retirado da pilha.
    public Caractere desempilhar()
    {
        // se a pilha estiver vazia, esse método deve retornar null.
        Caractere aux = null;

        if (!pilhaVazia())
        {
            // aux aponta para o item da pilha que será retornado/desempilhado, ou seja, o item do topo.
            aux = topo.item;

            // atualização do atributo de controle topo.
            topo = topo.proximo;

        }
        return (aux);
    }

    // Verifica se a pilha está vazia. Em caso afirmativo, retorna true e em caso negativo retorna false.
    public Boolean pilhaVazia()
    {
        // se a pilha apresentar apenas a célula sentinela, ela está vazia.
        if (fundo == topo)
            return (true);
        else
            return (false);
    }    
}