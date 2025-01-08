//find the salted form of a password entered by user is the salt is "123" & added at the end
#include<stdio.h>
#include<string.h>

void salting(char old_pass[]);

int main() {
    char old_pass[100];
    scanf("%s",old_pass);
    salting(old_pass);
    return 0;
}

void salting(char old_pass[]) {
    char salt[]="123";
    char new_pass[100];
    strcpy(new_pass,old_pass);
    strcat(new_pass,salt);
    puts(new_pass);
}