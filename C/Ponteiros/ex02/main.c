#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

int main()
{
    int i, *vetor, *maior, *menor;

    maior = (int *) malloc(sizeof (int));
    menor = (int *) malloc(sizeof (int));

    vetor = (int*) malloc(10  * sizeof(int));

    printf("Complete o vetor:\n");
    for (i = 0; i < 10; ++i) {
        printf("Posicao %d, digite o valor: ", i+1);
        scanf("%d", &vetor[i]);
    }

    printf("O vetor: ");
    for (i = 0; i < 10; ++i) {
        printf("%d ", vetor[i]);
    }

    maior = vetor[0];
    menor = vetor[0];

    for (i = 0; i < 10; ++i) {
        if(vetor[i]>maior)
            maior = vetor[i];
        if(vetor[i]<menor)
            menor = vetor[i];
    }

    printf("\nMaior: %d", maior);
    printf("\nMenor: %d", menor);


    return 0;
}
