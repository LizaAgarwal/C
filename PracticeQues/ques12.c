//write a program to calculate power using for loop
#include<stdio.h>
int main(){
    int base;
    printf("enter base");
    scanf("%d",&base);

    int exponent;
    printf("enter exponent");
    scanf("%d",&exponent);

    int power=1;
    for (int i=1;i<=exponent;i++){
        power=power*base;
    }
    printf("%d",power);
    return 0;
}