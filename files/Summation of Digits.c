#include<stdio.h>

int main()
{
    int i, sum = 0, n;
    
    for (i = 0; n != -1; i++) {
        scanf ("%i", &n);
        sum = sum + n;
    }
    printf ("Sum = %i", sum);
    
    return 0;
}
