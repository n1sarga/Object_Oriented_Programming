#include<stdio.h>
void printFibo(int );

int main()
{
    int k, n;
    long int i = 0, j = 1;
    scanf("%d", &n);
    printf("%d ", 1);
    printFibo(n);
}

void printFibo(int aj)
{
    static long int first = 0, second = 1, sum;
    if(aj > 1)
    {
        sum = first + second;
        first = second;
        second = sum;
        printf("%ld ", sum);
        printFibo(aj-1);
    }
    else
    {
        printf("\n");
    }
}