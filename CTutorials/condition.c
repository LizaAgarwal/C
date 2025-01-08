//if-else statement
#include<stdio.h>

int main() {

    int age;
    printf("enter age");
    scanf("%d",&age);
    
    if (age>18) {
        printf("he is an adult");
    }
    else {
        printf("he is not an adult");
    }
    return 0;
}