//write a program to find armstrong numbner between 1 to n
#include<stdio.h>
int main() {
    int n;
    printf("enter n");
    scanf("%d",&n);

    int sum=0;
    int num;
    int num1;
    int last_digit;
    printf("armstrong numbers are\n");
    for (int i=1;i<=n;i++){
        num=i;
        num1=i;
    }

    while (num1>0){
        num1=num1/10;
        

    }
   
    while (num>0){
        last_digit=num%10;
        sum= sum + (last_digit*last_digit*last_digit);
        num=num/10;
    }

    if (sum==num1){
        printf("%d\n",sum);
    }
    return 0;
}