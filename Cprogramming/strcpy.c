//strcpy copies the value of old string to new string
#include<stdio.h>
#include<string.h>

int main () {
    char old_str[]= {"liza"};
    char new_str[]= {"lovely"};
    strcpy(old_str, new_str);
    puts(old_str);
    return 0;
}