#include<stdio.h>

int main()
{
    int c, d, n, a[100], b[100];
    scanf("%d", &n);
    
    for(c = 0; c < n; c++)
        scanf("%d", &a[c]);

    for(c = n-1, d = 0; c >= 0; c--, d++)
        b[d] = a[c];

    for(c = 0; c < n; c++)
        a[c] = b[c];

    for(c = 0; c < n; c++)
        printf("%d", a[c]);
    return 0;
}