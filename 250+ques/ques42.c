//using while loop
#include<stdio.h>
int main() {
    int prev,curr;
    int len=0;
    int max_len=0;
    printf("enter the number:");
    scanf("%d",&prev);
    if (prev!=-1){
        len=1;
        printf("enter another number:");
        scanf("%d",&curr);
    }
    while(curr!=-1){
        if (prev<curr){
            len=len+1;
        }
        else{
            if (max_len<len){
                max_len=len;
            }
            len=1;
        }
        prev=curr;
        printf("again enter the current number:");
        scanf("%d",&curr);
    }
    if (max_len<len){
        max_len=len;
    }
    printf("%d",max_len);
    return 0;
}