//write a program to reverse a number using while loop
#include<stdio.h>
int main() {
    int n=123;
    int rev=0;
    while(n>0){
        rev=rev*10;
        rev=rev+(n%10);
        n=n/10;
    }
    printf("%d",rev);
    return 0;
}