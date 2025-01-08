//Input angles of a triangle and check whether the triangle is valid or not.
#include<stdio.h>
int main() {
    float a,b,c,sum;
    printf("enter the angles of a triangle:");
    scanf("%f%f%f",&a,&b,&c);
    sum=a+b+c;
    if (sum==180){
        printf("triangle is valid");
    }
    else{
        printf("triangle is not valid");
    }
    return 0;
}