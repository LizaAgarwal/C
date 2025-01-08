//write a function that prints namaste if user is indian and print Bonjour if he is french
#include<stdio.h>

void namaste();
void bonjour();

int main() {
    char ch;
    printf("enter i for indian and f for french");
    scanf("%c",&ch);

    if (ch=='i') {
        namaste();
    }
    else {
        bonjour();
    }
    return 0;
}

void namaste() {
    printf("Namaste");
}
void bonjour() {
    printf("Bonjour");
}