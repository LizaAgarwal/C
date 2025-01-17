//write a program to calculate power using while loop
#include<stdio.h>
int main() {
    int base;
    printf("enter base");
    scanf("%d",&base);

    int exponent;
    printf("enter exponent");
    scanf("%d",&exponent);

    int power=1;
    int i=1;

    while (i<=exponent){
        power=power*base;
        i++;
    }
    printf("%d",power);
    return 0;

}