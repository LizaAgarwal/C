//Input month number and print number of days in that month.
#include<stdio.h>
int main() {
    int n;
    printf("enter month number from 1-12:");
    scanf("%d",&n);
    if (n==1){
        printf("31 days");
    }
    else if(n==2){
        printf("30 days");
    }
    else if(n==3){
        printf("31 days");
    }
    else if(n==4){
        printf("30 days");
    }
    else if(n==5){
        printf("31 days");
    }
    else if(n==6){
        printf("30 days");
    }
    else if(n==7){
        printf("31 days");
    }
    else if(n==8){
        printf("31 days");
    }
    else if(n==9){
        printf("30 days");
    }
    else if(n==10){
        printf("31 days");
    }
    else if(n==11){
        printf("30 days");
    }
    else{
        printf("31 days");
    }
    return 0;
}