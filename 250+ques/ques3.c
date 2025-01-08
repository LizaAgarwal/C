//calculate Simple Interest(SI)
#include<stdio.h>
int main() {
    int p,r,t;
    printf("enter principal:");
    scanf("%d",&p);
    printf("enter rate:");
    scanf("%d",&r);
    printf("enter time:");
    scanf("%d",&t);
    float SI=(float)(p*r*t)/100;
    printf("simple interest is %f",SI);
    return 0;
}