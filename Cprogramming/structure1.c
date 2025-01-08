//write a program to store the data of three students
#include<stdio.h>
#include<string.h>

struct student {
    int roll;
    float cgpa;
    char name[100];
};

int main() {
    struct student s1;
    s1.roll=607;
    s1.cgpa=9.4;
    strcpy(s1.name,"liza");

    printf("name is=%s\n",s1.name);
    printf("roll is=%d\n",s1.roll);
    printf("cgpa is=%f\n",s1.cgpa);

    struct student s2;
    s2.roll=608;
    s2.cgpa=9.5;
    strcpy(s2.name,"kashish");

    printf("name is=%s\n",s2.name);
    printf("roll is=%d\n",s2.roll);
    printf("cgpa is=%f\n",s2.cgpa);

    struct student s3;
    s3.roll=609;
    s3.cgpa=9.6;
    strcpy(s3.name,"tarang");

    printf("name is=%s\n",s3.name);
    printf("roll is=%d\n",s3.roll);
    printf("cgpa is=%f\n",s3.cgpa);

    return 0;
}