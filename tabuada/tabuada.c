#include <stdio.h>

int main() {
    int n;
    printf("Digite um numero: ");
    scanf("%d", &n);

    for (size_t i = 1; i < 11; i++)
    {
        printf("%d * %d = %d\n", n, i, n * i);
    }
    
}