#include <stdio.h>

int main  () {

    int num, mult;

    mult = 0;

    printf("Digite um número: ");

    scanf("%d", &num);

    for (size_t i = 2; i < num; i++) {
        if (num % i == 0) {
            mult++;
        }
    }
    
    if (mult == 0) {
        printf("É primo\n");
    } else {
        printf("Não é primo\n");
    }
    

    return 0;
}