#include<stdio.h>

int main()
{
    int i, c = 0, sum = 0, n;
    
    for (i = 0; n != -1; i++) {
        scanf ("%i", &n);
        sum = sum + n;
        c++;
    }
    int avg = sum / (c - 1);
    printf ("Avergae = %i", avg);
    
    return 0;
}
