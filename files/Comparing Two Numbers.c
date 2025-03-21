#include<stdio.h>

int main()
{
    int a, b;
    scanf ("%i %i", &a, &b);
    
    if (a > b) {
            printf ("Large = ", a);
            printf ("Small = ", b);
        }
        else {
            printf ("Large = ", b);
            printf ("Small = ", a);
        }
    return 0;
}
