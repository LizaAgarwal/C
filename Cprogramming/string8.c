//check if a given character is present in a string or not
#include<stdio.h>

void check(char str[], char ch);

int main() {
    char str[]={"liza agarwal"};
    char ch;
    check(str,'a');
    return 0;

}

void check(char str[], char ch) {
    for (int i=0; str[i]!='\0';i++){
        if (str[i]== ch){
            printf("the given character is present");
            return;

        }
    }
    printf("the given character is not present");
}