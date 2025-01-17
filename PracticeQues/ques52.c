//Write C program to print ASCII values of all characters using loop.
#include<stdio.h>
int main() {
    for (char ch='a';ch<='z';ch++){
        printf("ascii value of %c is %d\n",ch,ch);
    }
    return 0;
}