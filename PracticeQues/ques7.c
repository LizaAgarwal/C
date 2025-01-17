//write a program to find the sum of 1st and last digit of any number
#include<stdio.h>
int main() {
    int n;
    printf("enter number:");
    scanf("%d",&n);

    int last_digit= n%10;

    int first_digit;
    while(n>=10){
        n=n/10;
        first_digit=n;
    }

    int sum;
    sum=first_digit+last_digit;
    printf("%d",sum);
    return 0;
}