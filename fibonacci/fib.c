#include <stdio.h>

int main() {

    int t1, t2, t3, n;

    printf("Digite a quantidade de termos: ");
    scanf("%d", &n);

    t1 = 0;
    t2 = 1;

    for (size_t i = 0; i < n; i++) {
        printf("%d\n", t1);
        t3 = t2;
        t2 = t1 + t2;
        t1 = t3;
    }
    

    return 0;
}