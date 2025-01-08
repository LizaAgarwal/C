//read integers until a non-digit is found and find the largest of the positive integers using loop
#include<stdio.h>
int main() {
    int a;
    int max=-1;
    while(scanf("%d",&a)==1){
        if (a<0){
            continue;
        }
        if (max<a){
            max=a;
        }
    }
    printf("max is %d",max);
    return 0;
}