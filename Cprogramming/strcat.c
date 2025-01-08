//strcat concatenates first string with the second string

#include<stdio.h>
#include<string.h>

int main() {
    char first_str[100]="Hello ";
    char sec_str[]= "World";
    strcat(first_str,sec_str);
    puts(first_str);
    return 0;

}