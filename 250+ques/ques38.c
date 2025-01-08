//print the calender of a month input by the user
#include<stdio.h>
int main() {
    int a;
    printf("enter the no of days in a month:");
    scanf("%d",&a);
    int b;
    printf("enter the first day in the month:");
    scanf("%d",&b);
    for (int i=1;i<b;i++){
        printf(" ");
    }
    for (int i=1;i<=a;i++){
        printf("%d\t",i);
        if((b+i-1)%7==0){
            printf("\n");
        }
    }
    return 0;
}