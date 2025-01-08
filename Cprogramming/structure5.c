//passing structure to function
#include<stdio.h>

struct student{
    char name[100];
    int roll;
    float cgpa;
};

void student_info(struct student s1);

int main() {
    struct student s1={"liza",607,8.9};
    student_info(s1);
    return 0;
}

void student_info(struct student s1) {
    printf("student's information is:\n");
    printf("name is %s\n",s1.name);
    printf("roll is %d\n",s1.roll);
    printf("cgpa is %f\n",s1.cgpa);
    
}

