//check whether a number is palindrome or not
#include<stdio.h>
int main() {
    int n;
    printf("enter the number:");
    scanf("%d",&n);
    int remainder;
    int rev=0;
    int n1=n;
    while(n1>0){
        remainder=n1%10;
        rev=rev*10+remainder;
        n1=n1/10;
    }
    if (rev==n){
        printf("number is palindrome");
    }
    else{
        printf("number is not palindrome");
    }
    return 0;
}