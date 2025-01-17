//write a program to reverse a number using for loop
#include<stdio.h>
int main() {
    int n=123;
    int rev;
    for(rev=0; n>0;n=n/10){
        rev=rev*10;
        rev=rev+(n%10);
    }
    printf("%d",rev);
    return 0;
}