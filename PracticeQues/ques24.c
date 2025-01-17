//Write C Program to find maximum number between two numbers using switch case
#include<stdio.h>
int main() {
    int n1,n2;
    printf("enter n1,n2");
    scanf("%d%d",&n1,&n2);

   switch(n1>n2){
    case 0:
    printf("%d is maxm",n2);
    break;

    case 1:
    printf("%d is maxm",n1);
    break;
   }
   return 0;
}