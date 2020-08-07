#include <stdio.h>
#include <stdlib.h>

int main()
{
	// declaração de variável ponteiro para ponteiro
	int **matriz1, **matriz2, **matrizSomada;

	// declarando as linhas e colunas que o usuário vai digitar como ponteiros
	int *linhas, *colunas;

	// alocando espaço para valores da coluna e linha
    linhas = (int*) malloc(sizeof(int));
    colunas = (int*) malloc(sizeof(int));

	printf("Digite a quantidade de linhas: ");
	scanf("%d", linhas);
	printf("Digite a quantidade de colunas: ");
	scanf("%d", colunas);

	// alocando o vetor de ponteiros
	matriz1 = (int**)malloc(*linhas * sizeof(int*));
	matriz2 = (int**)malloc(*linhas * sizeof(int*));
	matrizSomada = (int**)malloc(*linhas * sizeof(int*));

	// alocando cada uma das linhas da matriz
	int i;
	for(i = 0; i < *linhas; i++)
    {
		matriz1[i] = (int*)malloc(*colunas * sizeof(int));
		matriz2[i] = (int*)malloc(*colunas * sizeof(int));
		matrizSomada[i] = (int*)malloc(*colunas * sizeof(int));
    }

	int j;
	int contador=1;

	// preenchendo a matriz 1
	for(i = 0; i < *linhas; i++)
	{
		for(j = 0; j < *colunas; j++)
		{
            printf("Matriz 1. [%d/%d] - Digite um valor: ", contador, ((*linhas) * (*colunas)));
            scanf("%d", &matriz1[i][j]);
            contador++;
		}
	}

	printf("\n");

	contador=1;

	// preenchendo a matriz 2
	for(i = 0; i < *linhas; i++)
	{
		for(j = 0; j < *colunas; j++)
		{
            printf("Matriz 2. [%d/%d] - Digite um valor: ", contador, ((*linhas) * (*colunas)));
            scanf("%d", &matriz2[i][j]);
            contador++;
		}
	}

    // Atribuindo a soma de cada posição na matrizSomada
	for(i = 0; i < *linhas; i++){
        for(j=0; j< *colunas; j++){
            matrizSomada[i][j] = matriz1[i][j] + matriz2[i][j];
        }
    }

	// mostrando os elementos da matriz
	printf("\n\nMatriz 1:\n");
	for(i = 0; i < *linhas; i++)
	{
		for(j = 0; j < *colunas; j++)
			printf("%d\t", matriz1[i][j]);
		printf("\n");
	}
    printf("\n\nMatriz 2:\n");
	for(i = 0; i < *linhas; i++)
	{
		for(j = 0; j < *colunas; j++)
			printf("%d\t", matriz2[i][j]);
		printf("\n");
	}
	printf("\n\nMatriz Somada:\n");
	for(i = 0; i < *linhas; i++)
	{
		for(j = 0; j < *colunas; j++)
			printf("%d\t", matrizSomada[i][j]);
		printf("\n");
	}


	// liberando o espaço de memória

	// libera cada linha
	for(i = 0; i < *linhas; i++)
    {
		free(matriz1[i]);
        free(matriz2[i]);
        free(matrizSomada[i]);
    }

	// libera o vetor de ponteiros
	free(matriz1);
	free(matriz2);
	free(matrizSomada);
	free(linhas);
	free(colunas);

	return 0;
}
