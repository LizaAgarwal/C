//C Program to perform all arithmetic operations
#include<stdio.h>
int main() {
    int num1,num2;
    printf("enter 1st number:");
    scanf("%d",&num1);

    printf("enter 2nd number:");
    scanf("%d",&num2);

    int a=num1+num2;
    printf("sum is %d",a);
    int b=num1-num2;
    printf("difference is %d",b);
    int c=num1*num2;
    printf("product is %d",c);
    int d=num1%num2;
    printf("remainder is %d",d);
    float e=(float)num1/num2;
    printf("division is %f",e);
    return 0;
}