#include<stdio.h>

int main()
{
    int i, a [5] = {1, 2, 3, 4, 5};
    
    int min = a [0];
    
    for (i = 1; i < 5; i++) {
        if (min > a [i]) {
            min = a [i];
        }
    }
    printf ("Min = %i", min);
    
    return 0;
}