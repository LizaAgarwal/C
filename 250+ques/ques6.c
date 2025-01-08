//Converting Temperature Celsius into Fahrenheit
#include<stdio.h>
int main() {
    float c;
    printf("enter the temp in celcius:");
    scanf("%f",&c);
    float f=(c*9/5)+32;
    printf("%f celcius=%f fahrenheit",c,f);
    return 0;

}