//create a string first name and last name to store the details of user and print all the characters using the loop
#include<stdio.h>

void string(char arr[]);

int main() {
    char first_name[]= {"Liza"};
    char last_name[]= {"Agarwal"};
    string(first_name);
    string(last_name);
    return 0;
}

void string(char arr[]) {
    for (int i=0; arr[i]!='\0'; i++){
        printf("%c",arr[i]);
    }
    printf("\t");
}

