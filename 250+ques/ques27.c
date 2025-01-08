//Voting Eligibility Checker
#include<stdio.h>
int main() {
    int age;
    printf("enter age of the candidate:");
    scanf("%d",&age);
    if (age>=18){
        printf("one can vote");
    } 
    else{
        printf("one cannot vote");
    }
    return 0;
}