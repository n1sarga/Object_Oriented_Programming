#include<stdio.h>

int main()
{
    int n;
    
    scanf ("%i", &n);
    
    if (n % 2 == 0) {
        printf ("EVEN");
    }
    else {
        printf ("ODD");
    }
    
    return 0;
}
