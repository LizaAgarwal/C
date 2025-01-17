//print ASCII value of a character
#include<stdio.h>
int main() {
    char ch;
    printf("enter a character:");
    scanf("%c",&ch);
    printf("ASCII value of the character %c is %d",ch,ch);
    return 0;
}