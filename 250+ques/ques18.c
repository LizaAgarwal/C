//Uppercase, Lowercase, Special Character, or Digit
#include<stdio.h>
int main() {
    char ch;
    printf("enter any character:");
    scanf("%c",&ch);
    if (ch>=97 && ch<=122){
        printf("%c is lowercase",ch);
    }
    else if(ch>=65 && ch<=90){
        printf("%c is uppercase",ch);
    }
    else if(ch>=48 && ch<=57){
        printf("%c is a digit",ch);
    }
    else{
        printf("%c is a special character",ch);
    }
    return 0;
}