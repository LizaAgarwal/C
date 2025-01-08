//print table of the number taken from user using function
#include<stdio.h>

void printtable(int n);

int main() {
    int n;
    printf("enter any number");
    scanf("%d",&n);

    printtable(n);
    return 0;
}

void printtable(int n) {
    for (int i=1; i<=10; i=i+1) {
        printf("%d\n",n*i);
    }
}