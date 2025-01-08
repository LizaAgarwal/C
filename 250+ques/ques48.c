//find the pythagorian triplets from the given number of integers input from the user
//pythagorian triplets are the consecutive non-negative integers
#include<stdio.h>
int main() {
    int pprev,prev,curr;
    int n;
    int count=0;
    printf("enter the no of integers to be printed:");
    scanf("%d",&n);
    for (int i=0;i<n;i++){
        scanf("%d",&curr);
        if (curr<=0){
            continue;
        }
        if (count==0){
            pprev=curr;
            count=1;
        }
        else if(count==1){
            prev=curr;
            count=2;
        }
        else if(pprev*pprev + prev*prev == curr*curr){
            printf("%d%d%d",pprev,prev,curr);
        }
        pprev=prev;
        prev=curr;
    }
    return 0;
}