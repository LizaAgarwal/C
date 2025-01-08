//write a recursive funtion to print the factorial of n natural numbers
#include<stdio.h>

int fact(int n);

int main() {
    int n=5;
    printf("%d",fact(n));
    return 0;
}

int fact(int n) {
    if (n==0) {
        return 1;
    }
    int factNm1= fact(n-1);
    int factN= factNm1* n;
    return factN;
}