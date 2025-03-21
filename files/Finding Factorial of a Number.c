#include<stdio.h>

int main()
{
    int i, fact = 1, n;
    
    scanf ("%i", &n);
    
    for (i = 0; i < n; i++) {
        fact = fact * i;
    }
    printf ("Factorial = %i", fact);
    
    return 0;
}
