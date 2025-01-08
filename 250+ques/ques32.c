//Reverse A given Number
#include<stdio.h>
int main() {
    int n;
    printf("enter a number:");
    scanf("%d",&n);
    int remainder;
    int rev=0;
    while (n>0){
        remainder=n%10;
        rev=rev*10+remainder;
        n=n/10;
    }
    printf("reversed number is %d",rev);
    return 0;
}