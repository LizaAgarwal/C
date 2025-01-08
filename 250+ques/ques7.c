//Factorial of a Given Number
#include<stdio.h>
int main() {
    int n;
    printf("enter any number");
    scanf("%d",&n);
    int fact=1;
    for (int i=1;i<=n;i++){
        fact=fact*i;
    }
    printf("factorial is:%d",fact);
    return 0;
}