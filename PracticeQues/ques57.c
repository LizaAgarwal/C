//Write C program to Concatenate Two Strings Using Pointers
#include<stdio.h>
int main() {
    char str1[10],str2[10];
    char *ptr1=str1;
    char *ptr2=str2;
    printf("enter charcters in string 1:");
    gets(str1);
    printf("enter charcters in string 2:");
    gets(str2);
    //moving till the last of str1
    while(*(++ptr1));
    //copying str2 to str1
    while(*(ptr1++)=*(ptr2++));
    printf("concatenated string is %s",str1);
    return 0;
}