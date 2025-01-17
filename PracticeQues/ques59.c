//calculate sum of 1-x^2/2!+x^4!-x^6/6!+x^8/8!-x^10/10!
#include<stdio.h>
int main() {
    float x,x2,x4,x6,x8,x10;
    scanf("%f",&x);
    printf("x=%f\n",x);
    x2=x*x;
    x4=x2*x2/24.0;
    x6=x4*x2/30.0;
    x8=x6*x2/56.0;
    x10=x8*x2/90.0;
    float sum= 1.0-0.5*x2+x4-x6+x8-x10;
    printf("sum=%f",sum);
    return 0;
}