//using do while loop
#include<stdio.h>
int main() {
    int prev,curr;
    int len=1;
    int max_len=1;
    printf("enter the number:");
    scanf("%d",&prev);
    if (prev!=-1){
        do{
            printf("print another number:");
            scanf("%d",&curr);
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
        }
        while (curr!=-1);
    }
    if (max_len<len){
        max_len=len;
    }
    printf("%d",max_len);
    return 0;
}