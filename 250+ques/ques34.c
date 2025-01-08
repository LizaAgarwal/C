//Find Number Is Armstrong Or Not
#include<stdio.h>
int main() {
    int n;
    printf("enter any number:");
    scanf("%d",&n);
    int remainder;
    int num=0;
    int n1=n;
    while (n1>0){
        remainder=n1%10;
        num=num+(remainder*remainder*remainder);
        n1=n1/10;
    }
    if (num==n){
        printf("number is armstrong");
    }
    else{
        printf("number is not armstrong");
    }
    return 0;
}