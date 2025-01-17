//write a program to check whether a number is armstrong or not
//armstrong number are those whose sum of the cube of the digits is equal to the number itself 
#include<stdio.h>
int main() {
    int n;
    printf("enter n");
    scanf("%d",&n);

    int sum=0;
    int r;
    for (int i=n; i>0;i=i/10){
        r=i%10;
        sum=sum+(r*r*r);
    }
    printf("%d",sum);

    if(sum==n){
        printf("armstrong");
    }
    else{
        printf("not armstrong");
    }
    return 0;

}