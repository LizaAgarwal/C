//write a c program to find area and circumference of a circle
#include<stdio.h>

int main(){
    float rad;
    printf("enter radius:");
    scanf("%f",&rad);
    printf("area of a circle is %f\n", 3.14*rad*rad);
    printf("circumference of a circle is %f\n",2*3.14*rad);
    return 0;
}