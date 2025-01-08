//will the address of the two outcomes be same by using call by reference? Yes
#include<stdio.h>

void printaddress(int *n);

int main() {
    int n=4;
    printaddress(&n);
    printf("address of n is %p\n",&n);
    return 0;
}

void printaddress(int *n) {
    printf("address of n is %p\n",n);
}