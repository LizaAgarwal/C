//Check whether the triangle is an equilateral, isosceles or scalene triangle.
#include<stdio.h>
int main() {
    float a,b,c;
    printf("enter the sides of a triangle:");
    scanf("%f%f%f",&a,&b,&c);
    if (a==b && b==c){
        printf("triangle is an equilateral");
    }
    else if (a==b||b==c||c==a){
        printf("triangle is an isosceles");
    }
    else{
        printf("triangle is a scalene");
    }
    return 0;
}