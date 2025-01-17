//Write C Program to add two numbers using pointers
#include<stdio.h>
int main() {
    int num1,num2;
    int *ptr1=&num1;
    int *ptr2=&num2;
    printf("enter two numbers:");
    scanf("%d%d",ptr1,ptr2);
    int sum=*ptr1+*ptr2;
    printf("sum of two numbers is %d",sum);
    return 0;
    
}