//write a program to calculate the product of digits of a number
#include<stdio.h>
int main() {
    int num;
    printf("enter num");
    scanf("%d",&num);

    int product=1;
    while(num>0){
        product=product*(num%10);
        num=num/10;
    }
    printf("%d",product);
    return 0;
}