//find the area of a triangle
#include<stdio.h>
int main() {
    float b,h;
    printf("enter base and height of a triangle:");
    scanf("%f%f",&b,&h);
    float a=0.5*b*h;
    printf("area of the triangle is:%f",a);
    return 0;
}