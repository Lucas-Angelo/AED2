#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct tipoInteiro {
    int valor;
} tipoInteiro;

typedef struct tipoCelula *tipoApontadorCelula;

typedef struct tipoCelula {
    tipoInteiro *item;
    tipoApontadorCelula proximo;
} tipoCelula;

typedef struct tipoPilha {
    tipoApontadorCelula fundo;
    tipoApontadorCelula topo;
} tipoPilha;

tipoApontadorCelula criarCelula(tipoInteiro *elemento){

    tipoApontadorCelula aux;
    aux = (tipoApontadorCelula*) malloc(sizeof(tipoCelula));
    aux->item = elemento;
    aux->proximo = NULL;

    return (aux);

}

tipoPilha *criarPilha() {

    tipoPilha *pilha;
    tipoApontadorCelula sentinela;
    tipoInteiro *elemento;

    pilha = (tipoPilha*) malloc (sizeof(tipoPilha));

    elemento = (tipoInteiro*) malloc(sizeof(tipoInteiro));
    elemento->valor = 0;

    sentinela = criarCelula(elemento);

    pilha->fundo = sentinela;
    pilha->topo = sentinela;

    return (pilha);

}

bool pilhaVazia(tipoPilha *pilha) {

    bool resp;

    if(pilha->fundo == pilha->topo)
        resp = true;
    else
        resp = false;

    return resp;
}

void empilhar(tipoInteiro *elemento, tipoPilha *pilha) {

    tipoApontadorCelula novaCelula;
    novaCelula = criarCelula(elemento);

    novaCelula->proximo = pilha->topo; // Aponta a nova celula pra baixo, onde ainda ta o topo
    pilha->topo = novaCelula; // Coloca o topo sendo a nova pilha

}

tipoInteiro *desempilhar (tipoPilha *pilha){

    tipoApontadorCelula  aux;
    tipoInteiro *elemento;

    if(!pilhaVazia(pilha)){
        aux = pilha->topo;

        pilha->topo = pilha->topo->proximo;
        // pilha->topo = aux->proximo;

        aux->proximo = NULL;
        elemento = aux->item;

        free(aux);
    }

    return (elemento);

}

void imprimir(tipoPilha *pilha) {

    tipoApontadorCelula aux;

    aux = pilha->topo;

    while (aux != pilha->fundo) {
        printf("[%d]\n", aux->item->valor);

        aux = aux->proximo;
    }


}

int main () {

    tipoPilha *pilha = criarPilha();
    tipoInteiro *elemento;

    elemento = (tipoInteiro*) malloc(sizeof(tipoInteiro));
    elemento->valor = 29;
    empilhar(elemento, pilha);

    elemento = (tipoInteiro*) malloc(sizeof(tipoInteiro));
    elemento->valor = 10;
    empilhar(elemento, pilha);

    elemento = (tipoInteiro*) malloc(sizeof(tipoInteiro));
    elemento->valor = 20;
    empilhar(elemento, pilha);

    printf("Conteudo da pilha, do topo para o fundo:\n");
    imprimir(pilha);

    printf("\nDesempilhando...");
    elemento = desempilhar(pilha);
    printf("\nDesempilhado: %d\n", elemento->valor); // 20

    printf("\nConteudo da pilha, do topo para o fundo:\n");
    imprimir(pilha);


    return 0;
}
