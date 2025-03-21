#include<stdio.h>
int fact(int);
int main()
{
    int num, f;
    scanf("%d", &num);
    f= fact(num);
    return 0;
}

int fact(int aj)
{
    if(aj==1 || aj==0)
        return 1;
    else
        return (aj*fact(aj-1));
}