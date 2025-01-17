//calculate simple interest
#include<stdio.h>
int main() {
    int p;
    printf("enter principle");
    scanf("%d",&p);

    int r;
    printf("enter rate");
    scanf("%d",&r);

    int t;
    printf("enter time");
    scanf("%d",&t);

    float i;
    i=(p*r*t)/100;

    printf("simple interest is %f",i);
    return 0;
}