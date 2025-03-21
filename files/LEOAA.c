#include<stdio.h>

int main()
{
    int i, a [5] = {1, 2, 3, 4, 5};
    
    int max = a [0];
    
    for (i = 1; i < 5; i++) {
        if (max < a [i]) {
            max = a [i];
        }
    }
    printf ("Min = %i", min);
    
    return 0;
}