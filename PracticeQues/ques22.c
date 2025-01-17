//Write C program to check vowel or consonant using switch case
#include<stdio.h>
int main() {
    char n;
    printf("enter n");
    scanf("%c",&n);

    switch(n){
        case 'a':
        printf("vowel");
        break;
        case 'e':
        printf("vowel");
        break;
        case 'i':
        printf("vowel");
        break;
        case 'o':
        printf("vowel");
        break;
        case 'u':
        printf("vowel");
        break;
        case 'U':
        printf("vowel");
        break;
        case 'A':
        printf("vowel");
        break;
        case 'E':
        printf("vowel");
        break;
        case 'I':
        printf("vowel");
        break;
        case 'O':
        printf("vowel");
        break;
        default:
        printf("consonant");
    }
    return 0;
}