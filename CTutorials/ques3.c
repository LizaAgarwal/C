//write a program to check if a char accepted from the user is uppercase or not
#include<stdio.h>

int main() {

    char ch;
    printf("enter any character");
    scanf("%c",&ch);

    if (ch>='A' && ch<='Z') {
        printf("uppercase");
    }
    else if (ch>='a' && ch<'z') {
        printf("lowercase");
    }
    else {
        printf("not an english alphabet");
    }
    return 0;
}