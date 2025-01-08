//print table of the number taken from user
#include<stdio.h>

int main() {
    int n;
    printf("enter number");
    scanf("%d",&n);

    for (int i=1; i<=10; i=i+1) {
        printf("%d\n",n*i);
    }
    return 0;
}