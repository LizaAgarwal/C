//find area and circumference of a circle
#include<stdio.h>
int main() {
    float r;
    printf("enter radius of the circle:");
    scanf("%f",&r);
    float a=3.14*r*r;
    float c=2*3.14*r;
    printf("area of the circle is:%f\n",a);
    printf("circumference of the circle is:%f",c);
    return 0;
}