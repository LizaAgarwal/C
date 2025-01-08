//calculate the compound interest
#include<stdio.h>
#include<math.h>
int main() {
    int p,r,t;
    printf("enter principal:");
    scanf("%d",&p);
    printf("enter rate:");
    scanf("%d",&r);
    printf("enter time:");
    scanf("%d",&t);
    float CI=(float)p*pow((1+r/100),t);
    printf("compound interest is %f",CI);
    return 0;
}