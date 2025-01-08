//Count Number of Digits of an Integer
#include<stdio.h>
int main() {
    int n;
    printf("enter any number:");
    scanf("%d",&n);
    int count=0;
    while(n>0){
        count++;
        n=n/10;
    }
    printf("no. of digits=%d",count);
    return 0;
}