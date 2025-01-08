//write a program to check whether a number is divisible by 2 or not
#include<stdio.h>

int main() {

    int a;
    printf("enter a number:");
    scanf("%d",&a);

    if (a%2==0){
        printf("number is divisible be 2");
    }
    else{
        printf("number is not divisible by 2");
    }
    return 0;
}