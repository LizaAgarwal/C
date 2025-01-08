//print numbers from 1 to n(take n from the user)
#include<stdio.h>

int main() {
    int n;
    printf("enter any number");
    scanf("%d",&n);

    int i=1;
    while (i<=n) {
        printf("%d\n",i);
        i=i+1;
    }
    return 0;

}