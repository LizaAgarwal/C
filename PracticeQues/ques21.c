//Write C program to check even or odd number using switch case
#include<stdio.h>
int main() {
    int n;
    printf("enter n");
    scanf("%d",&n);

    switch(n%2){
        case 0:
        printf("even");
        break;

        case 1:
        printf("odd");
        break;

    }
    return 0;
}