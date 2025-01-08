//check if a number is a natural no or not
#include<stdio.h>

int main() {

    int num;
    printf("enter any number");
    scanf("%d",&num);

    if (num>=1) {
        printf("natural number");
    }
    else {
        printf("not a natural number");
    }
    return 0;
}