//write a program to check whether a given number is primne or not using while loop
#include<stdio.h>
int main() {
    int n;
    printf("enter n");
    scanf("%d",&n);

    int i=2;
    int f=0;
    while (i<=n/2){
        if (n%i==0){
            f=1;
            break;
        }
        i++;
    }
    if (f==0){
        printf("prime no");
    }
    else{
        printf("not a prime no");
    }
    return 0;
}