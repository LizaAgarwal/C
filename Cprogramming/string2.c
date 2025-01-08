//ask the user to enter the first name and print it back to them

#include<stdio.h>

int main() {
    char first_name[39];
    printf("enter your first name");
    scanf("%s",first_name);

    printf("%s",first_name);
    return 0;

}