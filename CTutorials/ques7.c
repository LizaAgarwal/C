//keep taking numbers from user until the user prints an odd number
#include<stdio.h>

int main() {
    int n;
    while(1){
        printf("enter the number:");
        scanf("%d",&n);
        printf("%d\n",n);
        if (n%2!=0){
            break;
        }
    }

    return 0;

}