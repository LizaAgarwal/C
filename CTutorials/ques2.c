//write a program to give grades to a student 
//(marks<30 is C, 30<=marks<70 is B, 70<=marks<90 is A,90<=marks<=100 is A+)
#include<stdio.h>

int main() {

    int marks;
    printf("enter marks of a student");
    scanf("%d",&marks);

    if (marks<30) {
        printf("Grade is C");
    }
    else if (marks>=30 && marks<70) {
        printf("Grade is B");
    }
    else if (marks>=70 && marks<90) {
        printf("Grade is A");
    } else {
        printf("Grade is A+");
    }
    return 0;
}
