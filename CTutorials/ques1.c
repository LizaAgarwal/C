//write a program to check if a student passed or failed (marks>30 is pass and marks<=30 is fail)
#include<stdio.h>

int main() {

    int marks;
    printf("enter marks of student");
    scanf("%d",&marks);

    if (marks>=0 && marks<=30) {
        printf("student failed");
    }
    else if (marks>30 && marks<=100) {
        printf("student passed");
    }
    else {
        printf("wrong marks");
    }
    return 0;
}
