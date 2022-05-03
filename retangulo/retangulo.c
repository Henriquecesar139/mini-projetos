#include <stdio.h>

int main () {

    int altura, largura;

    printf("Digite a altura: ");
    scanf("%d", &altura);

    printf("Digite a largura: ");
    scanf("%d", &largura);

    printf("A área desse retãngulo é %d\n", altura * largura);

    return 0;
}