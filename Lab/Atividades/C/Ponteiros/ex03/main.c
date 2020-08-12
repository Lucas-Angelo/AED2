#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *alunos;
    float *notas, *somatorio;

    alunos = (int*) malloc(sizeof(int));
    somatorio = (float*) malloc(sizeof(float));

    printf("Digite quantos alunos: ");
    scanf("%d", alunos);

    notas = (float*) malloc(*alunos * sizeof(float));

    for(int i=0; i<*alunos; i++)
    {
        printf("Aluno %d | Digite a nota dele: ", i+1);
        scanf("%f", &notas[i]);
    }

    printf("O vetor de notas: ");
    for(int i=0; i<*alunos; i++)
        printf("%.2f ", notas[i]);

    for(int i=0; i<*alunos; i++)
        *somatorio+=notas[i];

    printf("\n\nA media aritemetica das notas da turma e: %.2f", (*somatorio / *alunos));

    free(alunos);
    free(somatorio);
    free(notas);

    return 0;
}
