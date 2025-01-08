//Calculate profit or loss.
#include<stdio.h>
int main(){
    int cp,sp;
    printf("enter the cost price:");
    scanf("%d",&cp);
    printf("enter the selling price:");
    scanf("%d",&sp);
    if (sp>cp){
        printf("profit is %d\n",sp-cp);
    }
    else if(cp>sp){
        printf("loss is %d\n",cp-sp);
    }
    else{
        printf("no profit no loss");
    }
    return 0;
}