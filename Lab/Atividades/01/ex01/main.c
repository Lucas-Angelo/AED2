#include <stdio.h>
#include <stdlib.h>

int main()
{
    int j;
    int *num;
    int *ehPrimo;

    num = (int *) malloc(sizeof (int));
    ehPrimo = (int *) malloc(sizeof (int));

    *ehPrimo = 0;
    printf("Programa para verificar se o numero eh primo.\n");
    printf("Informe o numero: ");
    scanf("%d", num);

    for (j=2; (( j <= (*num/2) )) && (*ehPrimo == 0); j++) {
        if( (*num % j) == 0 )
            (*ehPrimo)++;
    }

    if (*ehPrimo == 1)
        printf("O numero informado nao eh primo.\n");
    else
        printf("O numero informado eh primo.\n");

    return 0;
}
