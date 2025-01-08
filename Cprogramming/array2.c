//write a program to enter price of three items and print their final cost with gst

#include<stdio.h>

int main() {
    float price[3];
    printf("enter 1st price");
    scanf("%f",&price[0]);

    printf("enter 2nd price");
    scanf("%f",&price[1]);

    printf("enter 3rd price");
    scanf("%f",&price[2]);

    printf("total price1 is %f\n", price[0]+0.18*price[0]);
    printf("total price2 is %f\n", price[1]+0.18*price[1]);
    printf("total price3 is %f\n", price[2]+0.18*price[2]);
    return 0;
}