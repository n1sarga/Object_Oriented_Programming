#include<stdio.h>

int main()
{
    float a, b, c;
    scanf("%f%f%f", &a, &b, &c);

    if(a >= b && a >= c)
    {
        printf("\n\nLargest number = %.3f ", a);
    }
    else if(b >= a && b >= c)
    {
        printf("\n\nLargest number is = %.3f", b);
    }
    else
    {
        printf("\n\nLargest number is = %.3f", c);
    }
    return 0;
}