//find the LCM of two numbers
#include<stdio.h>
int main() {
    int n1,n2;
    printf("enter two numbers:");
    scanf("%d%d",&n1,&n2);
    int max=(n1>n2)?n1:n2;
    while(1){
        if ((max%n1==0)&&(max%n2==0)){
            printf("LCM=%d",max);
            break;
        }
        ++max;
    }
    return 0;
}