//Write C program to copy one string to another string
#include<stdio.h>
int main() {
    char str1[10],str2[10];
    char *ptr1=str1;
    char *ptr2=str2;
    printf("enter the characters in the string 1:");
    gets(str1);
    while(*(ptr2++)=*(ptr1++));
    printf("string 1 is:%s\n",str1);
    printf("string 2 is :%s\n",str2);
    return 0;
}