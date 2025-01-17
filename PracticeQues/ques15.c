//write a program to check whether a given number is primne or not using for loop
#include<stdio.h>
int main() {
    int n;
    printf("enter n");
    scanf("%d",&n);

    int f=0;
    for (int i=2;i<=n/2;i++){
        if (n%i==0){
            f=1;
            break;
        }
    }
    if (f==0){
        printf("prime no");
    }
    else{
        printf("not a prime no");
    }
    return 0;
}