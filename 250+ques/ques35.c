//display fibonmacci series
#include<stdio.h>
int main() {
    int a=0;
    int b=1;
    int sum=a+b;
    int n;
    printf("enter any number:");
    scanf("%d",&n);
    printf("fibonacci series is %d\t%d\t",a,b);
    while(sum<=n){
        printf("%d\t",sum);
        a=b;
        b=sum;
        sum=a+b;
    }
    return 0;

}