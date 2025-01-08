#include<stdio.h>

int main() {

    int marks[3];
    printf("enter marks of phy");
    scanf("%d",&marks[0]);

    printf("enter marks of chem");
    scanf("%d",&marks[1]);

    printf("enter marks of bio");
    scanf("%d",&marks[2]);

    printf("phy=%d, chem=%d, bio=%d",marks[0],marks[1],marks[2]);
    return 0;
}