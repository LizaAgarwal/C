//Calculate Length of String Using Pointer
#include<stdio.h>
int main() {
    char str[10];
    char *ptr=str;
    printf("enter the characters in the string:");
    gets(str);
    int i=0;
    while(*ptr!='\0'){
        i++;
        ptr++;
    }
    printf("length of the string is %d",i);
    return 0;
}