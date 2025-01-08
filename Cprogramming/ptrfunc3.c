//calculate the sum,product and average of two numbers and print these three in main function
#include<stdio.h>

int dowork(int a, int b, int *sum, int *prod, int *avg);

int main() {
    int a=5;
    int b=3;
    int sum, prod, avg;
    dowork(a, b, &sum, &prod, &avg);
    printf("sum=%d, prod=%d, avg=%d\n",sum,prod,avg);
    return 0;
}

int dowork(int a, int b, int *sum, int *prod, int *avg) {
    *sum= a+b;
    *prod= a*b;
    *avg= (a+b)/2;
}