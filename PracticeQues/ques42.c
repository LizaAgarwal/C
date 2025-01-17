//Write a C program to Store Information in Structure and Display it
#include<stdio.h>
struct student{
    char name[100];
    int roll;
    float cgpa;
};

int main() {
    struct student s1={"liza",607,9.75};
    printf("name is:%s\n",s1.name);
    printf("roll is:%d\n",s1.roll);
    printf("cgpa is:%f\n",s1.cgpa);
    return 0;
}