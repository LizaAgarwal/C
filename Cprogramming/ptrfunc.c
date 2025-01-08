//call by reference: passing address of the variable as an argument
#include<stdio.h>

void square(int *n);

int main() {
    int n= 4;
    square(&n);
    printf("number is %d\n", n);
    return 0;
}

void square(int *n) {
    *n=(*n)*(*n);
    printf("square is %d\n", *n);
}