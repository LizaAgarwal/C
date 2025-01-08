//ask the user to enter their full name and print it back to them
//scanf cannot input multiword string with spaces
//use fgets() for input and puts() for output

#include<stdio.h>

int main() {
    char full_name[100];
    printf("enter ur full name");
    fgets(full_name,100,stdin);
    puts(full_name);
    return 0;
}