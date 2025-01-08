//write 2 functions- one to print hello and other to print goodbye
#include<stdio.h>

void printhello();
void printgoodbye();

int main() {
    printhello();
    printgoodbye();
    return 0;
}

void printhello() {
    printf("Hello!\n");
}

void printgoodbye() {
    printf("Goodbye!");
}