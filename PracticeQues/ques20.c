//Write C program to create calculator using switch Statement
#include<stdio.h>
int main() {
    char operators;
    printf("enter operators(+,-,*,/):");
    scanf("%c",&operators);

    float firstnum;
    printf("enter 1st operand:");
    scanf("%f",&firstnum);

    float secondnum;
    printf("enter 2nd operand:");
    scanf("%f",&secondnum);

    switch(operators){
        case '+':
        printf("%f+%f=%f",firstnum,secondnum,firstnum+secondnum);
        break;
        case '-':
        printf("%f-%f=%f",firstnum,secondnum,firstnum-secondnum);
        break;
        case '*':
        printf("%f*%f=%f",firstnum,secondnum,firstnum*secondnum);
        break;
        case '/':
        printf("%f/%f=%f",firstnum,secondnum,firstnum/secondnum);
        break;
        default:
        printf("enter valid operator");
    }
    return 0;
    
}