//Input all sides of a triangle and check whether the triangle is valid or not.
#include<stdio.h>
int main() {
    float a,b,c;
    printf("enter the sides of the traingle:");
    scanf("%f%f%f",&a,&b,&c);
    if (a+b>c && b+c>a && c+a>b){
        printf("triangle is valid");
    }
    else{
        printf("triangle is not valid");
    }
    return 0;
}