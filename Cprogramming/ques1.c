//write a program to convert celsius to fahrenheit
#include<stdio.h>

float fah(float celsius);

int main() {
    float celsius= 0.0;
    printf("fahrenheit conversion of given celsius is %f",fah(celsius));
    return 0;
}

float fah(float celsius) {
    return celsius* 9.0/5.0 +32;
}