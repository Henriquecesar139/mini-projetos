#include <stdio.h>

int main() {

    int n1, n2;

    printf("Digite um numero: ");
    scanf("%d", &n1);
    
    printf("Digite outro numero: ");
    scanf("%d", &n2);

    printf("%d + %d = %d\n", n1, n2, n1 + n2);
    printf("%d - %d = %d\n", n1, n2, n1 - n2);
    printf("%d * %d = %d\n", n1, n2, n1 * n2);
    printf("%d / %d = %d\n", n1, n2, n1 / n2);

    return 0;
}