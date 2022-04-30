#include <stdio.h>

int main () {

    int n, n2, fat;

    printf("Digite um número: ");
    scanf("%d", &n);

    n2 = n;
    fat = 1;

    for (size_t c = n; c > 0; c--) {
        fat = fat * n;
        n--;
    }
    
    printf("%d! = %d", n2, fat);

    return 0;
}