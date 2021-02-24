#include <stdio.h>
#include <stdlib.h>

int main()
{
    int entero = 0, divisiones = 1, resto = 0;

    printf("Introduce un número entero: ");
    scanf("%d", &entero);

    do
    {
        if (entero % divisiones == 0){
            resto++;
        }
        divisiones++;
    } while (divisiones <= entero);

    if (resto == 2)
    {
        printf("Es primo.");
    } else {
        printf("No es primo.");
    }

    return 0;
}
