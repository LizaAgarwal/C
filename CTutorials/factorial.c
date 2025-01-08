//find the factorial of the given number
#include<stdio.h>

int main() {
    int n;
    printf("enter number");
    scanf("%d",&n);

    int fact=1;
    for (int i=n; i>=1; i=i-1) {
        fact= fact*i;
    }
    printf("%d",fact);
    return 0;
}