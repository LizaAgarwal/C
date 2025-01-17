//Write C program to print day of week name using switch case
#include<stdio.h>
int main() {
    int weeknumber;
    printf("enter weeknumber from 1-7");
    scanf("%d",&weeknumber);

    switch(weeknumber){
        case 1:
        printf("monday");
        break;
        case 2:
        printf("tuesday");
        break;
        case 3:
        printf("wednesday");
        break;
        case 4:
        printf("thursday");
        break;
        case 5:
        printf("friday");
        break;
        case 6:
        printf("saturday");
        break;
        case 7:
        printf("sunday");
        break;
        default:
        printf("invalid week number");
    }
    return 0;
    }
