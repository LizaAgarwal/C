//Write C program to print gender (Male/Female) program according to given M/F
#include<stdio.h>
int main() {
    char ch;
    printf("enter M/F/m/f");
    scanf("%c",&ch);

    switch(ch){
        case 'M':
        printf("male");
        break;
        case 'F':
        printf("female");
        break;
        case 'f':
        printf("female");
        break;
        case 'm':
        printf("male");
        break;
    }
    return 0;
}